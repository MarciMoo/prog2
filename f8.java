package binarisfajlkezelesfeladatok;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;

public class f8 {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ki = new PrintStream("Adatok.txt");
        kiir(ki);
        Scanner be = new Scanner(new File("Adatok.txt")); 
        out.println("sorok numerikuskarakterszámai: " + nagy(be));
    }
     private static void kiir(PrintStream f) { 
        Scanner sc = new Scanner (System.in, "ISO8859_2");
        String sor;
        out.print("Kérek egy sort: ");
        sor = sc.nextLine();
        while(sor.length() != 0){ 
            f.println(sor);
            out.print("Kérek egy sort: ");
            sor = sc.nextLine();
        } 
        f.close(); 
    }
     private static ArrayList<Integer> nagy(Scanner f) { 
        ArrayList<Integer> szám = new ArrayList<>();
        String sor;
        while(f.hasNext()){ 
            int a = 0;
            sor = f.nextLine();
            for(int i = 0; i < sor.length(); i++){
                if(sor.charAt(i) >= 0 && sor.charAt(i) <= 9){
                    a++;
                }
            }
            szám.add(a);
            a = 0;
        } 
        f.close();
        return szám;
     }
}
