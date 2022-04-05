package binarisfajlkezelesfeladatok;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.Scanner;
import static java.lang.System.err;
import java.io.IOException;
import java.io.RandomAccessFile;
public class f3 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ki = new PrintStream("Adatok.txt");
        kiir(ki);
        Scanner be = new Scanner(new File("Adatok.txt")); 
        nagy(be);
        Scanner be2 = new Scanner(new File("Teszt.txt"));
        out.println("sorok karakterszámai: " + be2);
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
     private static String nagy(Scanner f) throws FileNotFoundException{ 
        RandomAccessFile file = new RandomAccessFile("Teszt.txt", "rw");        
        String szám = "";
        String sor;
        try{
            while(f.hasNext()){ 
                sor = f.nextLine();
                file.write(sor.length());
            } 
            f.close();
        }catch (IOException error){ 
            err.println("Fájl hiba - " + error.getMessage());
        } 
        return szám;
     }
}
