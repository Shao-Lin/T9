package Task;

import java.util.ArrayList;
import java.util.List;

public class Logic {
    public static List<Integer> createNewList(List<Integer> list, List<Integer> list2) {
        List<Integer> list3 = new ArrayList<>();

        if (list.size() >= list2.size()) {
            for (int i = 0; i < list.size(); i++) {
                list3.add(list.get(i));
            }
            for (int i = 1; i < list2.size(); i += 2) {
                list3.set(i, list2.get(i));
            }

        } else {
            for (int i = 0; i < list2.size(); i++) {
                list3.add(list2.get(i));
            }
            for (int i = 0; i < list.size(); i += 2) {
                list3.set(i, list.get(i));
            }
        }
        return list3;

    }
}
