import java.io.*;
import java.util.List;

public class SilnikLaczenia {
    private List<Kombinacja> kombinacje;
    private List<Element> elementy;

    public SilnikLaczenia(List<Kombinacja> kombinacje, List<Element> elementy) {
        this.kombinacje = kombinacje;
        this.elementy = elementy;
        wczytajOdkryteElementy(Config.SCIEZKA_ODKRYTE);
    }

    public Element polacz(Element e1, Element e2) {
        if (e1 == null || e2 == null) return null;

        for (Kombinacja k : kombinacje) {
            boolean dopasowanie1 = k.getElement1().getNazwa().equalsIgnoreCase(e1.getNazwa()) &&
                    k.getElement2().getNazwa().equalsIgnoreCase(e2.getNazwa());
            boolean dopasowanie2 = k.getElement1().getNazwa().equalsIgnoreCase(e2.getNazwa()) &&
                    k.getElement2().getNazwa().equalsIgnoreCase(e1.getNazwa());

            if (dopasowanie1 || dopasowanie2) {
                Element wynik = k.getWynik();
                if (!wynik.isCzyOdkryty()) {
                    wynik.setCzyOdkryty(true);
                    System.out.println("Odkryto nowy element: " + wynik.getNazwa());
                    System.out.println("Ciekawostka: " + wynik.getOpisNaukowy());
                    zapiszOdkryteElementy(Config.SCIEZKA_ODKRYTE);
                }
                return wynik;
            }
        }
        System.out.println("Nie znaleziono połączenia dla " + e1.getNazwa() + " + " + e2.getNazwa());
        return null;
    }

    private void zapiszOdkryteElementy(String sciezka) {
        try (FileWriter fw = new FileWriter(sciezka)) {
            for (Element e : elementy) {
                if (e.isCzyOdkryty()) {
                    fw.write(e.getNazwa() + "\n");
                }
            }
            System.out.println("(Zapisano odkryte elementy do pliku)");
        } catch (IOException ex) {
            System.out.println("Błąd zapisu: " + ex.getMessage());
        }
    }

    private void wczytajOdkryteElementy(String sciezka) {
        try (BufferedReader br = new BufferedReader(new FileReader(sciezka))) {
            String linia;
            while ((linia = br.readLine()) != null) {
                Element e = Element.znajdzElement(elementy, linia.trim());
                if (e != null) {
                    e.setCzyOdkryty(true);
                }
            }
            System.out.println("(Wczytano odkryte elementy z pliku)");
        } catch (IOException e) {
            System.out.println("Brak zapisanego postępu — zaczynamy od nowa.");
        }

        // ZAWSZE upewnij się, że podstawowe żywioły są odkryte
        zapewnijPodstawoweElementy();
    }

    private void zapewnijPodstawoweElementy() {
        String[] podstawoweElementy = {"Ogień", "Woda", "Ziemia", "Powietrze"};
        boolean dodanoJakies = false;

        for (String nazwa : podstawoweElementy) {
            Element e = Element.znajdzElement(elementy, nazwa);
            if (e != null && !e.isCzyOdkryty()) {
                e.setCzyOdkryty(true);
                dodanoJakies = true;
                System.out.println("Dodano podstawowy element: " + nazwa);
            }
        }

        // Jeśli dodano podstawowe elementy, zapisz do pliku
        if (dodanoJakies) {
            zapiszOdkryteElementy(Config.SCIEZKA_ODKRYTE);
        }
    }

    public void pokazOdkryteElementy() {
        System.out.println("\n=== Odkryte elementy ===");
        boolean czyJakies = false;
        for (Element e : elementy) {
            if (e.isCzyOdkryty()) {
                System.out.println("- " + e.getNazwa());
                czyJakies = true;
            }
        }
        if (!czyJakies) {
            System.out.println("Na razie nic nie odkryto!");
        }
    }

    public void resetujGre(String sciezkaZapisu) {
        // Reset flag odkrytych elementów
        for (Element e : elementy) {
            e.setCzyOdkryty(false);
        }

        // Oznacz podstawowe elementy jako odkryte
        String[] podstawoweElementy = {"Ogień", "Woda", "Ziemia", "Powietrze"};
        for (String nazwa : podstawoweElementy) {
            Element e = Element.znajdzElement(elementy, nazwa);
            if (e != null) {
                e.setCzyOdkryty(true);
            }
        }

        // Usuń i zapisz nowy plik
        File plik = new File(sciezkaZapisu);
        if (plik.exists()) {
            plik.delete();
        }

        zapiszOdkryteElementy(sciezkaZapisu);
        System.out.println("Gra zresetowana do stanu początkowego z 4 podstawowymi żywiołami.");
    }

    public List<Element> getElementy() {
        return elementy;
    }
}
