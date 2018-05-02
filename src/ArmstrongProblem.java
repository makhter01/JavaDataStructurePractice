public class ArmstrongProblem {
    public static void main(String[] args) {
        int num1=370;
        int num2=120;
        armstrong(num1);
        armstrong(num2);


    }
    public static void armstrong(int original){
        int num=original;
        int sum=0;
        int temp;

        while(num>0){
            temp=num%10;
            sum+=temp*temp*temp;
            num=num/10;
        }
        if(sum==original){
            System.out.println(original+ " is a armstrong number");
        }
        else {
            System.out.println(original+ " is not a armstrong number");
        }

    }
}
