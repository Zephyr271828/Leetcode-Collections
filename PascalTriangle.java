package Leetcode;

import java.util.*;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            if (i > 1){
                for(int j = 0; j < i - 1; j++) tmp.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j + 1));
            }
            if (i >= 1) tmp.add(1);
            ans.add(tmp);
        }
        return ans;
    }
}
