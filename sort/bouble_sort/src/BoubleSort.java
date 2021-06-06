import java.util.List;

import static java.util.Objects.isNull;

public class BoubleSort {

    public Integer[] sort(Integer[] list) throws Exception{
        if (isNull(list))
            throw new Exception("Empty list!");

        for(int slowIndex = 0; slowIndex < list.length-1; slowIndex++) {
            for (int fastindex = slowIndex+1; fastindex < list.length-1; fastindex++) {
                if(list[slowIndex] > list[fastindex]) {
                    Integer aux = list[slowIndex];
                    list[slowIndex] = list[fastindex];
                    list[fastindex] = aux;
                }
            }
        }
        return list;
    }
}
