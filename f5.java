package binarisfajlkezelesfeladatok;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.StringTokenizer;
public class f5 { 
    public static void main(String[] args) throws IOException{ 
        PrintStream ki = new PrintStream("Adatok.txt");
        kiir(ki);
        Scanner be = new Scanner(new File("Adatok.txt")); 
        out.println(be);
    } 
    private static void kiir(PrintStream f) { 
        Scanner sc = new Scanner (System.in, "ISO8859_2");
        String város;
        int lakó = 1;
        out.print("Kérem a sort: ");
        város = sc.nextLine();
        while(város.length() != 0){ 
            f.println(lakó + ". " + város);
            sc.nextLine();
            out.print("Kérem a sort: ");
            város = sc.nextLine();
        } 
        f.close(); 
    } 
}