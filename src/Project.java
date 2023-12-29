import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Project {

    public static void main(String[] args) throws IOException {

       /* String text = "Scriere111";
        BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));

        writer.write(text);
        writer.close(); */

        String text = "\nAppend";
        BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt", true));
        System.out.println(System.getProperty("file.separator")); // ne arata cum sa folosim bara cand scrim calea
        System.out.println(java.io.File.separator);

        writer.append(text);
        writer.close();

        //de lucrat cu fisiere
        //un program care il am creeat, odata pornim programul introducem datele, odata pornim programul si afisam datele
        // si toate sa se pastreze intrun fisier, si sa se citeasca tot din fisier


    }
}
