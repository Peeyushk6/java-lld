package SingleTone_Lazy;

public class DBConn {
    private  static DBConn instance;

    private DBConn(){
        System.out.println("DB connection Created");
    }

    public static DBConn getInstance(){
        if(instance == null)
            instance = new DBConn();
        return  instance;
    }
}

class Main{
    static void main() {
        DBConn db1 = DBConn.getInstance();
        DBConn db2 = DBConn.getInstance();

        System.out.println(db1 == db2); // true
    }
}
