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
        //also realized that i was rotating wrong, now it moves the end to the front as opposed to the front to the end
        this.rotorValues = this.rotorValues.charAt(26) + this.rotorValues.substring(0,26);
        if (this.rotorValues.charAt(0) == this.startChar) {
            return true;
        } else {
            return false;
        }
               
    }
    

    public int indexOf(char c){
        //TODO
        int indexPoint = rotorValues.indexOf(c);
        return indexPoint;
    }

    public char charAt(int idx){
        //TODO
        char charPoint = rotorValues.charAt(idx);
        return charPoint;
    }
}
    
