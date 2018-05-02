public class BinaryToDecimal {
    public static void main(String[] args) {
        int a=101101;
        System.out.println(a+ " a is " +convertBinaryToDecimal(a)+ " in decimal");
    }
    public static int convertBinaryToDecimal(int binary){
        int decimal = 0;
        int power = 0;
        while(true){
            if(binary==0){
                break;
            }else{
                int temp = binary%10;
                decimal += temp*Math.pow(2,power);
                binary = binary/10;
                power++;
            }
        }
        return decimal;
    }
}
