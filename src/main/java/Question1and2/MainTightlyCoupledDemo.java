package Question1and2;

public class MainTightlyCoupledDemo {
    Teacher teacher;
    Engineer engineer;

    public MainTightlyCoupledDemo(Teacher teacher, Engineer engineer) {
        this.teacher = teacher;
        this.engineer = engineer;
    }

    public void display() {
        teacher.display();
        engineer.display();
    }

    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        Teacher teacher = new Teacher();
        MainTightlyCoupledDemo mainTightlyCoupledDemo = new MainTightlyCoupledDemo(teacher, engineer);
        mainTightlyCoupledDemo.display();

    }
}
