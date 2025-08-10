public class Student implements Comparable<Student> {
    private String ho_ten;
    private int tuoi;

    public Student(String ho_ten, int tuoi) {
        this.ho_ten = ho_ten;
        this.tuoi = tuoi;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.tuoi, o.tuoi);
    }
    public String toString(){
        return ho_ten + " (" + tuoi + " tuoi)";
    }
}
