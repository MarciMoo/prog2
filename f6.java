package binarisfajlkezelesfeladatok;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
public class f6 { 
    public static void main(String[] args) throws IOException{
        FileOutputStream bki = new FileOutputStream("Adatok.txt"); 
        DataOutputStream ki = new DataOutputStream(bki); 
        kiir(bki);
        Scanner be = new Scanner(new File("Adatok.txt")); 
        out.println(be);
    } 
    private static void kiir(FileOutputStream f) { 
        Scanner sc = new Scanner (System.in, "ISO8859_2");
        String város;
        int lakó = 1;
        out.print("Kérem a sort: ");
        város = sc.nextLine();
        while(város.length() != 0){ 
            f.writeLine(lakó + ". " + város);
            sc.nextLine();
            out.print("Kérem a sort: ");
            város = sc.nextLine();
        } 
        f.close(); 
    } 
}