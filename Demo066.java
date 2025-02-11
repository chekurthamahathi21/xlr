Demo066.java package Core_Java;
// 5.Write a java program to print index values of an array.
class PrintArrayIndex{
    void printArrIndex(int[] arr){
        int[] newArr = arr;
        for (int i = 0; i< newArr.length; i++){
            System.out.print(i+" ");
        } 
    }
}
public class Demo066 {
    public static void main(String[] args) {
        PrintArrayIndex obj = new PrintArrayIndex();
        int[] arr = {10,50,80,90,20};
        obj.printArrIndex(arr);
    }
}
