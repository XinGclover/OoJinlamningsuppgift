/*
 *  
Java18-OOJ
 */

package uppgift1.version2;

import javax.swing.JOptionPane;


public class Uppgift1Version2 {

  
    public static void main(String[] args) {
      Husdjurshotell healtypets= new Husdjurshotell(); 
      
    //Skapa databas av husdjurshotell HealtyPets       
      Husdjur h1= new Hund("Sixten",5000);
      Husdjur h2= new Hund("Dogge",10000);
      Husdjur k1= new Katt("Venus",5000);
      Husdjur k2= new Katt("Ove",3000);
      Husdjur o1= new Orm("Hypno",1000);
          
    //Lägg till husdjur i olika listar av husdjurshotell HealtyPets   
      healtypets.setHusdjurList(h1);
      healtypets.setHusdjurList(h2);
      healtypets.setHusdjurList(k1);
      healtypets.setHusdjurList(k2);
      healtypets.setHusdjurList(o1);
      
     while(true){
      String sokt= JOptionPane.showInputDialog("Vilket djur ska få mat?");
      if (sokt==null)
      break;
      
      JOptionPane.showMessageDialog(null,healtypets.sokDjur(sokt.trim()));     
    }   
    }

}
