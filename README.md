BalancedPI
==========

Implementierung eines balanced PI Calculators in Java.

Aufgabenstellung
----------------

Es soll ein Load Balancer mit mindestens 2 unterschiedlichen Load-Balancing Methoden (jeweils 7 Punkte) implementiert werden (ähnlich dem PI Beispiel [1]; Lösung zum Teil veraltet [2]). Eine Kombination von mehreren Methoden ist möglich. Die Berechnung bzw. das Service ist frei wählbar!

Folgende Load Balancing Methoden stehen zur Auswahl:

- Weighted Round-Round
- Least Connection
- Least Connected Slow- Start Time
- Weighted Least Connection
- Agent Based Adaptive Balancing / Server Probes

Um die Komplexität zu steigern, soll zusätzlich eine "Session Persistence" (2 Punkte) implementiert werden.
Tests

Die Tests sollen so aufgebaut sein, dass in der Gruppe jedes Mitglied mehrere Server fahren und ein Gruppenmitglied mehrere Anfragen an den Load Balancer stellen. Für die Abnahme wird empfohlen, dass jeder Server eine Ausgabe mit entsprechenden Informationen ausgibt, damit die Verteilung der Anfragen demonstriert werden kann.

Modalitäten
-----------

Gruppenarbeit: 2 Personen
Abgabe: Protokoll mit Designüberlegungen / Umsetzung / Testszenarien, Sourcecode (mit allen notwendigen Bibliotheken), Java-Doc, Jar

Verpflichtender Zusatz
----------------------
Implementierung von verschiedenen Lastszenarien
- Memory
- CPU-Cycles
- I/O

Die Ehre diese Zusatzaufgabe zu implementieren wurde uns zuteil, da eine Hand voll Schüler unwissentlich gegen die nicht kommunizierten Richtlinien des Freitag-Morgen-Blues verstoßen haben.
Meiner Meinung nach ist die Bestrafung der Masse auf Grund des Wiederhandels Einzelner fragwürdig, sofern die potenziellen Missetäter im Vorfeld nicht informiert wurden. So entwickelt sich nämlich, die meiner Meinung nach letzte Instanz zur Disziplin, zu einer bedenklichen Aüßerung der handlungsbezogenen Auswegslosigkeit einer Person, deren Tag schlicht und einfach unter suboptimalen Bedingungen begann.


Viel Erfolg!

Quellen
-------

[1] "Praktische Arbeit 2 zur Vorlesung 'Verteilte Systeme' ETH Zürich, SS 2002", Prof.Dr.B.Plattner, übernommen von Prof.Dr.F.Mattern (http://www.tik.ee.ethz.ch/tik/education/lectures/VS/SS02/Praktikum/aufgabe2.pdf)
[2] http://www.tik.ee.ethz.ch/education/lectures/VS/SS02/Praktikum/loesung2.zip
