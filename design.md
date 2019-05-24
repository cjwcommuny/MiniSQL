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