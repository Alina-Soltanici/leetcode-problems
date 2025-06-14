import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInteger(String s) {
        Map<Character, Integer> roman = new HashMap<> ();
        roman.put ('I', 1);
        roman.put ('V', 5);
        roman.put ('X', 10);
        roman.put ('L', 50);
        roman.put ('C', 100);
        roman.put ('D', 500);
        roman.put ('M', 1000);

        int total = 0;
        int previousValue = 0;
        //IX
        //iterate through the s from right to left
        for(int i = s.length ()-1; i >= 0; i--) {
            char c =  s.charAt (i); //
            int value = roman.get (c);

            if(value < previousValue) { //10 < 0?
                total-=value;
            } else {
                total+=value; //total = 10
            }
            previousValue = value; //10
        }

        return total;
    }
}
