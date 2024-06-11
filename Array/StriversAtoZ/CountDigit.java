package Data_Structure.Array.StriversAtoZ;

//log10(N) will give number to which we need to raise 10 so that it will become equal to N
//we do +1 for possibility that N itself is power of 10;

public class CountDigit {
    public static void main(String[] args) {
        int number = 108393;
        int digit = (int) (Math.log10(number) + 1);
        System.out.println(digit);

    }
}