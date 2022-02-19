/*create database secretaria;
use secretaria;
create table categorias(id int(10), nombre varchar(30));
create table investigadores (id int(10), nombre varchar (30), telefono int(15), domicilio varchar (30));
create table institutos (id int (10), nombre varchar (30));
create table proyectos (id int(10), nombre varchar(30), resolucion int(20));
create table roles (id int(10), nombre varchar (30));
create table subcategorias (id int (10),nombre varchar (30));
describe categorias;
create table notas(id int(10),nombre varchar(3), primary key(id));
drop table notas;
create table fore (id int(2), nombre varchar (3), domicilio varchar (30), primary key (id));
create table tr (idT int(19), nombre varchar(30), telefono int( 12), id int (2),primary key (idT),foreign key(id) references fore(id));
describe tr;
alter table institutos add column domicilio varchar(30);
describe institutos;
alter table institutos drop column domicilio;
describe institutos;
alter table institutos add column domicilio varchar(30);
alter table institutos change column domicilio domicilios varchar (30);
describe institutos;
alter table investigadores rename inv;
describe inv;
alter table inv modify telefono varchar (34);
alter table inv add column estado varchar (2) after domicilio;
describe inv;
drop database secretaria;
insert into categorias ( id,nombre) values( 1, "jair quiroga");
describe categorias;/* solo sirve para mostrar la estructura
insert into institutos values (1,"sebastian gil");
insert into roles (nombre) value ("juan carlos");
select * from roles;
select * from categorias;/* nos muestra los valores que tiene la tabla con *, si queremos especificamente unno, le ponemos el nombre 
select id,nombre from institutos;
insert into institutos values (2,"juna");
select * from institutos;
select nombre from institutos where id=1;
update categorias set nombre="julio";
select * from categorias;
delete from categorias;
select * from categorias;
delete from institutos where nombre="juna";
select * from institutos;*/
create database EscuelaPolitica;
use EscuelapOlitica;
create table comision (idComision int(10) auto_increment not null, nombre varchar (25), 
siglas varchar (10),descripcion varchar(140),primary key (idComision));
create table sector (idSector int(10) auto_increment not null, descripcion varchar (140), primary key (idsector));
create table personas (idPersonas int(10) auto_increment not null, nombre varchar (25), dni int(8), 
domicilio varchar(50), telefono int (10), primary key(idPersonas));




