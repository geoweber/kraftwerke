drop table anlage IF EXISTS;
drop table anlagetype IF EXISTS;
drop table einsatzort IF EXISTS;
drop table hersteller IF EXISTS;
drop table kraftwerk IF EXISTS;

create TABLE anlagetype (
  id   INTEGER NOT NULL AUTO_INCREMENT,
  name VARCHAR(64),
  PRIMARY KEY (id)
);
create INDEX anlagetype_name ON anlagetype (name);


create TABLE einsatzort (
  id   INTEGER NOT NULL AUTO_INCREMENT,
  name VARCHAR(64),
  PRIMARY KEY (id)
);
create INDEX einsatzort_name ON einsatzort (name);


create TABLE hersteller (
  id   INTEGER NOT NULL AUTO_INCREMENT,
  name VARCHAR(64),
  PRIMARY KEY (id)
);
create INDEX hersteller_name ON hersteller (name);


create TABLE kraftwerk (
  id   INTEGER NOT NULL AUTO_INCREMENT,
  name VARCHAR(64),
  PRIMARY KEY (id)
);
create INDEX kraftwerk_name ON kraftwerk (name);


create TABLE anlage (
  id   INTEGER NOT NULL AUTO_INCREMENT,
  name VARCHAR(64),
  anlagetype_id  INTEGER NOT NULL,
  hersteller_id  INTEGER NOT NULL,
  einsatzort_id  INTEGER NOT NULL,
  kraftwerk_id   INTEGER NOT NULL,
  leistung     INTEGER,
  kaufpreis    INTEGER,
  anschaffungsdatum DATE,
  betriebsdauer     DATE,
  bild BINARY,
  PRIMARY KEY (id)
);
alter table anlage add CONSTRAINT fk_anlage_anlagetype FOREIGN KEY (anlagetype_id) REFERENCES anlagetype (id);
alter table anlage add CONSTRAINT fk_anlage_hersteller FOREIGN KEY (hersteller_id) REFERENCES hersteller (id);
alter table anlage add CONSTRAINT fk_anlage_einsatzort FOREIGN KEY (einsatzort_id) REFERENCES einsatzort (id);
alter table anlage add CONSTRAINT fk_anlage_kraftwerk FOREIGN KEY (kraftwerk_id) REFERENCES kraftwerk (id);

create INDEX anlage_name ON anlage (name);
create INDEX anlage_anlagetype_id ON anlage (anlagetype_id);
create INDEX anlage_hersteller_id ON anlage (hersteller_id);
create INDEX anlage_einsatzort_id ON anlage (einsatzort_id);
create INDEX anlage_kraftwerk_id ON anlage (kraftwerk_id);