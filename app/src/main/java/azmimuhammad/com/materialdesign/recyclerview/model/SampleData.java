package azmimuhammad.com.materialdesign.recyclerview.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mazmik25 on 3/5/2018.
 */

public class SampleData {
    public static final List<String> title = new ArrayList<String>() {{
        add("Name 1");
        add("Name 2");
        add("Name 3");
        add("Name 4");
        add("Name 5");
        add("Name 6");
        add("Name 7");
        add("Name 8");
        add("Name 9");
        add("Name 10");
    }};

    public static List<String> getTitle() {
        return title;
    }
}
