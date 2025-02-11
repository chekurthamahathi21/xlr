public class Demo067 ;
// 6.Write a java program to print even elements of an array.
class PrintEvenElements{
    void evenElements(int[] arr){
        int[] even = arr;
        for (int i = 0; i< even.length; i++){
            if (even[i] % 2 == 0)
            System.out.print(even[i]+" ");
        } 
    }
}
public class Demo067 {
    public static void main(String[] args) {
        PrintEvenElements obj = new PrintEvenElements();
        int[] arr = {10,50,89,90,23};
        obj.evenElements(arr);
    }
}
