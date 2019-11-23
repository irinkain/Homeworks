package irinka;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList list = new ArrayList();
        for(int i=0;i<12;i++){
            list.add(r.nextInt(100)); //მასივის შევსება შემთხვევითი 12 რიცხვით 100-ის ფარგლებში;
        }
        ArrayList newlist = new ArrayList(list);
        Iterator iter = newlist.iterator();
        while (iter.hasNext()) {
            int k = (Integer)iter.next();
            if(k%2==0){
                iter.remove();
            }
        }
        Collections.sort(list);
        Collections.sort(newlist);
        System.out.println("საწყისი"+list +" "+ "მიღებული"+ newlist);

        Second sec = new Second();
        sec.Method1();
    }

}
