drop database if exists salonzauljepsavanje;
create database salonzauljepsavanje;

use salonzauljepsavanje;

create table djelatnica(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    iban varchar(50),
    oib char(11)
);

create table korisnik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table usluga(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    cijena decimal(10,2)
);

create table posjet(
    djelatnica int,
    korisnik int,
    usluga int
);

alter table posjet add foreign key (djelatnica) references djelatnica(sifra);
alter table posjet add foreign key (korisnik) references korisnik(sifra);
alter table posjet add foreign key (usluga) references usluga(sifra);
