drop database if exists postolar;
create database postolar;

use postolar;

create table obuca(
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

create table popravakobuca(
    popravak int not null,
    obuca int not null
);

alter table obuca add foreign key (korisnik) references korisnik(sifra);

alter table popravak add foreign key (segrt) references segrt(sifra);

alter table popravakobuca add foreign key (popravak) references popravak(sifra);
alter table popravakobuca add foreign key (obuca) references obuca(sifra);
