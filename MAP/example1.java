package MAP;

import java.util.Map;

public class example1 {
    public static void main(String[]args){
        String[]word={"Java","HTML","CSS","Java","Java","JavaScript","Java"};
        Map<String ,Integer>map=new HashMap();
        for(String value:word){
            if(map.containsKey(value)){
                map.put(value, map.get(value)+1);
            }else{
                map.put(value, 1);
            }
        }
        System.out.println(map);
    }
}
