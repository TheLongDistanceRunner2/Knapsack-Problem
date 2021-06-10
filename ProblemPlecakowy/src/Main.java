import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static double Wmax = 100.0; // pojemnosc plecaka
    static List<Item> produkty = new ArrayList<>();
    static List<Integer> k = new ArrayList<>(); // wektor wynikowy
    static int valueOfTakenItems = 0; // wynik - wartość przedmiotów w plecaku na końcu algorytmu

    public static void main(String args[]) {
        // początkowo ustawiamy wszystkie elemeny wektora wynikowego na 0:
        k.add(0);
        k.add(0);
        k.add(0);
        k.add(0);
        k.add(0);
        k.add(0);

        // 7 przedmiotów p1:
        int iloscP1 = 7;
        Item p1_1 = new Item(10.0, 8.0, 0, iloscP1);
        Item p1_2 = new Item(10.0, 8.0, 0, iloscP1);
        Item p1_3 = new Item(10.0, 8.0, 0, iloscP1);
        Item p1_4 = new Item(10.0, 8.0, 0, iloscP1);
        Item p1_5 = new Item(10.0, 8.0, 0, iloscP1);
        Item p1_6 = new Item(10.0, 8.0, 0, iloscP1);
        Item p1_7 = new Item(10.0, 8.0, 0, iloscP1);

        // 5 przedmiotów p2:
        int iloscP2 = 5;
        Item p2_1 = new Item(9.0, 8.0, 1, iloscP2);
        Item p2_2 = new Item(9.0, 8.0, 1, iloscP2);
        Item p2_3 = new Item(9.0, 8.0, 1, iloscP2);
        Item p2_4 = new Item(9.0, 8.0, 1, iloscP2);
        Item p2_5 = new Item(9.0, 8.0, 1, iloscP2);

        // 4 przedmioty p3:
        int iloscP3 = 4;
        Item p3_1 = new Item(5.0, 9.0, 2, iloscP3);
        Item p3_2 = new Item(5.0, 9.0, 2, iloscP3);
        Item p3_3 = new Item(5.0, 9.0, 2, iloscP3);
        Item p3_4 = new Item(5.0, 9.0, 2, iloscP3);

        // 6 przedmiotow p4:
        int iloscP4 = 6;
        Item p4_1 = new Item(8.0, 10.0, 3, iloscP4);
        Item p4_2 = new Item(8.0, 10.0, 3, iloscP4);
        Item p4_3 = new Item(8.0, 10.0, 3, iloscP4);
        Item p4_4 = new Item(8.0, 10.0, 3, iloscP4);
        Item p4_5 = new Item(8.0, 10.0, 3 ,iloscP4);
        Item p4_6 = new Item(8.0, 10.0, 3 ,iloscP4);

        // 4 przedmioty p5:
        int iloscP5 = 4;
        Item p5_1 = new Item(10.0, 7.0, 4, iloscP5);
        Item p5_2 = new Item(10.0, 7.0, 4, iloscP5);
        Item p5_3 = new Item(10.0, 7.0, 4, iloscP5);
        Item p5_4 = new Item(10.0, 7.0, 4, iloscP5);

        // 3 przedmioty p6:
        int iloscP6 = 3;
        Item p6_1 = new Item(12.0, 10.0, 5, iloscP6);
        Item p6_2 = new Item(12.0, 10.0, 5, iloscP6);
        Item p6_3 = new Item(12.0, 10.0, 5, iloscP6);

        //dodajemy produkty do listy:
        produkty.add(p1_1);
        produkty.add(p1_2);
        produkty.add(p1_3);
        produkty.add(p1_4);
        produkty.add(p1_5);
        produkty.add(p1_6);
        produkty.add(p1_7);

        produkty.add(p2_1);
        produkty.add(p2_2);
        produkty.add(p2_3);
        produkty.add(p2_4);
        produkty.add(p2_5);

        produkty.add(p3_1);
        produkty.add(p3_2);
        produkty.add(p3_3);
        produkty.add(p3_4);

        produkty.add(p4_1);
        produkty.add(p4_2);
        produkty.add(p4_3);
        produkty.add(p4_4);
        produkty.add(p4_5);
        produkty.add(p4_6);

        produkty.add(p5_1);
        produkty.add(p5_2);
        produkty.add(p5_3);
        produkty.add(p5_4);

        produkty.add(p6_1);
        produkty.add(p6_2);
        produkty.add(p6_3);

//        // 7 przedmiotów p1:
//        int iloscP1 = 5;
//        Item p1_1 = new Item(10.0, 9.0, 0, iloscP1);
//        Item p1_2 = new Item(10.0, 9.0, 0, iloscP1);
//        Item p1_3 = new Item(10.0, 9.0, 0, iloscP1);
//        Item p1_4 = new Item(10.0, 9.0, 0, iloscP1);
//        Item p1_5 = new Item(10.0, 9.0, 0, iloscP1);
//
//        // 5 przedmiotów p2:
//        int iloscP2 = 6;
//        Item p2_1 = new Item(8.0, 12.0, 1, iloscP2);
//        Item p2_2 = new Item(8.0, 12.0, 1, iloscP2);
//        Item p2_3 = new Item(8.0, 12.0, 1, iloscP2);
//        Item p2_4 = new Item(8.0, 12.0, 1, iloscP2);
//        Item p2_5 = new Item(8.0, 12.0, 1, iloscP2);
//        Item p2_6 = new Item(8.0, 12.0, 1, iloscP2);
//
//        // 4 przedmioty p3:
//        int iloscP3 = 4;
//        Item p3_1 = new Item(9.0, 10.0, 2, iloscP3);
//        Item p3_2 = new Item(9.0, 10.0, 2, iloscP3);
//        Item p3_3 = new Item(9.0, 10.0, 2, iloscP3);
//        Item p3_4 = new Item(9.0, 10.0, 2, iloscP3);
//
//        // 6 przedmiotow p4:
//        int iloscP4 = 2;
//        Item p4_1 = new Item(7.0, 8.0, 3, iloscP4);
//        Item p4_2 = new Item(7.0, 8.0, 3, iloscP4);
//
//        // 4 przedmioty p5:
//        int iloscP5 = 10;
//        Item p5_1 = new Item(4.0, 7.0, 4, iloscP5);
//        Item p5_2 = new Item(4.0, 7.0, 4, iloscP5);
//        Item p5_3 = new Item(4.0, 7.0, 4, iloscP5);
//        Item p5_4 = new Item(4.0, 7.0, 4, iloscP5);
//        Item p5_5 = new Item(4.0, 7.0, 4, iloscP5);
//        Item p5_6 = new Item(4.0, 7.0, 4, iloscP5);
//        Item p5_7 = new Item(4.0, 7.0, 4, iloscP5);
//        Item p5_8 = new Item(4.0, 7.0, 4, iloscP5);
//        Item p5_9 = new Item(4.0, 7.0, 4, iloscP5);
//        Item p5_10 = new Item(4.0, 7.0, 4, iloscP5);
//
//        // 3 przedmioty p6:
//        int iloscP6 = 8;
//        Item p6_1 = new Item(6.0, 9.0, 5, iloscP6);
//        Item p6_2 = new Item(6.0, 9.0, 5, iloscP6);
//        Item p6_3 = new Item(6.0, 9.0, 5, iloscP6);
//        Item p6_4 = new Item(6.0, 9.0, 5, iloscP6);
//        Item p6_5 = new Item(6.0, 9.0, 5, iloscP6);
//        Item p6_6 = new Item(6.0, 9.0, 5, iloscP6);
//        Item p6_7 = new Item(6.0, 9.0, 5, iloscP6);
//        Item p6_8 = new Item(6.0, 9.0, 5, iloscP6);

//    // dodajemy produkty do listy:
//        produkty.add(p1_1);
//        produkty.add(p1_2);
//        produkty.add(p1_3);
//        produkty.add(p1_4);
//        produkty.add(p1_5);
//
//        produkty.add(p2_1);
//        produkty.add(p2_2);
//        produkty.add(p2_3);
//        produkty.add(p2_4);
//        produkty.add(p2_5);
//        produkty.add(p2_6);
//
//        produkty.add(p3_1);
//        produkty.add(p3_2);
//        produkty.add(p3_3);
//        produkty.add(p3_4);
//
//        produkty.add(p4_1);
//        produkty.add(p4_2);
//
//        produkty.add(p5_1);
//        produkty.add(p5_2);
//        produkty.add(p5_3);
//        produkty.add(p5_4);
//        produkty.add(p5_5);
//        produkty.add(p5_6);
//        produkty.add(p5_7);
//        produkty.add(p5_8);
//        produkty.add(p5_9);
//        produkty.add(p5_10);
//
//        produkty.add(p6_1);
//        produkty.add(p6_2);
//        produkty.add(p6_3);
//        produkty.add(p6_4);
//        produkty.add(p6_5);
//        produkty.add(p6_6);
//        produkty.add(p6_7);
//        produkty.add(p6_8);

        // sortujemy tablicę według wag:
        Collections.sort(produkty, new Comparator<Item>() {
            @Override
            public int compare(Item one, Item other) {
                // -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
                return one.getQuotient() >= other.getQuotient() ? -1 : (one.getQuotient() < other.getQuotient()) ? 1 : 0;
            }
        });

        int n = produkty.size();
        int tmpK = 0;
        int iloscTegoPrzedmiotu = produkty.get(0).getQuantityOfThisKindOfItem();

        // 2) dla wszystkich przedmiotow:
        for (int i = 0; i < n; i++) {
            // gdy pozostała waga w plecaku spadnie ponizej 0 przerywamy:
            if (Wmax <= 0) {
                break;
            }

            // gdy ilosc analizowanego przedmiotu zmalała do zera:
            if (iloscTegoPrzedmiotu == 0) {
                // pobieramy wartosc kolejnego przedmiotu:
                iloscTegoPrzedmiotu = produkty.get(i).getQuantityOfThisKindOfItem();

                // dodajemy k to wektora wynikowego:
                int index = produkty.get(i - 1).getNumberInArray();

                if (k.get(index) == 0) {
                    k.set(index, tmpK);
                }

                // dodajemy (WCZEŚNIEJSZY PRODUKT) do sumy wartości przedmiotów w plecaku:
                valueOfTakenItems += (produkty.get(i - 1).getPrice() * tmpK);

                // 2b)                (WCZEŚNIEJSZY PRODUKT)
                Wmax -= (tmpK * produkty.get(i - 1).getWeight());

                // przywracamy wartosc tmpK:
                tmpK = 0;
            }

            Item tmpItem = produkty.get(i);

            // zwiekszamy wartosc tmpK:
            tmpK++;

            // 2a) dopóki wi * ki <= Wmax i typ analizowanego przedmiotu się nie wyczerpał:
            if (tmpItem.getWeight() * tmpK <= Wmax && iloscTegoPrzedmiotu > 0) {
                iloscTegoPrzedmiotu--;
            }
            // sztucznie przerywamy gdy powyższy warunek nie został spełniony
            else {
                iloscTegoPrzedmiotu = 0;
                // zmniejszamy wartosc k o 1:
                tmpK--;
            }
        }

        System.out.println("value of taken items(C):  " + valueOfTakenItems);
        System.out.print("k vector: [");

        for (int i = 0; i < k.size(); i++) {
            if (i >= 0 && i < (k.size() - 1)) {
                System.out.print(k.get(i) + ", ");
            }
            else {
                System.out.print(k.get(i));
            }
        }

        System.out.println("]");
    }
}
