import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Projekt {

   
 public static void main(String[] args) throws FileNotFoundException, IOException {

      System.out.println("Podaj ścieżke do pliku: ");
      Scanner scan = new Scanner(System.in);
      String sciezka = scan.next();


      int count =0;
      File file = new File(sciezka);
      FileInputStream fis = new FileInputStream(file);
      byte[] bytesArray = new byte[(int)file.length()];
      fis.read(bytesArray);
      String s = new String(bytesArray);
      String [] data = s.split(" ");
      for (int i=0; i<data.length; i++) {
         count++;
      }
      System.out.println("Ilość słów w pliku " +count);
   }
}