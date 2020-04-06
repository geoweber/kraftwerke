# README #

### What is this repository for? ###

## Augabe

In der Energiewirtschaft wurden früher wenige, große kohle-, gas- und kernenergiebetriebene Kraftwerke eingesetzt, um die Bevölkerung mit Strom zu versorgen. Heute wird Strom zunehmend in vielen kleinen Kraftwerken, die über die ganze Bundesrepublik verteilt sind, erzeugt.
Es gibt Windräder, Photovoltaikanlagen und kleine Gasmotoren (Blockheizkraftwerke genannt). Diese vielen kleinen Energieerzeugungsanlagen werden zu einem sogenannten „virtuellen Kraftwerk“ zusammengeschaltet.
Für Betreiber von virtuellen Kraftwerken ist es wichtig, die technischen und kaufmännischen Stammdaten der einzelnen Erzeugungsanlagen komfortabel verwalten zu können und zu wissen, welche Erzeugungsanlagen zu einem virtuellen Kraftwerk gehören, um gemeinsam eine Region mit Strom zu versorgen und wie hoch die Gesamtleistung je virtuelles Kraftwerk ist.
Die Stammdaten umfassen (stark vereinfacht)
- Bild der Anlage
- Typ der Erzeugungsanlage (Windrad etc.)
- Leistung (Angabe in kW)
- Anschaffungsdatum
- Hersteller (Name)
- Kaufpreis (in Tausend Euro)
- Einsatzort (wo steht die Anlage)
- Betriebsdauer (wie lange ist die Anlage in Betrieb gewesen in Stunden)
- Kennung zu welchem virtuellen Kraftwerk die Erzeugungsanlage gehört (ID des virtuellen Kraftwerks)
Erstellen Sie eine einfache, datenbankbasierte JAVA-Applikation mit angemessener Benutzerschnittstelle zur Verwaltung von virtuellen Kraftwerken und deren Erzeugungsanlagen.

Implementieren Sie auch eine Methode zur Ermittlung der Gesamtleistung aller Anlagen eines virtuellen Kraftwerks. 


# Implementierung
## ERD

![ERD](/kraftwerkeERD.png)


## Deteils der Umsetzung:

1)         Projekt Aufbau und Struktur (Maven Projekt).

2)         Design Pattern (REST Controllers/Services, MVC).

3)         Database configuration   - To avoid any extra setup, i will use the H2 embedded database. 

4)         JSON Rückmeldung.

5)         JUnit Test und Integrationstest
6)   How to run tests  - JUnit Test werden über Maven Goal test gestartet
7) Deployment instructions  - eine Docker File wurde definiert. Jenkind bzw. GitLab CI Konfiguration fehlen





### How do I get set up? ###

### Summary of set up
* Configuration - Port 8080
* Dependencies:
**spring-boot-starter-data-jpa,
**spring-boot-starter-thymeleaf,
**spring-boot-starter-web,
**spring-boot-starter-test,
**springfox-swagger2,
**springfox-swagger-ui,
**lombok
**com.h2database.h2
