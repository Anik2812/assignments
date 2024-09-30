create database Prac_7;
use Prac_7;

create table employee (eid int primary key, ename varchar(50), address varchar(100), dept varchar(50), salary int);
insert into employee values (1, 'ram', 'chd', 'hr', 10000), (2, 'amit', 'delhi', 'mrkt', 20000), (3, 'ravi', 'pune', 'hr', 30000), (4, 'nitin', 'bang', 'mrkt', 40000), (5, 'varun', 'chd', 'it', 50000);
create table project (eid int, pid varchar(10), pname varchar(50), location varchar(50), foreign key (eid) references employee(eid));
insert into project values (1, 'p1', 'iot', 'bang'), (5, 'p2', 'big data', 'delhi'), (3, 'p3', 'retail', 'mumbai'), (4, 'p4', 'android', 'hyderabad');
select max(salary) as max_salary from employee;
select ename from employee where salary = (select max(salary) from employee);
select max(salary) as second_highest_salary from employee where salary < (select max(salary) from employee);
select ename from employee where salary = (select max(salary) from employee where salary < (select max(salary) from employee));
select dept, count(*) as employee_count from employee group by dept;
select ename from employee where dept in (select dept from employee group by dept having count(*) < 2);
select ename from employee where dept in (select dept from employee group by dept having count(*) < 2);
select e.dept, e.ename, e.salary from employee e inner join (select dept, max(salary) as max_salary from employee group by dept) m on e.dept = m.dept and e.salary = m.max_salary;
select distinct e.ename from employee e inner join project p on e.eid = p.eid;
select e.* from employee e where exists (select 1 from project p where p.eid = e.eid);