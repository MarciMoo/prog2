package binarisfajlkezelesfeladatok;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.err;
import static java.lang.System.out;
import java.util.InputMismatchException;
import java.util.Scanner;

//EZ HALLGATÓI FELADAT IS VOLT

public class f7 {

    public static void main(String[] args) {
        beKi b = new beKi();
        b.be();
        b.ki();
    }
}
class beKi{
    float szam;
    public void be(){
    Scanner bill = new Scanner (System.in);
        try{
        FileOutputStream bki = new FileOutputStream("Teszt.bin");
        DataOutputStream ki = new DataOutputStream(bki);
        do{
            out.print("Kérek egy számot: ");
            try{
                szam = bill.nextInt();
                out.println(szam);
                ki.writeFloat(szam);
            }
            catch (InputMismatchException error){
                break;
            }
        }while(true);
        ki.close();
        }
        catch (IOException error){
            err.println("Írási hiba - " + error.getMessage());
        }
    }
    
    public void ki(){
        try{
            float num = 0, sum = 0; 
            FileInputStream bbe = new FileInputStream("Teszt.bin");
            DataInputStream be = new DataInputStream(bbe);
            boolean noteof = true;
            
            while (noteof){
                try{
                    szam = be.readFloat();
                    out.println(" " + szam);
                    sum += szam;
                    num++;
                }
                catch (EOFException e){ //Fájl vég
                    noteof = false;
                }
                
            }
            out.println("\nÁtalga  = " + sum/num);
        }
        
        catch (IOException error){
            err.println("Olvasási hiba - " + error.getMessage());
        }
    }
}