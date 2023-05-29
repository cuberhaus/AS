package junit.com;

import java.util.Date;

public class RevisedStatePayStation implements  StatePayStation{
    String revisedDate;
    public RevisedStatePayStation(String now) {
        revisedDate = now;
    }

    @Override
    public String getStateInfo() {
        return revisedDate;
    }

    @Override
    public void revision(String opName) {

    }

    @Override
    public void revised() {

    }
}
