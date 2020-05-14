import java.util.ArrayList;
public class MyList<T extends Number> {
    private ArrayList<T> list;

    public void add(T value) {
        list.add(value);
    }

    public T largest() {
        if (list.isEmpty())
            return null;
        T val = list.get(0);
        for (int i = 1; i < list.size(); i++)
            if (list.get(i).doubleValue() > val.doubleValue())
                val = list.get(i);
        return val;
    }

    public T smallest() {
        if (list.isEmpty())
            return null;
        T val = list.get(0);
        for (int i = 1; i < list.size(); i++)
            if (list.get(i).doubleValue() < val.doubleValue())
                val = list.get(i);
        return val;
    }
}