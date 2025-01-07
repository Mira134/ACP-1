import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;


public class Dup{
    Set<List<Integer>> output = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        helper(0, new ArrayList<Integer>(), nums);
        List<List<Integer>> ans = new ArrayList(output);
        return ans;
    }
    public void helper(int first, ArrayList<Integer> curr,int[] nums){
        if(first == nums.length){
            output.add(new ArrayList<>(curr));
            return;
        }
        helper(first + 1,curr,nums);

        curr.add(nums[first]);
        helper(first + 1,curr,nums);

        curr.remove(curr.size() - 1);
    }
    public static void main(String[] args){
        Dup solution = new Dup();
        int[] nums = {1, 2,2};
        List<List<Integer>> result = solution.Dup(nums);
        System.out.println(result);
    }
}