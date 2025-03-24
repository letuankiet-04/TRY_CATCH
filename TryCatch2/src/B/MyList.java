package B;

import A.IList;
import java.util.ArrayList;

public class MyList implements IList {
    private ArrayList<Editor> list;

    public MyList() {
        list = new ArrayList<>();
    }

    @Override
    public boolean add(Editor x) {
        return list.add(x);
    }

    @Override
    public Editor search(String id) {
        for (Editor e : list) {
            if (e.getId().equalsIgnoreCase(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public boolean update(Editor x) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(x.getId())) {
                list.set(i, x);
                return true;
            }
        }
        return false;
    }

    @Override
    public void printAll() {
        for (Editor e : list) {
            e.output();
        }
    }
}