drop database if exists udruga;
create database udruga;

use udruga;

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    iban varchar(50),
    oib char(11)
);

create table sticenik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    zivotinja int not null,
    osoba int not null,
    prostor int not null
);

create table zivotinja(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    opis varchar(50)
);

create table prostor(
    sifra int not null primary key auto_increment,
    opis varchar(100)
);

alter table sticenik add foreign key (osoba) references osoba(sifra);
alter table sticenik add foreign key (prostor) references prostor(sifra);
alter table sticenik add foreign key (zivotinja) references zivotinja(sifra);
