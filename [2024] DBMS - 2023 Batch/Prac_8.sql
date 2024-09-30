use sakila;
set SQL_SAFE_UPDATES = 0;

create view actors_a as 
select * from actor 
where first_name like 'a%' and last_name like '%a%';

select * from actors_a;

create view actors_desc as 
select * from actor 
order by last_name desc;

select * from actors_desc;

drop view actors_a;
drop view actors_desc;

create view lang_view as 
select language_id, name, last_update 
from language;

select * from lang_view;

insert into lang_view (name, last_update) 
values ('hindi', '2013-07-05 12:23:05');

select * from lang_view;
select * from language;

update lang_view 
set name = 'spanish' 
where name = 'hindi';

select * from lang_view;
select * from language;

delete from lang_view 
where name = 'spanish';

select * from lang_view;
select * from language;

create view lang_check as 
select language_id, name, last_update 
from language 
where last_update = '2006-02-15 05:02:19'
with check option;

insert into lang_check (name, last_update) 
values ('hindi', '2020-07-13 10:00:19');

insert into lang_check (name, last_update) 
values ('hindi', '2006-02-15 05:02:19');

select * from lang_check;
select * from language;

update lang_check 
set last_update = '2020-07-13 10:00:19' 
where name = 'hindi';

select * from lang_check;
select * from language;
