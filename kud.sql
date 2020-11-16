drop database if exists kud;
create database kud;

use kud;

create table clan(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table nastup(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    opis varchar(1000),
    mjesto int not null
);

create table mjesto(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null
);

create table clannastup(
    clan int not null,
    nastup int not null
);

alter table nastup add foreign key (mjesto) references mjesto(sifra);

alter table clannastup add foreign key (clan) references clan(sifra);
alter table clannastup add foreign key (nastup) references nastup(sifra);