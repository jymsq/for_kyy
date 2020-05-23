--48行的代码数据库名字需要修改
-- 50行密码需要修改

--65进入管理员界面需要密码是123

--需要创建5个表
create table lab(
course_name varchar(20) ,
lab_name varchar(20),
teacher_name varchar(20),
class_name varchar(20),
number varchar(20),
lab_time varchar(25)
);

create table class(
id varchar(10),  --这起名的时候起错了，应该是人数，但是代码里面都是id所以说只要把这当成人数就行了，其他不用管。
name varchar(20)
);

create table course(
name varchar(10),
id varchar(10)
);

create table teacher
( id varchar(20),
	name varchar(20),
password varchar(20)
);
create table time(
lab_time varchar(20)
);

