package array;
//题目描述
//        在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重
//        复几次。请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
public class FindDuplicatedNumber {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(length<=0)
            return false;
        int []arr = new int[length];
        for(int i = 0 ; i < length ;i++){
            arr[numbers[i]]++;
            if(arr[numbers[i]]>1){
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] array = {4,3,6,5,8,1,2,3,6};
        int[] duplicate = new int[array.length];
        FindDuplicatedNumber findDuplicatedNumber = new FindDuplicatedNumber();
        System.out.println("the array is duplicated?"+findDuplicatedNumber.duplicate(array,array.length,duplicate));
        System.out.println("the duplicated number is "+duplicate[0]);
    }
}
