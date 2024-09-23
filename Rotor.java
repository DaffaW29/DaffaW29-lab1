public class Rotor {

    
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        //TODO
               
    }
    

    public int indexOf(char c){
        //TODO
        int indexPoint = indexOf(c);
        return indexPoint;
    }

    public char charAt(int idx){
        //TODO
        char charPoint = charAt(idx);
        return charPoint;
    }
}
    
