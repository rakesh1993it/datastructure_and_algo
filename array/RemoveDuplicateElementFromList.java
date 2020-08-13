import java.util.*;

class RemoveDuplicateElementFromList{
    public static void main(String args[]){
        List<Integer> duplist = new ArrayList(Arrays.asList(1,2,3,2,1,4,5,3,2,4,5));

        Set<Integer> setObj = new LinkedHashSet<>(duplist);
        List<Integer> removeDuplist = new ArrayList<>(setObj);
        System.out.println(removeDuplist);
    }
}