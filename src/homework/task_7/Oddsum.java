package homework.task_7;

public class Oddsum {public static void main(String [] args){
    int sumOfOddNumbers=0;
    for(int i=1; i<=100;i++){
        if(i%2==1){
            sumOfOddNumbers+=i;
        }
    }
    System.out.println("\n" + "sum of odd numbers = "+sumOfOddNumbers);
}
}
