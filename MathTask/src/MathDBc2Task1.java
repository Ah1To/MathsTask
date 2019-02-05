import Service.Service;

import java.util.ArrayList;

/*На вход программы в случайное время попадают целые числа. Заранее
        неизвестно, сколько чисел может быть. Как только на входе оказывается
        число -42, программа должна выдать все числа в обратном порядке. Если
        чисел было больше 100, программа должна завершить работу, иначе, перейти
        в режим ожидания чисел.*/


public class MathDBc2Task1 {
    public static void main(String[] args){
        Service service = new Service();

        ArrayList<Integer> intList = new ArrayList<>();

        while(true){

            Integer intNum = service.randomIntRange(-100, 100);

            intList.add(intNum);

            if (intNum == -42)
                break;


            if (intList.size() > 99)
                break;
        }

        service.reversPrint(intList);
    }


}
