# Übung 2: Maven praktisch kennenlernen und Git Branches

## Ausgangssituation

Für diese Übung wird das bestehende Repository
`bsd25_Akhelumele_Progress` verwendet.

Das Repository enthält bereits Arbeiten aus anderen Übungen.
Die vorhandene Maven-Struktur und der gemeinsame Ordner
`resources/images` werden weiterverwendet.

## Verwendete Versionen

- Java: OpenJDK 21.0.12.1 LTS
- javac: 21.0.12.1
- Maven: Apache Maven 3.9.16
- Betriebssystem: Windows

## Branch init_project

- Bestehendes Repository verwendet.
- Branch `init_project` erstellt.
- Datei `exercise2.md` angelegt.
- Der Branch wurde auf GitHub übertragen.
- Der Branch wurde in `main` gemergt.

## Branch calculator

- Branch `calculator` erstellt.
- Vorhandene Calculator-Klasse überprüft und weiterverwendet.
- Klasse `CalculatorMain` für die Demonstration erstellt.
- Die Methoden `add`, `subtract`, `divide` und `multiply` ausgeführt.
- Das Projekt mit `mvn compile` erfolgreich kompiliert.
- Das Programm mit Maven erfolgreich gestartet.
- Der durch Maven erzeugte Ordner `target/` wurde dokumentiert.
- Der Branch wurde in `main` gemergt.

## Branch logging

- Branch `logging` erstellt.
- Log4j2 als Maven-Abhängigkeit hinzugefügt.
- Debug-Nachrichten für die Calculator-Methoden ergänzt.
- Fehler beim Teilen durch null protokolliert.
- Log4j2-Konfiguration unter `src/main/resources/log4j2.xml` erstellt.
- Eine Vorlage `log4j2.xml.template` erstellt.
- Die Logdatei unter `logs/myapp.log` erzeugt.
- Logdateien und persönliche Konfigurationsdateien über `.gitignore` ausgeschlossen.
- Der Branch wurde per Pull Request in `main` gemergt.

## Screenshots

Die Screenshots wurden im gemeinsamen Ordner `resources/images` gespeichert:

- `ex2_1.png`: Repository-Ordner mit dem neu erzeugten `target/`-Ordner.
- `ex2_2.png`: Erfolgreicher Maven-Build mit `mvn compile`.
- `ex2_3.png`: Programmausgabe mit `mvn exec:java` und dem eigenen Namen.
- `ex2_4.png`: Logging-Ausgabe in der Konsole.
- `ex2_5.png`: Inhalt der Logdatei `logs/myapp.log`.

## Git-Branches

Verwendete Branches für Übung 2:

- `init_project`
- `calculator`
- `logging`

Bereits vorhandene Branches aus weiteren Übungen:

- `conflict`
- `test`
- `faculty`
- `doc`


