// *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет. 24 45 //24 + 45 = 69 (n=2)
import java.util.Scanner;

public class FindDigitsInNumber {
    public static void main(String[] args) {
        System.out.println("Введите уравение формата 2? + ?5 = 69 сумма двухзначных чисел:");
        Scanner sc = new Scanner(System.in);
        String find_numbers = sc.nextLine().replaceAll(" ", "");
        char x1 = find_numbers.charAt(0);
        char x2 = find_numbers.charAt(1);
        char y1 = find_numbers.charAt(3);
        char y2 = find_numbers.charAt(4);
        int z = Integer.parseInt(String.valueOf(find_numbers.charAt(6))) * 10 +
                Integer.parseInt(String.valueOf(find_numbers.charAt(7)));
        int j;
        int count=0;
        for (int i = 10; i <= z-10; i++) {
            j = z - i;
           if ((String.valueOf(i).charAt(0) == x1 || String.valueOf(i).charAt(1) == x2) &&
            (String.valueOf(j).charAt(0) == y1 || String.valueOf(j).charAt(1) == y2)) {
               System.out.println(i+" + "+j+" = "+z);
               count+=1; 
           } 
        }
        if (count==0) System.out.println("Нет решений");
    }
}
