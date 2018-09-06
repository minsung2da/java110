package bitcamp.java110.cms.util;

<<<<<<< HEAD
public class ArrayList {
    
    //개별적으로 관리해야할 값이라면 인스턴스 변수로 사용하라
    Object[] list = new Object[5];
    int index = 0;
    
    public void add(Object obj) {
=======
public class ArrayList<T> {
    
    // 객별적으로 관리해야 할 값이라면 인스턴스 변수를 사용하라!
    Object[] list = new Object[5];
    int index = 0;
    
    public void add(T obj) {
>>>>>>> b1
        if (index == list.length) {
            increaseStorage();
        }
        list[index++] = obj;
    }
    
    private void increaseStorage() {
        Object[] newList = new Object[list.length + 3];
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }
    
    public void remove(int no) {
        if (no < 0 || no >= index) {
            return;
        }
        
        for (int i = no; i < index - 1; i++) {
            list[i] = list[i + 1];
        }
        index--;
    }
    
    public int size() {
        return index;
    }

<<<<<<< HEAD
    public Object get(int no) {
=======
    public T get(int no) {
>>>>>>> b1
        if (no < 0 || no >= index) {
            return null;
        }
        
<<<<<<< HEAD
        return list[no];
    }
    
}
=======
        return (T)list[no];
    }
    
}


>>>>>>> b1
