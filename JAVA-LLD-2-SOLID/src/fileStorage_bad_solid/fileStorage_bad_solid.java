package fileStorage_bad_solid;

public class fileStorage_bad_solid {
    public void saveFIle(String type){
        if(type.equals("LOCAL")){
            System.out.println("Saving to local disk");
        }
        else if (type.equals("S3")) {
        System.out.println("Saving to S3");
        }
        else if (type.equals("AZURE")) {
        System.out.println("Saving to Azure");
        }
    }
}

class main{
    static void main() {
        fileStorage_bad_solid file = new fileStorage_bad_solid();
        file.saveFIle("LOCAL");
    }
}
