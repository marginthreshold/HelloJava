//Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *). int a ; int b

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Введите первое число: ");
        try {
            int number1 = sc.nextInt();
            System.out.println("Введите второе число: "); 

            int number2 = sc.nextInt();

            System.out.println("Введите действие с числами (+ - / *): "); 
            String do_it = sc.next();
            calc(number1,do_it,number2);

        } catch (Exception e) {
        System.out.println("Неправильное число или действие!");
        }
        sc.close();
    }

        
    public static void calc(int number1,String do_it, int number2) {
        if (do_it.equals("/") && number2==0) {
            System.out.println("Делить на ноль нельзя");
               } else {
                Map <String, Integer> map = new HashMap<>();
                map.put("+",number1+number2);
                map.put("-",number1-number2);
                map.put("*",number1*number2);
                if (number2==0) number2=1;
                map.put("/",number1/number2);
                System.out.println("Целочисленный результат равен: "+map.get(do_it));
            }
        }
}
    

