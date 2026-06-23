package fileStorage_Solid;

interface Storage{
    void save();
}

class LocalStorage implements Storage{
    @Override
    public void save() {
        System.out.println("Saved to local Disk");
    }
}

class S3Storage implements Storage{
    @Override
    public void save() {
        System.out.println("Saved to S3");
    }
}

class FileService{
    private Storage storage;

    public FileService(Storage storage){
        this.storage = storage;
    }

    void upload(){
        storage.save();
    }
}
public class FileServer {
    static void main() {
        Storage storage = new S3Storage();
        FileService fileService = new FileService(storage);
        fileService.upload();
    }
}
