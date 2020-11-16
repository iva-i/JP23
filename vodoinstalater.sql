drop database if exists vodoinstalater;
create database vodoinstalater;

use vodoinstalater;

create table segrt(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table popravak(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    opis varchar(100),
    segrt int
);

create table kvar(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    opis varchar(500)
);

create table popkvar(
    kvar int not null,
    popravak int not null
);

alter table popravak add foreign key (segrt) references segrt(sifra);

alter table popkvar add foreign key (kvar) references kvar(sifra);
alter table popkvar add foreign key (popravak) references popravak(sifra);
