drop database if exists zupanije;
create database zupanije CHARACTER SET utf8; 

use zupanije;

create table zupanija(
	sifra int not null primary key auto_increment,
	naziv varchar(50) not null,
	zupan int
);

create table opcina(
	sifra int not null primary key auto_increment,
	naziv varchar(50),
	zupanija int
);

create table mjesto(
	sifra int not null primary key auto_increment,
	naziv varchar(50),
	opcina int
);

create table zupan(
	sifra int not null primary key auto_increment,
	ime varchar(50),
	prezime varchar(50)
);

alter table zupanija add foreign key (zupan) references zupan(sifra);

alter table opcina add foreign key (zupanija) references zupanija(sifra);

alter table mjesto add foreign key (opcina) references opcina(sifra);

select * from zupan;
insert into zupan(ime, prezime) values
	('Ana','Ani?'),
	('Pero','Peri?'),
	('Marko','Marki?');

select * from zupanija;
insert into zupanija(naziv, zupan) values
	('Osjecko baranjska',1),
	('Brodsko posavska',2),
	('Vukovarsko srijemska',3);

select * from opcina;
insert into opcina (naziv,zupanija) values
	('Bilje',1),
	('Bukovlje',2),
	('Borovo',3),	
	('?epin',1),
	('Gar?in',2),
	('Cerna',3);

select * from mjesto;
insert into mjesto(opcina) values
	(1),
	(2),
	(3),
	(4),
	(5),
	(6),
	(1),
	(2),
	(3),
	(4),
	(5),
	(6);

select * from mjesto;
update mjesto set naziv='Vranovci' where sifra=2;
update mjesto set naziv='Bukovlje' where sifra=8;
update mjesto set naziv='?epin' where sifra=4;
update mjesto set naziv='Bilje' where sifra=1;
update mjesto set naziv='Cerna' where sifra=6;

#brisanje opcine cerna
select * from mjesto; #6,12
delete from mjesto where opcina=6;

#brisanje opcine bukovlje
select * from mjesto; 
delete from mjesto where opcina=2;

	


