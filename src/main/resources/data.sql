insert into ANLAGETYPE (name) values('Windrad');
insert into ANLAGETYPE (name) values('Photovoltaikanlage');
insert into ANLAGETYPE (name) values('Blockheizkraftwerk');

insert into EINSATZORT (name) values('Ratingen');
insert into EINSATZORT (name) values('Berlin');

insert into HERSTELLER (name) values('Hersteller 1');
insert into HERSTELLER (name) values('Hersteller 2');
insert into HERSTELLER (name) values('Hersteller 3');
insert into HERSTELLER (name) values('Hersteller 4');

insert into KRAFTWERK (name) values('Kraftwerk 1');
insert into KRAFTWERK (name) values('Kraftwerk 2');
insert into KRAFTWERK (name) values('Kraftwerk 3');
insert into KRAFTWERK (name) values('Kraftwerk 4');
insert into KRAFTWERK (name) values('Kraftwerk 5');

INSERT INTO ANLAGE(name, anlagetype_id, hersteller_id, einsatzort_id, kraftwerk_id, leistung, kaufpreis, anschaffungsdatum, betriebsdauer, bild)
      VALUES('Anlage 1',            1,            2,              1,            1,   150000,      1000,       '2020-04-01', ' 2010-04-01', NULL);

INSERT INTO ANLAGE(name, anlagetype_id, hersteller_id, einsatzort_id, kraftwerk_id, leistung, kaufpreis, anschaffungsdatum, betriebsdauer, bild)
      VALUES('Anlage 2',            2,            1,              2,            1,   250000,      2300,       '2020-04-01', ' 2010-04-01', NULL);