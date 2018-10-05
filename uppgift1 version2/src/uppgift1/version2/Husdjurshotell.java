/*
 *  
Java18-OOJ
 */
package uppgift1.version2;
import java.util.*;



public class Husdjurshotell {
    
     private List<Husdjur> djur= new LinkedList<>();
     
     public void setHusdjurList (Husdjur h){
       djur.add(h);
     }
     
     //Söka husdjur med namn som läsas in inom HusdjurListan
     public String sokDjur (String namn){
         for(Husdjur d:djur)
             if(namn.equalsIgnoreCase(d.getNamn()))
                 return d.getNamn()+" behöver "+d.foderNamn()+" "+d.foderGram()+" g.";
        return "Det finns inte den husdjur! Input igen.";
                         
     }
}
