package apr2627;

import java.util.ArrayList;
import java.util.Collections;

public class Assgin02 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("yuri");
        name.add("jjanggu");
        name.add("cheolsu");

        Collections.sort(name);

        for(int i=0; i<name.size(); i++){
            System.out.println(name.get(i));
        }
    }
}
