/*
 *  
Java18-OOJ
 */
package uppgift1.version2;


public class Hund extends Husdjur {
    
    public Hund(){     
    }
    public Hund(String namn, int vikt) {
        super(namn, vikt);
    }
    
    //Override metoden som sätter viss fod som behövs
    public String foderNamn(){
        return "Hundfoder";
    }
    //Override metoden som räknar vikt av viss fod som behövs
    public int foderGram() {
        return super.getVike()/100;
    }   
}
