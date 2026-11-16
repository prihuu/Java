import java.util.ArrayList;

public class ThreadSafeList {

    private ArrayList<String> list;

    public ThreadSafeList() {
        list = new ArrayList<>();
    }

    public synchronized void add(String element) {
        list.add(element);
    }

    public synchronized int size() {
        return list.size();
    }

    public synchronized void remove(String element) {
        list.remove(element);
    }
}
