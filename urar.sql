drop database if exists urar;
create database urar;

use urar;

create table sat(
    sifra int not null primary key auto_increment,
    velicina char(10) not null,
    opis varchar(50),
    korisnik int not null
);

create table korisnik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table popravak(
    sifra int not null primary key auto_increment,
    opis varchar(50),
    segrt int
);

create table segrt(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50)
);

create table popravaksat(
    popravak int not null,
    sat int not null
);

alter table sat add foreign key (korisnik) references korisnik(sifra);

alter table popravak add foreign key (segrt) references segrt(sifra);

alter table popravaksat add foreign key (popravak) references popravak(sifra);
alter table popravaksat add foreign key (sat) references sat(sifra);