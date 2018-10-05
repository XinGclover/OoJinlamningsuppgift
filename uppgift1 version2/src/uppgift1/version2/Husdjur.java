/*
 *  
Java18-OOJ
 */
package uppgift1.version2;


public class Husdjur implements IFoder {
    private String namn;
    private int vikt;
    private String fodnamn;
    private int fodvikt;
    
        
    public Husdjur(){     
    }
    
    public Husdjur(String namn,int vikt){
        this.namn=namn;
        this.vikt=vikt;   
    }
    
    public String getNamn(){
        return namn;
    }
    
    public int getVike(){
        return vikt;
    }

    @Override
    public String foderNamn() {
        return fodnamn;
    }

    @Override
    public int foderGram() {
        return fodvikt;
    }
      
}
