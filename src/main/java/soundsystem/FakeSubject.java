package soundsystem;

/**
 * Created by erzhang on 5/25/17.
 */
public class FakeSubject implements SubjectInte {
    @Override
    public void request() {
        System.out.println("FakeSubject Print");
    }
}
