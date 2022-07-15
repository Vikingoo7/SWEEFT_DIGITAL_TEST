import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DataStructure {

    public static void main(String[] args) {

    }

    ArrayList<Integer> array;
    HashMap<Integer, Integer> hashMap;


//Constructor
    public DataStructure() {
        array = new ArrayList<>();
        hashMap = new HashMap<>();
    }

//    Method
    public void remove(int x) {
        Integer index = hashMap.get(x);
        if(index == null) return;
        hashMap.remove(x);

        int size = array.size();
        Integer last = array.get(size-1);
        Collections.swap(array, index, size-1);
        array.remove(size-1);
        hashMap.put(last, index);

    }



}
