import java.util.ArrayList;
import java.util.List;

public class Main2ProgramowanieDynamiczne {
    static double Wmax = 30.0; // pojemnosc plecaka
    static List<Item> produkty = new ArrayList<>();
    static int valueOfTakenItems = 0; // wynik - wartość przedmiotów w plecaku na końcu algorytmu

    public static void main(String args[]) {
        // początkowo ustawiamy wszystkie elemeny wektora wynikowego na 0:

        // p1:
        Item p1_1 = new Item(10.0, 8.0, 0);

        // p2:
        Item p2_1 = new Item(9.0, 8.0, 1);

        // p3:
        Item p3_1 = new Item(5.0, 9.0, 2);

        // p4:
        Item p4_1 = new Item(8.0, 10.0, 3);

        // p5:
        Item p5_1 = new Item(10.0, 7.0, 4);

        // p6:
        int iloscP6 = 3;
        Item p6_1 = new Item(12.0, 10.0, 5, iloscP6);

        //dodajemy produkty do listy:
        produkty.add(p1_1);
        produkty.add(p2_1);
        produkty.add(p3_1);
        produkty.add(p4_1);
        produkty.add(p5_1);
        produkty.add(p6_1);

        int n = produkty.size();
        int m = (int)Wmax;

        // budujemy tablicę:
        int[][] tab = new int[n + 1][m + 1];
        int[][] k = new int[n + 1][m + 1]; // wektor wynikowy

        // budujemy tablicę wypełniając ją początkowo samymi zerami:
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                tab[i][j] = 0;
            }
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                // pierwszy rząd i pierwsza kolumna zostaje wypełniona zerami:
                if (i == 0 || j == 0) {
                    tab[i][j] = 0;
                }
                // jesli waga i-1 produktu jest mniejsza od j
                else if (produkty.get(i - 1).getWeight() <= j) {
                    // uzupełniamy tablicę k:
                    if (produkty.get(i - 1).getWeight() <= j
                            && (tab[i - 1][j] < (int)produkty.get(i - 1).getPrice() + tab[i - 1][j - (int)produkty.get(i - 1).getWeight()])) {
                        k[i][j] = 1;
                    }
                    else {
                        k[i][j] = 0;
                    }

                    tab[i][j] = Math.max(tab[i - 1][j], (int)produkty.get(i - 1).getPrice() + tab[i - 1][j - (int)produkty.get(i - 1).getWeight()]);
                }
                else {
                    tab[i][j] = tab[i - 1][j];
                }


            }
        }

        System.out.println("value of taken items(C): " + tab[n][m]);

        int _j = (int)Wmax;

        System.out.print("k: [ ");
        for (int i = n; i > 0; i--) {
            if (k[i][_j] == 1) {
                System.out.print(k[i][_j] + " ");
            }
            else {
                _j -= produkty.get(i).getWeight();
            }
        }
        System.out.print("]");


    }
}
