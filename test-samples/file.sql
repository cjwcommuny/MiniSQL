create table student ( 
    sno char(8),
    sname char(16) unique, 
    sage int,
    sgender char (1), 
    primary key ( sno )
);

insert into student values ('12345678','wy',22,'M');
insert into student values ('1','lala',22,'M');
insert into student values ('2','haha',25,'F');
insert into student values ('3','cjw',23,'M');
insert into student values ('4','zzz',10,'F');

select * from student where sage > 21 and sgender = 'F';