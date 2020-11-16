drop database if exists klubcitatelja;
create database klubcitatelja;

use klubcitatelja;

create table citatelj(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table clan(
    sifra int not null primary key auto_increment,
    citatelj int not null
);

create table vlasnik(
    sifra int not null primary key auto_increment,
    citatelj int not null
);

create table knjiga(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    autor varchar(50) not null,
    vlasnik int not null
);

create table citateljknjiga(
    citatelj int not null,
    knjiga int not null
);

alter table clan add foreign key (citatelj) references citatelj(sifra);

alter table vlasnik add foreign key (citatelj) references citatelj(sifra);

alter table knjiga add foreign key (vlasnik) references vlasnik(sifra);

alter table citateljknjiga add foreign key (citatelj) references citatelj(sifra);
alter table citateljknjiga add foreign key (knjiga) references knjiga(sifra);
