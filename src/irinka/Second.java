package irinka;

import java.util.ArrayList;
import java.util.Random;

public class Second {
    public void Method1(){
        Random r = new Random();
        ArrayList list = new ArrayList();
        for(int i=0;i<12;i++){
            list.add((r.nextInt(6) + 5));
        }
        ArrayList list2 = new ArrayList(list);
        for(int i=0;i<list2.size();i++)
        {
            if(i%3 == 0 && i!=0){
                list2.add(i,r.nextInt((25 - 20) + 1) + 20);
            }
        }
        System.out.println("საწყისი" + list + " " + "მიღებული"+list2);
    }
}
