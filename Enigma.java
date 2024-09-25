public class Enigma{

    private String rotorInit[] = {"#GNUAHOVBIPWCJQXDKRYELSZFMT",
        "#EJOTYCHMRWAFKPUZDINSXBGLQV",
        "#BDFHJLNPRTVXZACEGIKMOQSUWY",
        "#NWDKHGXZVRIFJBLMAOPSCYUTQE",
        "#TGOWHLIFMCSZYRVXQABUPEJKND"};


    private Rotor rotors[];
        
    public Enigma(int id1, int id2, int id3, String start){
        //looks like the rotor 0 is the inside, rotor 1 is middle, rotor 2 is the outside
        rotors = new Rotor[3];
        rotors[0] = new Rotor(rotorInit[id1-1], start.charAt(0));
        rotors[1] = new Rotor(rotorInit[id2-1], start.charAt(1));
        rotors[2] = new Rotor(rotorInit[id3-1], start.charAt(2));
        
    }


    public String decrypt(String message){        
        //TODO
        //plan is to 1) get the index of the first char top
        //2) get the char from that same index from middle
        //3) take get char and find the index of it from the outer
        //4) get the index and use it to get the char from the inner
        //5) determine whatever character is in the second and call the rotate to that
        //6) rotate
        String result = "";
        for (int i = 0; i < message.length(); i++) {
            char eChar = message.charAt(i);
            //step 1
            int indexOut = rotors[2].indexOf(eChar);
            //step 2
            char charMid = rotors[1].charAt(indexOut);
            //step 3
            int indexOutAgain = rotors[2].indexOf(charMid);
            //step 4
            char charIn = rotors[0].charAt(indexOutAgain);
            //step 5
            result += charIn;
            //step 6
            rotors[0].rotate();
        }
        return result;
    }


    
    public String encrypt(String message){
        //TODO
        //1) find the char on inside
        //2) take the index of that to get the char outside
        //3) find that outside character in middle
        //4) take the index of that middle to get the outside
        //5) add and rotate
        String result = "";
        for (int i = 0; i < message.length(); i++) {
            char dChar = message.charAt(i);
            //step 1
            int indexIn = rotors[0].indexOf(dChar);
            //step 2
            char charOut = rotors[2].charAt(indexIn);
            //step 3
            int indexMid = rotors[1].indexOf(charOut);
            //step 4
            char charOutAgain = rotors[2].charAt(indexMid);
            //step 5
            result += charOutAgain;
            //step 6
            rotors[0].rotate();
        }
        return result;
    }
    
    private void rotate(){
        if(rotors[0].rotate()){
            if(rotors[1].rotate()){
                rotors[2].rotate();
            }
        }
    }
    
}
