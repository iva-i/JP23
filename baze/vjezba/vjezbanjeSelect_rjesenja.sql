# baza mjesta

# odaberite sva mjesta iz osječko baranjčke županije
select * from mjesto where postanskibroj like '31%';
select * from mjesto where zupanija =14;

# odaberite sva mjesta u hrvatskoj koja ne završavaju s slovom k
select * from mjesto where naziv not like '%k';

# Nazive svih mjesta koji imaju početno slovo a postavite na XXXX
update mjesto set naziv='XXXX' where naziv like '%a';
select * from mjesto;

# Mjestima dodati kolonu brojstanovnika i u nju postaviti slučajne vrijednosti
# između 10000 i 100000.
alter table mjesto add brojstanovnika decimal(18,2);
select * from mjesto;
update mjesto set brojstanovnika=ceil(1000+rand()*9000);
select * from mjesto;



# baza knjiznica

# 1. odaberite sve autore koji nemaju definiran datum rođenja
select * from autor where datumrodenja is null;

# 2. autora s prezimenom preišić ispraviti u Perišić
update autor set prezime='Perišić' where prezime='preišić';
select * from autor where prezime='Perišić';

# 3. kreirati tablic grad (id, naziv). U tablicu autor doddati kolonu grad koja je 
# vanjski ključ na grad(id)
create table grad(
	id int not null primary key,
	naziv varchar(500)
);

alter table autor add grad int;
select * from autor;

alter table autor add foreign key (grad) references grad(id);


# 4. Koliko je izdavača društvo s ograničenom odgovornošću?
select * from izdavac where naziv like '%d%o%o%';

# 5. odaberite sva mjesta koja u svom nazivu imaju slovo Z
select * from mjesto where naziv like '%z%';

# Unesite sebe kao autora i unesite kataložni zapis čiji ste Vi autor
select * from autor;
insert into autor(sifra, ime, prezime) values (11111, 'Iva', 'I');

select * from izdavac; #392
select * from mjesto; #4

insert into katalog(sifra,autor,naslov) values (11111,11111,'Naslov');
select * from katalog where sifra=11111;
