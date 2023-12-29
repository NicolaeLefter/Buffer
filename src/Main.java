import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws IOException {


        File file = new File("fisier.txt");
        System.out.println(file.exists());

        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath()); // cea mai indepartata cale
        System.out.println(file.getPath()); // cea mai scurta cale

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.length()); // returneaza nr de octeti
        System.out.println(file.lastModified()); //numarul de milisecunde de cand a fost modificat
      //  System.out.println(file.delete()); //sterge tot fisierul
        File directory = new File("resurses/fisiere");
        directory.mkdirs();


        File directoryOne = new File("test");
        directoryOne.mkdir();

        File file1 = new File("test/file.txt");
       try {
           file1.createNewFile();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
        File file2 = new File("test/file2.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       File[] arrays =  directoryOne.listFiles();

        for (File f : arrays){
            System.out.println(f.getName());
        }

      /*  try(ObjectInputStream object = new ObjectInputStream(new BufferedInputStream(new FileInputStream("fisier.txt")))){
            System.out.println(object.readObject());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */



       /* Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println(str);
        } */

      //  StringBuilder stringBuilder = new StringBuilder();


        try(BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(file)), 100)){
            String line;
            while ((line = buffer.readLine()) !=null){
                System.out.println(line);
               // stringBuilder.append(line).append("\n");
            }
        } catch (Exception e){
            throw  new RuntimeException(e);
        }
      //  System.out.println(stringBuilder);

       /* try(FileInputStream inputStream = new FileInputStream(file)){
            int caracter;
            while ((caracter = inputStream.read()) != -1){
                System.out.println((char)caracter);
            }

        }catch (Exception e){
            throw  new RuntimeException(e);
        } */






    }
}
