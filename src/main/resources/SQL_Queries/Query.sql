drop table MENU;       

create table MENU(
	menuId varchar(15) primary key,
	menuName varchar(15),
	category varchar(15),
	type varchar(15),
	cost number(6,2),
	status varchar(15)
);  

select * from MENU;    

insert into MENU values('101','idly','Breakfast','Veg',30,'Available');
insert into menu values('201','chicken','Breakfast','NonVeg',60,'Available');
insert into menu values('202','sambar','Lunch','Veg',60,'NotAvailable');

insert into menu values('509','sambar','Lunch','Veg',60,'NotAvailable');


                                                                                                                                                                                                                                                                                                                                                                                                     