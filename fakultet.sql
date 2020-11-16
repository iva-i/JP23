drop database if exists fakultet;
create database fakultet;

use fakultet;

create table student(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    jmbag char(4),
    email varchar(50)
);

create table kolegij(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    opis varchar(200)
);

create table rok(
    sifra int not null primary key auto_increment,
    kolegij int not null,
    opisroka varchar(200)
);

create table izlazak(
    student int not null,
    rok int not null
);

alter table rok add foreign key (kolegij) references kolegij(sifra);

alter table izlazak add foreign key (student) references student(sifra);
alter table izlazak add foreign key (rok) references rok(sifra);