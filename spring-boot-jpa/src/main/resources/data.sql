/*
create table person
(
    id       integer       not null,
    name     varchar2(255) not null,
    location varchar2(255),
    birthday timestamp,
    primary key (id)
);
*/

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTHDAY)
VALUES (10001,'Ram','London',sysdate);

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTHDAY)
VALUES (10002,'Revathi','London',sysdate);



