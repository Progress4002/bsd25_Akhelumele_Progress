# Exercise 3

## Vorteile von Unit Tests

Unit Tests helfen dabei, Fehler in einzelnen Methoden frühzeitig zu erkennen. Sie ermöglichen eine schnelle Kontrolle einzelner Funktionen und erleichtern spätere Änderungen am Code. Außerdem geben sie Sicherheit beim Refactoring, weil Fehler sofort durch automatisierte Tests sichtbar werden. Dadurch verbessern Unit Tests die Qualität, Stabilität und Wartbarkeit der Software.

## Beschreibung der Testfälle

In der Testklasse `CalculatorTest` werden die vier Grundfunktionen des Taschenrechners überprüft. Für jede Methode wurden drei Testfälle erstellt, sodass insgesamt 12 Unit Tests vorhanden sind.

### Addition
Für die Methode `add()` werden drei Fälle getestet. Im ersten Test werden zwei positive Zahlen addiert (`5 + 3 = 8`). Im zweiten Test wird eine positive Zahl mit einer negativen Zahl addiert (`5 + -3 = 2`). Im dritten Test wird die Addition mit 0 überprüft (`5 + 0 = 5`).

### Subtraktion
Für die Methode `subtract()` werden ebenfalls drei Fälle getestet. Zuerst wird die Subtraktion von zwei positiven Zahlen geprüft (`5 - 3 = 2`). Danach wird überprüft, ob die Subtraktion einer negativen Zahl korrekt funktioniert (`5 - -3 = 8`). Im dritten Test wird die Subtraktion mit 0 getestet (`5 - 0 = 5`).

### Multiplikation
Für die Methode `multiply()` werden drei Testfälle verwendet. Ein Test überprüft die Multiplikation von zwei positiven Zahlen (`5 * 3 = 15`). Ein weiterer Test kontrolliert die Multiplikation mit einer negativen Zahl (`5 * -3 = -15`). Der dritte Test überprüft die Multiplikation mit 0 (`5 * 0 = 0`).

### Division
Für die Methode `divide()` werden ebenfalls drei Fälle getestet. Im ersten Test wird eine normale Division mit positivem Ergebnis geprüft (`6 / 3 = 2`). Im zweiten Test wird eine Division mit negativem Ergebnis getestet (`6 / -3 = -2`). Im dritten Test wird überprüft, ob bei einer Division durch 0 eine `ArithmeticException` ausgelöst wird.


