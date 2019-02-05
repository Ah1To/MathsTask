package Service;

import java.util.List;
import java.util.Random;

public class Service {

    public  void reversPrint(List list){

        for (int i = list.size()-1 ; i > 0; i--){
            System.out.print(list.get(i) + " ");
        }

    }

    public Integer randomIntRange(int min, int max){

        return new Random().nextInt((max - min) + 1) + min;


    }

    public String printResultCount(List list){
        Integer count = 0;
        Integer result = 0;

        for(int i = 0; i < list.size(); i++){
            Integer listNum = (Integer)list.get(i);

            if(listNum%2 == 0 && listNum > 0){
                count++;
                result += listNum;
            }

        }

        return "Result " + result/count;
    }
}
