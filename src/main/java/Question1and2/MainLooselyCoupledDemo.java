package Question1and2;

public class MainLooselyCoupledDemo {
    IJob job;

    public MainLooselyCoupledDemo(IJob job) {
        this.job = job;
    }

    public void display() {
        job.display();
    }

    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        MainLooselyCoupledDemo mainLooselyCoupledDemo = new MainLooselyCoupledDemo(engineer);
        mainLooselyCoupledDemo.display();
    }

}
