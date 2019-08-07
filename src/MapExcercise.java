import java.util.*;

public class MapExcercise {

    public static void main(String[] args) {
        Map<String,String> mapa = new HashMap<>();

        mapa.put("key1","PL");
        mapa.put("key2","LA");
        mapa.put("key3","IT");
        mapa.put("key4","LA");
        mapa.put("key5","PL");

        Map<String, List<String>> maplist = new HashMap<>();

        for(String key : mapa.keySet()){
            String value = mapa.get(key);
            if(maplist.containsKey(value)){
                maplist.get(value).add(key);
            }
            else{
                List<String> array = Arrays.asList(key);
                maplist.put(value,array);
            }
        }

        System.out.println(maplist);
    }
}
