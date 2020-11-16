drop database if exists trgovackicentar;
create database trgovackicentar;

use trgovackicentar;

create table trgovina(
    sifra int not null primary key auto_increment,
    naziv varchar(20) not null,
    opis varchar(100),
    osoba int not null
);

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table osobatrgovina(
    osoba int not null,
    trgovina int not null
);

alter table trgovina add foreign key (osoba) references osoba(sifra);

alter table osobatrgovina add foreign key (trgovina) references trgovina(sifra);
alter table osobatrgovina add foreign key (osoba) references osoba(sifra);