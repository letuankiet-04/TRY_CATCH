
package A;

import B.Editor;

public interface IList {
    boolean add(Editor x);
    Editor search(String id);
    boolean update(Editor x);
    void printAll();
}
