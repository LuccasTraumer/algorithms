//import java.util.List;
//
//import static java.util.Objects.isNull;
//
//public class BoubleSort {
//    public Person[] SORT(Person[] list) throws Exception {
//        if (isNull(list))
//            throw new Exception("Empty list!");
//
//        for(int slowIndex = 0; slowIndex < list.length-1; slowIndex++) {
//            for (int fastindex = slowIndex+1; fastindex < list.length -1; fastindex++) {
//                if(list[slowIndex].getAge() > list[fastindex].getAge()) {
//                    Person aux = list[slowIndex];
//                    list[slowIndex] = list[fastindex];
//                    list[fastindex] = aux;
//                }
//            }
//        }
//        return list;
//    }
//
//    public List<Person> SORT(List<Person> list) throws Exception {
//        if (isNull(list))
//            throw new Exception("Empty list!");
//
//        for(int slowIndex = 0; slowIndex < list.size() -1; slowIndex++) {
//            for (int fastindex = slowIndex +1; fastindex < list.size() -1; fastindex++) {
//                if(((Client) list.get(slowIndex)).getAge() > ((Client)list.get(fastindex)).getAge()) {
//                    Person aux = list.get(slowIndex);
//                    list.set(slowIndex, list.get(fastindex));
//                    list.set(fastindex, aux);
//                }
//            }
//        }
//        return list;
//    }
//}
