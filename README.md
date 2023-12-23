# MPiS: Zadanie (Kule i urny)<br />
Jednym z klasycznych modeli pro-babilistycznych, często rozważanym w kontekście zagadnień algorytmicznych, jest model kuli urn (ang.balls and bins).<br />
<br />
Celem tego zadania jest eksperymentalne wyznaczenie następujących wielkości:<br />
<br />
**Bn** – moment pierwszej kolizji; Bn=k, jeśli k-ta z wrzucanych kul jest pierwszą, któratrafiła do niepustej urny (paradoks urodzinowy, ang.birthday paradox),<br />
**Un** – liczba pustych urn po wrzuceniu n kul,<br />
**Ln** – maksymalna liczba kul w urnie po wrzuceniunkul (maximum load),<br />
**Cn** – minimalna liczba rzutów, po której w ka ̇zdej z urn jest co najmniej jedna kula (pierwszy moment, po którym nie ma już pustych urn; problem kolekcjonera kuponów, ang.coupon collector’s problem),<br />
**Dn** – minimalna liczba rzutów, po której w ka ̇zdej z urn są co najmniej dwie kule (thesiblings of the coupon collector / coupon collector’s brother),<br />
**Dn−Cn** – liczba rzutów od momentu Cn potrzeba do tego, ̇zeby w każdej urnie były conajmniej dwie kule. Zaimplementuj symulacje polegające na wykonaniu dla każdego n ∈ {1000,2000, . . . ,100_000} po k = 50 niezależnych powtórzeń eksperymentu wrzucania kul do urn i wypisaniu wszystkich powyższych statystyk.<br />
