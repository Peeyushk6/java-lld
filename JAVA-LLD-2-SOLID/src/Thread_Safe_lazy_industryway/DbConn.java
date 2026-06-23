package Thread_Safe_lazy_industryway;

public class DbConn {
    private DbConn(){}

    private static class Holder{
        private static final DbConn INSTANCE = new DbConn();
    }

    public static DbConn getInstance(){
        return Holder.INSTANCE;
    }

}
