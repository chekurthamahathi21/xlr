Demo067.java package Core_Java;
// 6.Write a java program to print prime numbers of an array.
class Print prime numbers{
    void prime numbers(int[] arr){
        int[] prime = arr;
        for (int i = 0; i< prime.length; i++){
            if (prime[i] % 2 == 0)
            System.out.print(prime[i]+" ");
        } 
    }
}
public class Demo067 {
    public static void main(String[] args) {
        PrintPrimeNumbers obj = new PrintPrimeNumbers();
        int[] arr = {5,7,11,19,23};
        obj.prime numbers(arr);
    }
}
