package sunkissed;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;

public class Sunkissed {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ki = new PrintStream("Adatok.txt");
        kiir(ki);
        Scanner be = new Scanner(new File("Adatok.txt")); 
        out.println("sorok karakterszámai: " + nagy(be));
    }
     private static void kiir(PrintStream f) { 
        Scanner sc = new Scanner (System.in, "ISO8859_2");
        String város;
        int lakó;
        out.print("Kérek egy sort: ");
        város = sc.nextLine();
        while(város.length() != 0){ 
            f.println(város);
            out.print("Kérek egy sort: ");
            város = sc.nextLine();
        } 
        f.close(); 
    }
     private static ArrayList<Integer> nagy(Scanner f) { 
        ArrayList<Integer> szám = new ArrayList<>();
        String sor;
        while(f.hasNext()){ 
            sor = f.nextLine();
            szám.add(sor.length());
        } 
        f.close();
        return szám;
     }
}
