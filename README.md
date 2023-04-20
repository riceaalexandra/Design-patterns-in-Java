# Design-patterns-in-Java
This repository contains Java implementations of four commonly used design patterns, namely Singleton, Adapter, Observer, and Factory. <br> <br>
h2.1 Utilizați Singleton Pattern într-o clasă Config, pentru a accesa date dintr-un fișier
(optional) JSON, considerat a fi de configurare. Fișierul conține o setare pentru string color în format
#RRGGBB și int weight. Conținutul fișierului poate fi: {"color":"#F3AA34","weight": 23}. Clasa Config
are membrii publici getColor si getWeight prin care permite accesul la variabilele menționate. Clasa
citește datele din fișier doar la prima accesare.<br> <br>
h2.2. Proiectați o clasă C1, care să permită citirea a două numere de la tastatură si
calculul sumei lor, prin apelul unei metode publice getSum(). Proiectați o clasă C2, care primește ca
parametru un string JSON cu două chei, n1 și n2 și permite accesul la numerele corespunzătoare
cheilor n1 și n2. Investigați dezvoltarea unui adaptor al clasei C2 la C1 care să permită calculul sumei
celor două chei. Se poate folosi următorul mod de utilizare: C1 instanceOfC1 = new
C1Adapter(instanceOfC2), instanceOfC1. getSum() <br> <br>
h2.3. Proiectați o clasă C2Nr care să permită calculul sumei a două numere și o clasă
C3Nr care să permită calculul sumei a trei numere. Scrieți o clasă de tip Adapter care sa poate
calcula suma a doua numere folosind suma a 3 numere. <br> <br>
h2.4 Mai multe aparate electrice sunt conectate la un prelungitor. Prelungitorul nu
este băgat în priză. Când prelungitorul este băgat în priză, toate aparatele conectate trebuie să dea
un mesaj. <br> <br>
h2.5. Design solution for computing area of rectangle passing 2 float numbers (width
and height) and circle, passing one float number (radius). How can I give the two numbers or one
number to the class ? What can I get the area of the selected shape ? Investigate if possible to use
Factory to decide what Shape is involved.
