create table bookingroomadmin(
	adminid varchar2(30) PRIMARY KEY,
	adminpassword varchar2(30) not null,
	adminaddress varchar2(50)
);

create table bookingroomclient(
	phonenumber varchar2(30) PRIMARY KEY,
	password varchar2(20) not null,
	name varchar2(20) not null,
	address varchar2(40),
	paytime number,
	live number,
	starttime DATE,
	endtime DATE
	);
drop table bookingroomclient CASCADE CONSTRAINTS;
	create table bookingroomseat(
	seatnumber number PRIMARY KEY,
	seatpartition number,
	starttime DATE,
	endtime DATE,
	adminid varchar2(30)
	);
		
    select * from bookingroomclient;
	
insert into bookingroomseat
create table bookingroompay(
	paynum number primary key,
	phonenumber varchar(30), 
	seatnumber number,
	paytime number);


create sequence bookingseatnum;
		
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');

insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');




insert into bookingroomadmin values(
'admin', 'wkflsdl', 'SMHRD'
);



alter table bookingroomclient add constraint fk_admin_client foreign key(adminid) references bookingroomadmin(adminid);
alter table bookingroomseat add constraint fk_admin_seat foreign key(adminid) references bookingroomadmin(adminid);
alter table bookingroompay add constraint fk_phonenumber foreign key(phonenumber) references bookingroomclient(phonenumber);
alter table bookingroompay add constraint fk_seatnumber foreign key(seatnumber) references bookingroomseat(seatnumber);

update bookingroomclient set paytime = 8 where phonenumber = '010-5096-7148'; -- id에 맞춰서 paytime을 조정하기 위해


alter table bookingroomclient add liveuse number; -- 사용 중이라는 것을 말해주기 위해서

create sequence paynum;

alter table bookingroomseat modify starttime TIMESTAMP;
alter table bookingroomseat modify endtime DATE;
alter table bookingroomseat add livetableuse number;

alter table bookingroomclient modify starttime DATE;
alter table bookingroomclient modify endtime DATE;


alter table bookingroompay modify starttime DATE;
alter table bookingroompay modify endtime DATE;

alter table bookingroomseat add paytime number;


insert into bookingroomclient values('1116', '1234', '끼뮤', '광주', 1, 0, (To_date('20210109202020','YYYY/MM/DD HH24:MI:SS')), (To_date('20210109213030','YYYY/MM/DD HH24:MI:SS')));


alter table bookingroompay add name varchar2(30);


