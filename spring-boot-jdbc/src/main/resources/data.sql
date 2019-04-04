create table person
(
    id       integer       not null,
    name     varchar2(255) not null,
    location varchar2(255),
    birthday date,
    primary key (id)
);

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTHDAY)
VALUES (101,'Ram','London',sysdate)

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTHDAY)
VALUES (102,'Revathi','London',sysdate)

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTHDAY)
VALUES (103,'Raj','London',sysdate)
