import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<NoteBook> set = new HashSet<>();
        set.add(new NoteBook("Notebook 1", 8, "Windows10", 80000, "HP"));
        set.add(new NoteBook("Notebook 2", 16, "Windows10", 85000, "Asus"));
        set.add(new NoteBook("Notebook 3", 32, "linux", 85000, "Lenovo"));
        set.add(new NoteBook("Notebook 4", 64, "linux", 90000, "Lenovo"));
        set.add(new NoteBook("Notebook 5", 16, "Windows10", 85000, "Asus"));
        set.add(new NoteBook("Notebook 6", 32, "linux", 65000, "Lenovo"));
        set.add(new NoteBook("Notebook 1", 8, "Windows10",70000, "HP"));

        OperationNotebook operation = new OperationNotebook(set);
        operation.start();

    }
}