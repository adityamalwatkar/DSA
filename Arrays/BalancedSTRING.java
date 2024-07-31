import java.util.HashMap;

public class BalancedSTRING {
    public static void main(String[] args) {
        String str = "{}()[]{}";

    boolean containsNonZeroElement = isBalancedString(str);
        if(containsNonZeroElement){
            System.out.println("Not balanced");
        }
        else {
            System.out.println("Balanced");
        }
    }

    public static boolean isBalancedString(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        char[] charARR = str.toCharArray();

        for (int i = 0; i < charARR.length; i++){
            System.out.println(charARR[i]);
            if(!map.containsKey(charARR[i])){
                if(charARR[i] == '{' || charARR[i] == '[' || charARR[i] == '('){
                    map.put(charARR[i], 1);
                }
                if(charARR[i] == '}'){
                    map.put('{',map.get('{')-1);
                }
                if(charARR[i] == ']'){
                    map.put('[',map.get('[')-1);
                }
                if(charARR[i] == ')'){
                    map.put('(',map.get('(')-1);
                }
            }else {
                map.put(charARR[i], map.get(charARR[i]) + 1);
            }

        }

        boolean containsNonZeroElement = false;

        for(int val: map.values()){
            if(val != 0){
                containsNonZeroElement = true;
                break;
            }
        }
        return containsNonZeroElement;
    }
}
