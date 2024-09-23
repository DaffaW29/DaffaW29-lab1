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
        // so im trying to figure out how to utilize the indexOf method
        //what I think is that we can indexOf the startchar then count till we get there
        // that way we dont need to compare every time. but i think both work
        this.rotorValues = this.rotorValues.substring(1,27) + this.rotorValues.charAt(0);
        if (this.rotorValues.charAt(0) == this.startChar) {
            return true;
        } else {
            return false;
        }
               
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
    
