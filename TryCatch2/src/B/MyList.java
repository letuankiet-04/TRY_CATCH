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
    public int search(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public boolean update(Editor x) {
        int index = search(x.getId());
        if (index != -1) {
            list.set(index, x);
            return true;
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
