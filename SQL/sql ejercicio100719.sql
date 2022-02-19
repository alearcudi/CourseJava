create database empresa;
use empresa;
create table empleado (nDIEMP int(20) primary key not null auto_increment , nomEmp varchar (30), sexEmp varchar (10), fecNac date, fecIncorporacion date,
salEmp int(20), comis varchar (20), codSuc int (10), jefeDI varchar(30), cargo varchar (20), nroDepto int(10));

create table departamento( codDepto int (4), nombreDepto varchar(20), ciudad varchar (20), director varchar(30));
insert into departamento values (1000, "GERENCIA", "CALI", "31.840.269"),(1500, "PRODUCCION", "CALI", "16.211.383"),
(2000, "VENTAS", "CALI","31.178.144"),(3000,"INVESTIGACION","CALI","16.759.060"),(3500, "MERCADEO","CALI","22.222.222"),
(2100, "VENTAS","POPAYAN","31.759.219"),
(2200, "VENTAS","BUGA","768.782"),(2300, "VENTAS", "CARTAGO", "737.689"),(4000,"MANTENIMIENTO", "CALI","333.333.333"),
(4100, "MANTENIMIENTO","POPAYAN","888.888"),(4200,"MANTENIMIENTO","BUGA","11.111.111"),(4300,"MANTENIMIENTO","CARTAGO","444.444");
delete from empleado;
insert into empleado values(31840269,"MARIA ROJAS","F", "1959/01/15"," 1990/05/16", 6250000, 1500000,1,"GERENTE", "NULL", 1000);
insert into empleado values(16211383,"LUIS PEREZ","M", "1956/02/25"," 2000/01/01", 5050000, 0,1,"DIRECTOR", "31840269", 1500);
insert into empleado values (31178144,"ROSA ANGULO","F","1957/03/15","1998/08/16",3250000, 3500000,1,"JEFE DE VENTAS", "31840269",2000);
insert into empleado values(16759060,"DARIO CASAS","M", "1960/04/05","1992/11/01",4500000,500000,1,"INVESTIGDOR","31840269",3000);
insert into empleado values(16759045,"DARIO PEREZ","M", "1963/04/05","1992/12/01",4300000,400000,1,"INVESTIGDOR","31840263",3000);
select * from empleado;
select sum(salEmp + 500000)  from empleado where nroDepto = 3000 ;
select * from empleado where comis>salEmp;
select * from empleado where comis <= salEmp *0.3;
select "nombre:",nomEmp,"Cargo:" , cargo from empleado;
select nomEmp from empleado as nombre; 
select salEmp, comis,nomEmp from empleado where nDIEMP > 19709802;
							
