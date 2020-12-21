drop database if exists sqlv1;
create database sqlv1 CHARACTER SET utf8; 

use sqlv1;

create table sestra(
	sifra int not null primary key,
	introvertno bit,
	haljina varchar(31) not null,
	marka decimal(16,6),
	hlace varchar(46) not null,
	narukvica int not null
);

create table punac(
	sifra int not null primary key,
	ogrlica int,
	gustoca decimal(14,9),
	hlave varchar(41) not null
);

create table zena(
	sifra int not null primary key,
	treciputa datetime,
	hlace varchar(46),
	kratkamajica varchar(31) not null,
	jmbag char(11) not null,
	bojaociju varchar(39) not null,
	haljina varchar(44),
	sestra int not null
);

create table cura(
	sifra int not null primary key,
	novcica decimal(16,5) not null,
	gustoca decimal(18,6) not null,
	lipa decimal(13,10),
	ogrlica int not null,
	bojakose varchar(38),
	suknja varchar(36),
	punac int
);

create table sestra_svekar(
	sifra int not null primary key,
	sestra int,
	svekar int
);

create table muskarac(
	sifra int not null primary key,
	bojaociju varchar(50) not null,
	hlace varchar(30),
	modelnaocala varchar(43),
	marka decimal(14,5) not null,
	zena int not null
);

create table svekar(
	sifra int not null primary key,
	bojaociju varchar(40) not null,
	prstena int,
	dukserica varchar(41),
	lipa decimal(13,8),
	eura decimal(12,7),
	majica varchar(35)
);

create table mladic(
	sifra int not null primary key,
	suknja varchar(50) not null,
	kuna decimal(16,8) not null,
	drugiputa datetime,
	asocijalno bit,
	ektrovertno bit not null,
	dukserica varchar(48) not null,
	muskarac int
);

###
alter table sestra_svekar add foreign key (sestra) references sestra(sifra);
alter table sestra_svekar add foreign key (svekar) references svekar(sifra);

alter table cura add foreign key (punac) references punac(sifra);

alter table zena add foreign key (sestra) references sestra(sifra);

alter table muskarac add foreign key (zena) references zena(sifra);

alter table mladic add foreign key (muskarac) references muskarac(sifra);

#U tablice muskarac, zena i sestra_svekar unesite po 3 retka.
insert into sestra(sifra,haljina,hlace,narukvica) values 
	(1,'haljina1','hlace1',1),
	(2,'haljina2','hlace2',2),
	(3,'haljina3','hlace3',3);

insert into zena(sifra,kratkamajica,jmbag,bojaociju,sestra) values 
	(1,'majica',11111111111,'smeđa',1),
	(2,'majica',11111111112,'smeđa',2),
	(3,'majica',11111111113,'smeđa',3);

insert into muskarac(sifra,bojaociju,marka,zena) values 
	(1,'smeđa',1,1),
	(2,'smeđa',2,2),
	(3,'smeđa',3,3);

insert into svekar(sifra,bojaociju) values 
	(1,'smeđa'),
	(2,'smeđa'),
	(3,'smeđa');

insert into sestra_svekar(sifra,sestra,svekar) values 
	(1,1,1),
	(2,2,2),
	(3,3,3);

#U tablici cura postavite svim zapisima kolonu gustoca na vrijednost 15,77.
#select * from cura;
update cura set gustoca=15.77;

#U tablici mladic obrišite sve zapise čija je vrijednost kolone kuna veće od 15,78.
delete from mladic where kuna>15.78;

#Izlistajte kratkamajica iz tablice zena uz uvjet da vrijednost kolone hlace sadrže slova ana.
select kratkamajica from zena where hlace like '%a%n%a%';

#Prikažite dukserica iz tablice svekar, asocijalno iz tablice mladic te hlace iz tablice muskarac 
#uz uvjet da su vrijednosti kolone hlace iz tablice zena počinju slovom a te da su vrijednosti kolone 
#haljina iz tablice sestra sadrže niz znakova ba. Podatke posložite po hlace iz tablice muskarac silazno.
select a.dukserica, f.asocijalno, e.hlace
from svekar a 
inner join sestra_svekar b on a.sifra=b.svekar
inner join sestra c on b.sestra=c.sifra 
inner join zena d on d.sestra=c.sifra 
inner join muskarac e on e.zena=d.sifra 
inner join mladic f on f.muskarac=e.sifra 
where d.hlace like 'a%' and c.haljina like '%ba%'
order by e.hlace desc;


#Prikažite kolone haljina i maraka iz tablice sestra čiji se primarni ključ ne nalaze u tablici sestra_svekar.
select a.haljina, a.marka
from sestra a inner join sestra_svekar b on a.sifra=b.sestra
where a.sifra!=b.sestra;


