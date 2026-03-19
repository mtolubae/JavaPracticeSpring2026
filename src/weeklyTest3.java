import java.util.*;

public class weeklyTest3 {
    public static void removeDuplicates(ArrayList<Integer> list){
        HashSet<Integer> seen = new HashSet<Integer>();
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            if (!seen.add(it.next())){
                it.remove();
            }
        }
    }

    public static String reverseWords(String s){
        String[] newStr = s.split(" ");
        Deque<String> deque = new ArrayDeque<>();

        for (String a: newStr) {
            deque.addLast(a);
        }
        StringBuilder answer = new StringBuilder();
        while (!deque.isEmpty()) {
            answer.append(deque.removeLast() + " ") ;
        }
        return answer.toString();


    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,5,3,7,9,7));
        System.out.println(nums);
        removeDuplicates(nums);
        System.out.println(nums);
        System.out.println(reverseWords("Hello world"));
    }
}
