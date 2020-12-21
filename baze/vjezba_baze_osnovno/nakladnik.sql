drop database if exists nakladnik;
create database nakladnik;

use nakladnik;

create table nakladnik(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    mjesto int not null
);

create table mjesto(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null
);

create table djelo(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null
);

create table djelonakladnik(
    djelo int not null,
    nakladnik int
);

alter table nakladnik add foreign key (mjesto) references mjesto(sifra);

alter table djelonakladnik add foreign key (djelo) references djelo(sifra);
alter table djelonakladnik add foreign key (nakladnik) references nakladnik(sifra);
