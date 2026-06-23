package SingleTone_EagerLoading;

import SingleTone_DoubleCheckLocking.DBConn;

public class eager_loading {
    private static eager_loading instance = new eager_loading();

    private eager_loading(){}

    public static eager_loading getInstance(){
        return instance;
    }
}
