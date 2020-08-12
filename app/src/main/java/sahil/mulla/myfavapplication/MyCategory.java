package sahil.mulla.myfavapplication;

import java.io.Serializable;
import java.util.ArrayList;

public class MyCategory implements Serializable {
   String name;
   ArrayList<String> items=new ArrayList<>();

    public MyCategory(String name, ArrayList<String> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }
}
