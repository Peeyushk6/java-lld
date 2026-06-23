import javax.xml.crypto.Data;

interface Database {
    void save();
}

class MySQLDatabase implements Database{
    public void save(){
        System.out.println("Saved to MySQL...");
    }
}

class MongoDatabase implements Database{
    @Override
    public void save() {
        System.out.println("Saved to MongoDatabase");
    }
}

class DBService{
    private Database db;

    public DBService(Database db){
        this.db = db;
    }
    void process(){
        db.save();
    }
}

public class dip {
    static void main() {
        Database db = new MySQLDatabase(); // Can switch easily
        DBService dbs = new DBService(db);
        dbs.process();
    }
}
