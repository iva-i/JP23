drop database if exists taksisluzba;
create database taksisluzba;

use taksisluzba;

create table vozilo(
    sifra int not null primary key auto_increment,
    brojvozila char(10) not null,
    vozac int not null
);

create table vozac(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    iban varchar(50)
);

create table voznja(
    sifra int not null primary key auto_increment,
    vozilo int not null
);

create table putnik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50),
    brojkorisnika char(10)
);

create table putnikvoznja(
    putnik int not null,
    voznja int not null
);

alter table vozilo add foreign key (vozac) references vozac(sifra);

alter table voznja add foreign key (vozilo) references vozilo(sifra);

alter table putnikvoznja add foreign key (voznja) references voznja(sifra);
alter table putnikvoznja add foreign key (putnik) references putnik(sifra);
