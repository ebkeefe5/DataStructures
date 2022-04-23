import java.util.Set;
import java.util.HashSet;

class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (Integer num: nums)
        {
            if (numbers.contains(num))
                numbers.remove(num);
            else
                numbers.add(num);
        }
        for (Integer num: numbers)
            return num;
        return -1;
    }
}