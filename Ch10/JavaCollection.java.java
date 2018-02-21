import java.util.List;  // #1

public class JavaCollection {  // #2
   public static List<String> addOne(List<String> item) {  // #3
       for (int i = 0; i < item.size(); i++) {  // #4
           item.set(i, String.valueOf(Integer.valueOf(item.get(i))+1));  // #5
       }
       return item;  // #6
   }
}
