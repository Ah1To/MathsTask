import Service.Service;

import java.util.ArrayList;


/* На вход программы подаются случайные целые числа в диапазоне от -100 до
+100. Количество чисел от 1 до 100 также задаётся случайным образом.
Реализовать программу, хранящую эти числа в простом однонаправленном
списке. Как только было добавлено последнее число, посчитать количество
чётных положительных чисел, хранящихся в списке и их среднее, округлённое
до целого.
*/

public class MathDBc2Task2 {

    public static void main(String[] args) {
        Service service = new Service();


        ArrayList<Integer> intList = new ArrayList<>();



        for (int i = 0; i < service.randomIntRange(1,100); i++){

            Integer intNum = service.randomIntRange(-100,100);

            intList.add(intNum);

        }

        System.out.println("Count of Numbers " + intList.size());
        for( Integer i:intList){
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println(service.printResultCount(intList));

    }


}

