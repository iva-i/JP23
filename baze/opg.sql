drop database if exists opg;
create database opg;

use opg;

create table djelatnik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table proizvod(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    opis varchar(100),
    djelatnik int not null
);

create table sirovina(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    opis varchar(100)
);

create table prosir(
    proizvod int not null,
    sirovina int not null
);

alter table proizvod add foreign key (djelatnik) references djelatnik(sifra);

alter table prosir add foreign key (proizvod) references proizvod(sifra);
alter table prosir add foreign key (sirovina) references sirovina(sifra);
