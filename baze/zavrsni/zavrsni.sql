drop database if exists trgovina;
create database trgovina CHARACTER SET utf8; 

use trgovina;

create table proizvod(
	sifra int not null primary key auto_increment,
	sifraproizvoda varchar(5),
	naziv varchar(100) not null,
	proizvodac varchar(50),
	opis varchar(500),
	cijena decimal(10,2),
	mjernajedinica varchar(10),
	nastanju bool,
	kolicinanastanju int
);

create table djelatnik(
	sifra int not null primary key auto_increment,
	ime varchar(20) not null,
	prezime varchar(20) not null,
	jmbag int(11),
	oib int(13),
	strucnasprema varchar(50)
);

create table racun(
	sifra int not null primary key auto_increment,
	djelatnik int not null,
	kupac int
);

create table stavka(
	sifra int not null primary key auto_increment,
	proizvod int not null,
	racun int not null,
	kolicina decimal(10,2) not null,
	cijena decimal(10,2)
);

#veze između tablica
alter table racun add foreign key (djelatnik) references djelatnik(sifra);

alter table stavka add foreign key (proizvod) references proizvod(sifra);
alter table stavka add foreign key (racun) references racun(sifra);

#insert u tablice
select * from proizvod;
insert into proizvod(naziv,sifraproizvoda,cijena,mjernajedinica) values
	('Čokolada','A0001',5.99,'kn/100g'),
	('Kava','A0002',19.99,'kn/500g'),
	('Vegeta','A0003',17.99,'kn/500g'),
	('Maslinovo ulje','A0004',29.99,'kn/1l'),
	('Ubrusi','A0005',9.99,'kn/pak'),
	('Kruh bijeli','A0006',6.99,'kn/700g'),
	('Nutella','A0007',39.99,'kn/750g'),
	('Šumeće tablete','A0008',8.99,'kn/80g'),
	('Vrhnje za kuhanje','A0009',10.99,'kn/200g'),
	('Tijestenina','A0010',9.99,'kn/500g'),
	('Ketchup','A0011',13.99,'kn/500g'),
	('Mlijeko','A0012',6.99,'kn/1l'),
	('Mliječni namaz','A0013',19.99,'kn/100g'),
	('Banana','A0014',9.99,'kn/1kg'),
	('Jabuka','A0015',7.99,'kn/1kg'),
	('Mandarina','A0016',11.99,'kn/1kg'),
	('Maline','A0017',29.99,'kn/1kg'),
	('Sir Gouda','A0018',39.99,'kn/1kg'),
	('Sir Edamer','A0019',49.99,'kn/1kg'),
	('Prašak za pecivo','A0020',10.99,'kn/pak');

select * from djelatnik;
insert into djelatnik(ime, prezime) values
	('Ana','Horvat'),
	('Ivan','Perić');

select * from racun;
insert into racun(djelatnik) values
	(1),
	(1),
	(2),
	(1),
	(2);

select * from stavka;
insert into stavka(proizvod,racun,kolicina) values
	(1,1,2),
	(8,2,3),
	(9,3,1),
	(11,4,2),
	(17,5,0.5);
