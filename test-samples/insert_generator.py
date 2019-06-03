tableName = "student"
other = "'haha', 25, 'M'"
sql_formatter = "insert into {} values ('{}', {});\n"

total = 10_0000

sql_create_table = '''
create table student ( 
    sno char(8),
    sname char(16) unique, 
    sage int,
    sgender char (1), 
    primary key ( sno )
);\n
'''

sql_tail = '''
select * from student where sno = '10000';\n
'''

with open('100_000insert.sql', 'w') as the_file:
    the_file.write(sql_create_table)
    for i in range(total):
        sql = sql_formatter.format(tableName, i, other)
        the_file.write(sql)

    the_file.write(sql_tail)
