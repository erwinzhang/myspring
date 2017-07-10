package soundsystem;

/**
 * Created by erzhang on 5/25/17.
 */
public class Proxy implements SubjectInte {
    private SubjectInte subject;

    public Proxy(SubjectInte subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("begin");
        subject.request();
        System.out.println("end");
    }
}
