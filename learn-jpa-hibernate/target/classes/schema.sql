create table course
(

id bigint not null,
name varchar(50) not null,
author varchar(50) not null,

primary key (id)

);

insert into course(id,name,author)
values(1,'learnAWS','in28Minutes');

select * from course;