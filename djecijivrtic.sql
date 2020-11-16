drop database if exists djecijivrtic;
create database djecijivrtic;

use djecijivrtic;

create table odgojnaskupina(
    sifra int not null primary key auto_increment,
    odgajateljica int not null,
    brojdjece int not null
);

create table dijete(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    odgojnaskupina int not null
);

create table odgajateljica(
    sifra int not null primary key auto_increment,
    strucnasprema int not null,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11),
    iban varchar(50)
);

create table strucnasprema(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    razina varchar(50)
);

alter table odgojnaskupina add foreign key (odgajateljica) references odgajateljica(sifra);

alter table dijete add foreign key (odgojnaskupina) references odgojnaskupina(sifra);

alter table odgajateljica add foreign key (strucnasprema) references strucnasprema(sifra);
