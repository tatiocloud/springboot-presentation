/*
create table course(

    id long not null,
    name varchar2(50) not null,
    primary key (id)
);
*/

// no double quotes in sql script for strings
insert into course(id,name) values ( 101,'Scala for impatient' );
insert into course(id,name) values ( 102,'Java for impatient' );
