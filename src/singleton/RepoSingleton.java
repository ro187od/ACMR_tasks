package singleton;


import java.util.ArrayList;

public class RepoSingleton {
    private static RepoSingleton instance;

    private ArrayList<String> localArray;

    private RepoSingleton(ArrayList<String> arrayFromConsole) {
        localArray = arrayFromConsole;
    }

    public static RepoSingleton getInstance() {
        if (instance == null) {
            instance = new RepoSingleton(new ArrayList<>());
        }
        return instance;
    }

    public static RepoSingleton getInstance(ArrayList<String> arrayFromConsole) {
        if (instance == null) {
            instance = new RepoSingleton(arrayFromConsole);
        }
        return instance;
    }

    public void add(String name) {
        this.localArray.add(name);
    }

    public String getByNumber(int index) {
        return this.localArray.get(index);
    }

    public int getSize() {
        return this.localArray.size();
    }
}
