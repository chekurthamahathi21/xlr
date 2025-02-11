Demo068.java package Core_Java;
//7.Write a java program to print count even numbers of an array
class PrintEvenCount{
    int evenCount(int[] arr){
        int[] even = arr;int count=0;
        for (int i = 0; i< even.length; i++){
            if (even[i] % 2 == 0) {
            //System.out.print(even[i]+" ");
            count++;
            }
        } 
        return count;
    }
}
public class Demo068 {
    public static void main(String[] args) {
        PrintEvenCount obj = new PrintEvenCount();
        int[] arr = {10,50,89,90,23,100,59};
        int Count = obj.evenCount(arr);
        System.out.println(Count);
    }
}
