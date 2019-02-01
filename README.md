Useremo questa base scaricando da git il folder “Java”
https://github.com/emilybache/GildedRose-Refactoring-Kata/tree/master/Java

INTRODUCIAMO IL SISTEMA:
Tutti gli articoli (Item) hanno una proprietà sellIn che indica il numero di giorni in cui dobbiamo venderla.
Tutti gli articoli hanno una proprietà di qualità che denota quanto sia prezioso l'oggetto.
Alla fine di ogni giorno, il nostro sistema decrementa entrambi i valori per ciascun articolo utilizzando il metodo updateQuality.

    • Una volta superata la data di vendita consigliata, la qualità si riduce al doppio della velocità.
    • La qualità di un articolo non è mai negativa.
    • Il "brie cheese invecchiato" (brie invecchiato) aumenta la sua qualità man mano che invecchia.
    • La sua qualità aumenta di 1 unità ogni giorno
    • dopo la data di vendita la sua qualità aumenta di 2 unità al giorno
    • La qualità di un articolo non è mai superiore a 50
    • L'articolo "Sulfuras" (Sulfuras), essendo un articolo leggendario, non modifica la sua data di vendita né degrada in qualità
    • Un "Entry to the Backstage", come il formaggio brie, aumenta la sua qualità con l'avvicinarsi della data di vendita
    • se rimangono 10 giorni o meno per il concerto, la qualità aumenta di 2 unità se mancano 5 giorni o meno, la qualità aumenta di 3 unità
    • dopo la data di vendita la qualità scende a 0


REQUISITI:

    1. Pulire e ottimizzare la classe GildedRose
Sentiti libero di apportare eventuali modifiche al messaggio updateQuality e aggiungi il codice se necessario, purché tutto funzioni correttamente. Tuttavia, non modificare l'oggetto Item o le sue proprietà.

    2. E’ necessario creare un'interfaccia REST con due metodi:
Modifica la qualità di tutti gli elementi esistenti
Mostra tutti gli oggetti esistenti.
È possibile utilizzare Spring per creare il livello di comunicazione Web.

    3. Si richiede che per ogni giornata trascorsa (ogni lancio di updateQuality) le informazioni risultanti vengano salvate all’interno di un database; per questa implementazione utilizzare un framework come myBatis, Hibernate o uno a scelta.

    4. Si prevede che l'uso dei test verifichi che la funzionalità sia corretta.
