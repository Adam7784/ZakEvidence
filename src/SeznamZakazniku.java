import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeznamZakazniku {
    public static void main(String[] args) {
        List<Zakaznik> seznamZakazniku = new ArrayList<>();
        File soubor = new File("vstup.txt");
        try {
            Scanner scannerSouboru = new Scanner(soubor);
            while (scannerSouboru.hasNextLine()){
                String radek = scannerSouboru.nextLine();
                Scanner scannerRadku = new Scanner(radek);
                scannerRadku.useDelimiter(":");
                Zakaznik zakaznik3 = new Zakaznik(scannerRadku.next(), scannerRadku.next());
                //pocetProdeju byl původně int ale z nějakého důvodu mně potom nefungoval výpis proto jsem změnil datový typ na String
                Zakaznik zakaznik1 = new Zakaznik("100","Jaroš");
                Zakaznik zakaznik2 = new Zakaznik("10","Karel");
                seznamZakazniku.add(zakaznik1);
                seznamZakazniku.add(zakaznik3);
                seznamZakazniku.add(zakaznik2);
                int index = seznamZakazniku.size() - 1;
                seznamZakazniku.remove(index);
                System.out.println(seznamZakazniku);
            }
            scannerSouboru.close();
            for (Zakaznik z:seznamZakazniku) {
                System.out.println("Jméno: "+z.getJmeno());
                System.out.println("Počet prodejů: "+z.getPocetProdeju());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Soubor "+soubor.getName()+" nebyl nalezen");
        }
        try (Writer myWriter = new FileWriter("vstup",true)){
            myWriter.write("\r\n");
            myWriter.write("58:Pepa");
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}