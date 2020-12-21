drop database if exists odvjetnik;
create database odvjetnik;

use odvjetnik;

create table klijent(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table obrana(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    opis varchar(1000),
    klijent int not null
);

create table suradnik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);


create table obranasuradnik(
    obrana int not null,
    suradnik int
);

alter table obrana add foreign key (klijent) references klijent(sifra);

alter table obranasuradnik add foreign key (obrana) references obrana(sifra);
alter table obranasuradnik add foreign key (suradnik) references suradnik(sifra);
