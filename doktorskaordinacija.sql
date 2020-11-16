drop database if exists doktorskaordinacija;
create database doktorskaordinacija;

use doktorskaordinacija;

create table medicinskasestra(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table pacijent(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table lijecenje(
    sifra int not null primary key auto_increment,
    pacijent int not null
);

create table lijecenjemed(
    lijecenje int not null,
    medicinskasestra int not null
);

alter table lijecenje add foreign key (pacijent) references pacijent(sifra);

alter table lijecenjemed add foreign key (lijecenje) references lijecenje(sifra);
alter table lijecenjemed add foreign key (medicinskasestra) references medicinskasestra(sifra);