drop database if exists osnovnaskola;
create database osnovnaskola;

use osnovnaskola;

create table dijete(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table uciteljica(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table radionica(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    opis varchar(200),
    uciteljica int not null
);

create table dijeteradionica(
    dijete int not null,
    radionica int not null
);

alter table radionica add foreign key (uciteljica) references uciteljica(sifra);

alter table dijeteradionica add foreign key (dijete) references dijete(sifra);
alter table dijeteradionica add foreign key (radionica) references radionica(sifra);