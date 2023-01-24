//Вывести все простые числа от 1 до 1000
import java.util.ArrayList;

public class Prime_numbers {
    public static void main(String[] args) {
        ArrayList<Integer> newlist= new ArrayList<Integer>(0);
        for (int i = 11; i < 1000; i++) {
            if (i%2 != 0 && i%3 != 0 && i%5 != 0 && i%7 != 0)  {
             newlist.add(i);
            }
        }
        for (int i = 0; i < newlist.size(); i++) {
            for (int j = i+1; j < newlist.size(); j++) {
                if (newlist.get(j)%newlist.get(i)==0){
                    newlist.remove(j);
                }
            }
        }
        System.out.println("Все простые числа от 1 до 1000 равны: 2, 3, 5, 7, "+newlist);
    }
}