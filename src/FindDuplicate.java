import java.util.*;

public class FindDuplicate {
    public void solution1(char[] lst){
        int res = 0;
        for(int i = 0; i < lst.length; i++){
            for(int j = i + 1; j < lst.length; j++){
                if(lst[i] == lst[j]){
                    res = j;
                    break;
                }
            }
        }
        if(res > 0) System.out.print(res);
        else System.out.print("Nothing found");
    }

    public void solution2(char[] lst){
        Set<Character> set = new HashSet<>();
        int res = 0;
        for(int i = 0; i < lst.length; i++){
            if(!set.add(lst[i])){
                res = i;
                break;
            }
        }
        if(res > 0) System.out.println(res);
        else System.out.println("Nothing Found");
    }

    public static void main(String[] args) {
        char[] lst1 = {'a','b','c','a','d','e','f'};
        char[] lst2 = {'a','b','c','l','d','e','b'};
        FindDuplicate obj = new FindDuplicate();
        obj.solution2(lst2);
    }
}
