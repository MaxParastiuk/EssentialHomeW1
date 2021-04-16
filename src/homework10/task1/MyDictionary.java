package homework10.task1;

import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        MyDictionary<String, String> myDictionary = new MyDictionary<>();
        myDictionary.addMeth("1", "Hello");
        myDictionary.addMeth("2", "World");

        System.out.println(myDictionary.getDictionary());

    }
}

public class MyDictionary<TKey, TValue> implements IDictionary<TKey, TValue> {

    Map<TKey, TValue> dictionary = new HashMap<TKey, TValue>();

    public void addMeth(TKey key, TValue value) {
        dictionary.put(key, value);
    }

    public Map<TKey, TValue> getDictionary() {
        return dictionary;
    }

}

interface IDictionary<TKey, TValue> {

}
