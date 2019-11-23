package au.com.blogspot.ojitha.datastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class TestIterator {
    public static void main(String[] args) {
        String[] randomStrings = "a,b,c,d,e,f,g,h".split(",");
        for (int k=1000; k < 10000000; k *= 2){

            List<String> list = new ArrayList();
            for(int j = 0; j < k; j ++){
                list.add(randomStrings[new Random().nextInt(randomStrings.length)]+j);
            }

            long time = System.nanoTime();
            list.removeIf(e -> e.startsWith("d"));
//            Iterator<String> it = list.iterator();
//            while (it.hasNext()){
//                String elem = it.next();
//                if (elem.startsWith("d")) it.remove();
//            }
            System.out.printf("k = %d time = %dms%n",k,(System.nanoTime() - time)/1000000);

        }
    }
}
