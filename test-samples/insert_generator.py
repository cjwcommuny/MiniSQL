tableName = "student"
sname = "'test'"
sage = 25
sql_formatter = "insert into {} values ('{}', {}, {}, {});\n"

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
        sgender = "'M'"
        if i % 2 == 0:
            sgender = "'F'"
        sql = sql_formatter.format(tableName, i, sname, i % 60 + 1, sgender)
        the_file.write(sql)

    # the_file.write(sql_tail)
