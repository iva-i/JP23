drop database if exists trgovina;
create database trgovina CHARACTER SET utf8; 

use trgovina;

create table proizvod(
	sifra int not null primary key auto_increment,
	sifraproizvoda varchar(50),
	naziv varchar(100) not null,
	opis varchar(500),
	cijena decimal(10,2),
	nastanju bool,
	kolicinanastanju int
);

create table akcija(
	sifra int not null primary key auto_increment,
	proizvod int not null,
	popust decimal(2,2) not null,
	novacijena decimal(10,2)
);

create table djelatnik(
	sifra int not null primary key auto_increment,
	ime varchar(20) not null,
	prezime varchar(20) not null,
	jmbag int(11),
	oib int(13),
	strucnasprema varchar(50)
);

create table velkupac(
	sifra int not null primary key auto_increment,
	ime varchar(20) not null,
	prezime varchar(20) not null,
	nazivfirme  varchar(50),
	adresafirme varchar(50),
	dozvoljenirabat decimal(2,2),
	jmbag int(11)
);

create table kupnja(
	sifra int not null primary key auto_increment,
	djelatnik int not null,
	kupac int
);

create table racun(
	sifra int not null primary key auto_increment,
	proizvod int not null,
	kupnja int not null,
	ukupno decimal(10,2)
);

alter table akcija add foreign key (proizvod) references proizvod(sifra);

alter table kupnja add foreign key (djelatnik) references djelatnik(sifra);
alter table kupnja add foreign key (kupac) references velkupac(sifra);

alter table racun add foreign key (proizvod) references proizvod(sifra);
alter table racun add foreign key (kupnja) references kupnja(sifra);
