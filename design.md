# Design of database

## disk file format design

### General:
    ============================
    Head Region
    ============================
    Catalog Info
    ============================
    Record Info
    ============================
    Index Info
    ============================

### Head Region
    ============================
    Catalog Info Offset (int)
    Record Info Offset (int)
    Index Info  Offset (int)
    ============================

### Catalog Info
    ============================
    Catalog Head
    ============================
    (Table Info)*
    ============================

#### Catalog Head
    ============================
    Number of Tables (int)
    ============================

#### Table Info
    ============================
    Table Name (String)
    Index Offset (int)
    Primary Key Offset (int)
    (Field Definition)+
    ============================

##### Field Definition
    ============================
    Column Name (String)
    Column Type (Type)
    IsUnique (boolean)
    ============================

##### String
    ============================
    Length (int)
    data (byte[Length])
    ============================

###### Type
    ============================
    TypeId (int, float, char(N))
    data? (int)
    ============================

### Record Info
    ============================
    Record Head
    ============================
    (Tuple)*
    ============================

#### Record Head
    ============================
    Number of count (int)
    ============================

#### Tuple
    ============================
    
    ============================



## strategy

catalog, index 总在内存中（给定一个limit）
buffer 开大内存
双线程读写 disk

## 数据结构

index 存储 tuple 相对与所在 table 的相对 offset
catalog, index, table 分开三个文件存储；三个文件的 head 都存储在内存中
default index name: \<primary\>

## 流程设计

### insert tuple

```
add tuple to list and get offset
for all index involved {
    update B+ tree by offset
}
write tuple to block
write data block to file
write index to block
write index block to file
```

### read tuple

```
if condition involves index, for all the index {
    get all the offset satisfied the condition
}
get the intersection of all the offset
fetch all the tuple of the remaining offset
linear search the entries and get the result
```

