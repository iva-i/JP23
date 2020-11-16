drop database if exists samostan;
create database samostan;

use samostan;

create table svecenik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    nadredjeni int not null
);

create table posao(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    opis varchar(200)
);

create table obavljanje(
    posao int not null,
    svecenik int not null
);

alter table svecenik add foreign key (nadredjeni) references svecenik(sifra);

alter table obavljanje add foreign key (posao) references posao(sifra);
alter table obavljanje add foreign key (svecenik) references svecenik(sifra);