import java.util.*;

class CountFrequencyOfElements{

    public static void main(String args[]){
        List<String> list = Arrays.asList("B","A","B","C","D","A","B","A");

        Set<String> setObj = new HashSet<>(list);
        for(String str:setObj){
            System.out.println(str + ":" + Collections.frequency(list,str));
        }
    }
}