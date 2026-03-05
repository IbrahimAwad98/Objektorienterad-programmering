package Lessons;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        //try with resources (stänger automatisk)
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void readFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        //br.close(); automatisk här
    }

    //alternativ 1 med finally
    /*
     public static void readFile() throws IOException {
      BufferedReader reader = null;  // måste deklareras HÄR - utanför try!
        try {
            reader = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            if (reader != null) {
                reader.close();  // körs ALLTID - även om exception kastas
            }
        }
    }
     */

}