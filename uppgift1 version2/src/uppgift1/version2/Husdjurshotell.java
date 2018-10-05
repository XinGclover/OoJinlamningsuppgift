/*
 *  
Java18-OOJ
 */
package uppgift1.version2;
import java.util.*;


/**
 *
 * @author xingao
 */
public class Husdjurshotell {
    
     private List<Husdjur> djur= new LinkedList<>();
     public void setHusdjurList2 (Husdjur h){
       djur.add(h);
     }
     
     public String sokDjur2 (String namn){
         for(Husdjur d:djur)
             if(namn.equalsIgnoreCase(d.getNamn()))
                 return d.getNamn()+" behöver "+d.foderNamn()+" "+d.foderGram()+" g.";
        return "Det finns inte den husdjur! Input igen.";
                         
     }
}
