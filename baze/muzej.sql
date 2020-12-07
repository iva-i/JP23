drop database if exists muzej;
create database muzej;

use muzej;

create table izlozba(
    sifra int not null primary key auto_increment,
    sponzor int not null,
    naziv varchar(50),
    termin datetime
);

create table djelo(
    sifra int not null primary key auto_increment,
    izlozba int not null,
    naziv varchar(50) not null,
    autor varchar(50) not null
);

create table kustos(
    sifra int not null primary key auto_increment,
    izlozba int not null,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table sponzor(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    opis varchar(50)
);

alter table izlozba add foreign key (sponzor) references sponzor(sifra);

alter table djelo add foreign key (izlozba) references izlozba(sifra);

alter table kustos add foreign key (izlozba) references izlozba(sifra);
