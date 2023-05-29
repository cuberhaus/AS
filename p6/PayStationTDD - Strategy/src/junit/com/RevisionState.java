package junit.com;

public class RevisionState implements StatePayStation{
    String operatorName;
    public RevisionState(String opName) {
        operatorName = opName;
    }

    @Override
    public String getStateInfo() {
        return operatorName;
    }

    @Override
    public void revision(String opName) {

    }

    @Override
    public void revised() {

    }
}
