package 탐색알고리즘.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DFS_ex1 {
    public ArrayList<String> search(HashMap<String, ArrayList<String>> fuc,String start){
        ArrayList<String> visited = new ArrayList<String>();
        ArrayList<String> needVisit = new ArrayList<String>();

        needVisit.add(start);

        while(needVisit.size()>0){
            String node = needVisit.remove(needVisit.size()-1);
            if(!visited.contains(node)){
                visited.add(node);
                needVisit.addAll(fuc.get(node));
            }
        }
        return visited;
    }




    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> search = new HashMap<String, ArrayList<String>>();
        search.put("A",new ArrayList<String>(Arrays.asList("B","C")));
        search.put("B", new ArrayList<String>(Arrays.asList("A","D")));
        search.put("C", new ArrayList<String>(Arrays.asList("A","G","H","I")));
        search.put("D", new ArrayList<String>(Arrays.asList("B","E","F")));
        search.put("E", new ArrayList<String>(Arrays.asList("D")));
        search.put("F", new ArrayList<String>(Arrays.asList("D")));
        search.put("G", new ArrayList<String>(Arrays.asList("C")));
        search.put("H", new ArrayList<String>(Arrays.asList("C")));
        search.put("I", new ArrayList<String>(Arrays.asList("C","J")));
        search.put("J", new ArrayList<String>(Arrays.asList("I")));

        DFS_ex1 test = new DFS_ex1();
        System.out.println(test.search(search,"A"));

    }
}
