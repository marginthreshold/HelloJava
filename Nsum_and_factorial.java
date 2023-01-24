//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Nsum_and_factorial {
    public static void main(String[] args) {
        System.out.println("Введите положительное число, начиная с 1: ");
        Scanner sc = new Scanner(System.in);
        try {
            int number = sc.nextInt();
            int sum_number = 0;
            int factorial_number = 1;
            for (int i = 1; i <= number; i++) {
                sum_number += i;
                factorial_number *= i;
            }
            System.out.printf("Сумма всех чисел до числа %d равна: %d \n", number, sum_number);
            System.out.printf("Произведение всех чисел до числа %d равно: %d", number, factorial_number);
        } catch (Exception e) {
            System.out.println("Это не целое число");
        }
        sc.close();
    }
}
