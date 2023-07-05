import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char plus = '+';
        char minus = '-';
        char div = '/';
        char multi = '*';
        int p;
        int mi;
        int d;
        int mu;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String str = in.nextLine();
        int valuech1 = Character.getNumericValue(str.charAt(0));
        char valuech2 = str.charAt(1);
        int valuech3 = Character.getNumericValue(str.charAt(2));
            if(valuech2 == plus) {
                p = valuech1+valuech3;
                System.out.print(p);
            } else if (valuech2 == minus) {
                mi = valuech1-valuech3;
                System.out.print(mi);
            } else if (valuech2 == div) {
                d = valuech1/valuech3;
                System.out.print(d);
            } else if (valuech2 == multi) {
                mu = valuech1*valuech3;
                System.out.print(mu);
            } else System.out.print("throws Exception");
    }
}


