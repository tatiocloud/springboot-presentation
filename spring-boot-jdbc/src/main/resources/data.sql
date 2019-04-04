create table person
(
    id       integer       not null,
    name     varchar2(255) not null,
    location varchar2(255),
    birthday timestamp,
    primary key (id)
);

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTHDAY)
VALUES (101,'Ram','London',sysdate);

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTHDAY)
VALUES (102,'Revathi','London',sysdate);

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTHDAY)
VALUES (103,'ABC','London',sysdate);

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTHDAY)
VALUES (104,'XYZ','London',sysdate);

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTHDAY)
VALUES (106,'Robert','London',sysdate);

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTHDAY)
VALUES (107,'Pascal','London',sysdate);

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTHDAY)
VALUES (108,'Scala','London',sysdate);

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTHDAY)
VALUES (109,'DarkAges','London',sysdate);


