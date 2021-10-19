import java.util.ArrayList;
import java.util.stream.Collectors;

public class SpisokStud {
    public static SpisokStud instance = new SpisokStud();
    public static SpisokStud getInstance(){
        return instance;
    }
    public String i;
    public static ArrayList<Student> spisok;

    public SpisokStud() {
        spisok = new ArrayList<>();

        spisok.add(new Student("Андреева Ирина", 3.48, false));
        spisok.add(new Student("Анферова Анастасия", 4.48, true));
        spisok.add(new Student("Беднов Андрей", 5.00, false));
        spisok.add(new Student("Белозуб Яна", 4.12, true));
        spisok.add(new Student("Белоус Алексей", 4.99, false));
        spisok.add(new Student("Котума Андрей", 4.25, true));
    }

    static void nwStd(Student student)
    {
        spisok.add(student);
    }

    public ArrayList<String> chkStd() {
        return (ArrayList<String>) spisok.stream()
                .filter(i -> i.getBlc_chn() == true)
                .map(Student::getName)
                .collect(Collectors.toList());
    }

}
