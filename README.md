# README #

### What is this repository for? ###

** Quick summary

In der Energiewirtschaft wurden fr�her wenige, gro�e kohle-, gas- und kernenergiebetriebene Kraftwerke eingesetzt, um die Bev�lkerung mit Strom zu versorgen. Heute wird Strom zunehmend in vielen kleinen Kraftwerken, die �ber die ganze Bundesrepublik verteilt sind, erzeugt.
Es gibt Windr�der, Photovoltaikanlagen und kleine Gasmotoren (Blockheizkraftwerke genannt). Diese vielen kleinen Energieerzeugungsanlagen werden zu einem sogenannten �virtuellen Kraftwerk� zusammengeschaltet.
F�r Betreiber von virtuellen Kraftwerken ist es wichtig, die technischen und kaufm�nnischen Stammdaten der einzelnen Erzeugungsanlagen komfortabel verwalten zu k�nnen und zu wissen, welche Erzeugungsanlagen zu einem virtuellen Kraftwerk geh�ren, um gemeinsam eine Region mit Strom zu versorgen und wie hoch die Gesamtleistung je virtuelles Kraftwerk ist.
Die Stammdaten umfassen (stark vereinfacht)
- Bild der Anlage
- Typ der Erzeugungsanlage (Windrad etc.)
- Leistung (Angabe in kW)
- Anschaffungsdatum
- Hersteller (Name)
- Kaufpreis (in Tausend Euro)
- Einsatzort (wo steht die Anlage)
- Betriebsdauer (wie lange ist die Anlage in Betrieb gewesen in Stunden)
- Kennung zu welchem virtuellen Kraftwerk die Erzeugungsanlage geh�rt (ID des virtuellen Kraftwerks)
Erstellen Sie eine einfache, datenbankbasierte JAVA-Applikation mit angemessener Benutzerschnittstelle zur Verwaltung von virtuellen Kraftwerken und deren Erzeugungsanlagen.
Implementieren Sie auch eine Methode zur Ermittlung der Gesamtleistung aller Anlagen eines virtuellen Kraftwerks. Erl�utern Sie wie sie vorgegangen sind!



Folgende Punkte sind bei der Umsetzung zu beachten:

1)         Projekt Aufbau und Struktur (Maven Projekt).

2)         Design Pattern (REST Controllers/Services, MVC).

3)         HTTP Response Code.

4)         JSON R�ckmeldung.

5)         JUnit Test und/oder Integrationstest REST Web Service.


** Version
1.0.0

### How do I get set up? ###

** Summary of set up

* Configuration - Port 8080

* Dependencies:
-spring-boot-starter-data-jpa,
-spring-boot-starter-thymeleaf,
-spring-boot-starter-web,
-spring-boot-starter-test,
-springfox-swagger2,
-springfox-swagger-ui,
-lombok
-com.h2database.h2

* Database configuration   - To avoid any extra setup, i will use the H2 embedded database. 

* How to run tests  - JUnit Test werden �ber Maven Goal test gestartet

* Deployment instructions  - eine Docker File wurde definiert. Jenkind bzw. GitLab CI Konfiguration fehlen


### Contribution guidelines ###

* Writing tests
* Code review
* Other guidelines