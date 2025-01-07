import java.util.ArrayList;
import java.util.List;

public class Subsets {
    List<List<Integer>> output = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums){
        int n = nums.length;
        helper(0, new ArrayList<>(),nums);
        return output;
    }
    public void helper(int first,ArrayList<Integer> curr,int[] nums){
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
        Subsets solution = new Subsets();
        int[] nums = {1,2,3};
        List<List<Integer>> result = solution.subsets(nums);
        System.out.println(result);
    }
}