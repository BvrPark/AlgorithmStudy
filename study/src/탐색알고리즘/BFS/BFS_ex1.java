package 탐색알고리즘.BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BFS_ex1 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> search = new HashMap<String, ArrayList<String>>();
        search.put("A",new ArrayList<String>(Arrays.asList("B","C")));
        System.out.println(search);
    }
}
