package Generics;

public class Triple<TYPE> {
    private TYPE left;

    private TYPE right;

    private TYPE middle;

    public  Triple(TYPE left, TYPE middle, TYPE right){
        this.left = left;
        this.right = right;
        this.middle = middle;
    }
    public TYPE getLeft(){
        return left;
    }

    public TYPE getMiddle(){
        return middle;
    }

    public TYPE getRight(){
        return right;
    }
}


