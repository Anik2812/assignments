use BDA_23162121021;
set SQL_SAFE_UPDATES = 0;
select Name from client_master;
select Name, city from client_master;
select Description from product_master where Qty_on_hand != 0; 
select Name from client_master where city = 'Bombay';
select S_name from salesman_master where Sal_Amt = 3000;
select distinct city from client_master;
select sell_price from product_master; 
select sell_price, cost_price from product_master;
select * from product_master order by sell_price desc;


update client_master set city = 'Bombay' where Client_no = 'C002';
update client_master set Bal_due = 1000 where Client_no = 'C001';
select * from client_master;
update product_master set cost_price = 950 where Description = 'Floppies';
select * from product_master;
update salesman_master set city = 'Mumbai';
select * from salesman_master;
delete from salesman_master where Sal_Amt = 3500;
select * from salesman_master;
delete from product_master where Qty_on_hand = 100;
select * from product_master;
delete from client_master where city = 'Tamil Nadu';
select * from client_master;

alter table product_master modify sell_price Numeric(10,2);
select * from product_master;
alter table client_master add telephone int(10);
alter table client_master rename column telephone to contact;
alter table client_master drop contact;
select * from client_master;

create table employee (Column1 int, Column2 varchar(10), Column3 varchar(10), Column4 int);
insert into employee values(1, 'anik', 'okay', 10);
insert into employee values(2, 'this', 'nah', 8);
insert into employee values(3, 'that', 'mate', 7);
insert into employee values(4, 'nope', 'yo', 6);
insert into employee values(5, 'yess', 'buddy', 4);
select * from employee;

drop table employee;
show tables;

rename table salesman_master to sman_mast;
show tables;