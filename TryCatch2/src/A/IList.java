
package A;

import B.Editor;

public interface IList {
    boolean add(Editor x); 
    int search(String id); 
    boolean update(Editor x);
    void printAll(); 
}
