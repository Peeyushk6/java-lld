package lsp;

class Bird1{
    public void fly(){
        System.out.println("Flying...");
    }
}

class Penguin extends Bird1{
    public void fly(){
        throw new UnsupportedOperationException("Penguins can't fly....");
    }
}

public class lsp_bad {
    static void main() {
        Bird1 bird = new Penguin();
        bird.fly();// breaks
    }
}
