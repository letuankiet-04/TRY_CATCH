
package A;

import B.Editor;

public interface IList {
    void add();
    boolean search(String id);
    Editor remove(String id);
    void printAll();
}