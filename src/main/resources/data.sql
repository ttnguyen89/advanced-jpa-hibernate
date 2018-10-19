insert into course(id, name, last_Updated_Date, creation_Date) 
	values (10001, 'JPA in 50 Steps', sysdate(), sysdate());
insert into course(id, name, last_Updated_Date, creation_Date) 
	values (10002, 'Spring in 50 Steps', sysdate(), sysdate());
insert into course(id, name, last_Updated_Date, creation_Date) 
	values (10003, 'Spring Boot in 1000 Steps', sysdate(), sysdate());
	
	

insert into passport(id, number)
	values(3001, '1111A1');
insert into passport(id, number)
	values(3002, '2222B2');
insert into passport(id, number)
	values(3003, '3333C3');
	

insert into student(id, name, passport_id) 
	values(2001,'Ranga', 3001);
insert into student(id, name, passport_id) 
	values(2002,'Adam', 3002);
insert into student(id, name, passport_id) 
	values(2003,'Jane', 3003);
	

