package Sem_02.data;

public class Student extends User {

    private int groupnum;

    public Student(String name, int birthyear, String passnumber, int groupnum) {
        super(name, birthyear, passnumber);
        this.groupnum = groupnum;
    }

    public int getGroupnum() {
        return groupnum;
    }

    public void setGroupnum(int groupnum) {
        this.groupnum = groupnum;
    }
}