create database ibike;

use ibike;

create table bike(
	bid bigint primary key auto_increment,
	status int default 0,
	qrcode varchar(100) default '',
	latitude double,
	longitude double
);

drop table bike;

select * from bike;

insert into bike(bid,status,latitude,longitude) values(1,1,22.3,22.2);

update bike set status=1 where bid=1;