import utils.JsonBuilder;
import utils.Type;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem on 31.01.2016.
 */
public class AppOut {
    public static void main(String[] args) {
        out();
    }

    private static void out() {
        List<Type> listNames = new ArrayList<Type>(){
            @Override
            public void add(int index, Type element) {
                super.add(index, element);
            }
        };

        System.out.println(new JsonBuilder().with(listNames).build());
    }
}
