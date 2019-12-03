package array;
//题目描述
//        在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一
//        个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
public class MultiMetricNumFind {
    static public boolean Find(int target, int [][] array) {
        if(array == null)
            return false;
        int i = 0;
        int j = array[0].length-1;
        while(i<array.length&&j>=0) {
            if (target == array[i][j]) {
                System.out.println("i="+(i+1));
                System.out.println("j="+(j+1));
                return true;
            } else if (target > array[i][j]) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][] array = {
                {0,1,2,3},
                {2,3,4,5},
                };
        System.out.println(Find(6,array));
    }
}
