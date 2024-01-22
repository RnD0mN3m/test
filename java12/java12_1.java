package test.java12;

import java.util.Scanner;

class Calculator {
    int x;
    int y;
    Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }
    int CalcSum() {
        return x + y; 
    }
    double CalcAve() {
        return (x + y)/2;
    }
}

class MoreCalc extends Calculator {
    MoreCalc(int x, int y) {
        super(x, y);
    }
    double CalcPow() {
        return Math.pow(x,y);
    }
}

class java12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("整数を入力してください：");
        int x = scanner.nextInt();
        System.out.print("整数を入力してください：");
        int y = scanner.nextInt();
        MoreCalc moreCalc = new MoreCalc(x, y);
        int    sum     = moreCalc.CalcSum();
        double average = moreCalc.CalcAve();
        double power   = moreCalc.CalcPow();

        System.out.printf("Sum %d and %d = %d%n",       x, y, sum);
        System.out.printf("Average %d and %d = %.0f%n", x, y, average);
        System.out.printf("Power %d of %d = %.0f%n",    x, y, power);
    }
}