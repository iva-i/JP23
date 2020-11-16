drop database if exists restoran;
create database restoran;

use restoran;

create table kategorija(
    sifra int not null primary key auto_increment,
    naziv varchar(20) not null,
    opis varchar(100)
);

create table jelo(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    opis varchar(100),
    kategorija int not null
);

create table pice(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    opis varchar(100)
);

create table narudzba(
    pice int not null,
    jelo int not null
);

alter table jelo add foreign key (kategorija) references kategorija(sifra);

alter table narudzba add foreign key (pice) references pice(sifra);
alter table narudzba add foreign key (jelo) references jelo(sifra);
