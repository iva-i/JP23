drop database if exists srednjaskola;
create database srednjaskola;

use srednjaskola;

create table razred(
    sifra int not null primary key auto_increment,
    naziv varchar(20) not null,
    brojucenika char(10)
);

create table ucenik (
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    razred int not null
);

create table profesor(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table predavanje(
    profesor int not null,
    razred int not null
);

alter table ucenik add foreign key (razred) references razred(sifra);

alter table predavanje add foreign key (profesor) references profesor(sifra);
alter table predavanje add foreign key (razred) references razred(sifra);
