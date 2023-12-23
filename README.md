MPiS
Zadanie (Kule i urny) Jednym z klasycznych modeli pro-babilistycznych, często rozważanym w kontekście zagadnień algorytmicznych, jest model kuli urn (ang.balls and bins).
Celem tego zadania jest eksperymentalne wyznaczenie następujących wielkości:
Bn – moment pierwszej kolizji; Bn=k, jeśli k-ta z wrzucanych kul jest pierwszą, któratrafiła do niepustej urny (paradoks urodzinowy, ang.birthday paradox),
Un – liczba pustych urn po wrzuceniu n kul,
Ln – maksymalna liczba kul w urnie po wrzuceniunkul (maximum load),
Cn – minimalna liczba rzutów, po której w ka ̇zdej z urn jest co najmniej jedna kula (pierwszy moment, po którym nie ma już pustych urn; problem kolekcjonera kuponów, ang.coupon collector’s problem),
Dn – minimalna liczba rzutów, po której w ka ̇zdej z urn są co najmniej dwie kule (thesiblings of the coupon collector / coupon collector’s brother),
Dn−Cn – liczba rzutów od momentu Cn potrzeba do tego, ̇zeby w każdej urnie były conajmniej dwie kule. Zaimplementuj symulacje polegające na wykonaniu dla każdego n ∈ {1000,2000, . . . ,100_000} po k = 50 niezależnych powtórzeń eksperymentu wrzucania kul do urn i wypisaniu wszystkich powyższych statystyk.
