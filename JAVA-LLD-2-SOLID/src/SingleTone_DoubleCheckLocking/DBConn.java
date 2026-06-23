package SingleTone_DoubleCheckLocking;

public class DBConn {
    private static DBConn instance;
    private DBConn(){

    }

    public static DBConn getInstance(){
        if(instance == null){
            synchronized (DBConn.class){
                if(instance == null){
                    instance = new DBConn();
                }
            }
        }
        return instance;
    }
}
