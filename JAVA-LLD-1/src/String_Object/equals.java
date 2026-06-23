package String_Object;

class Test{
    int id;
}

public class equals {
    public static void main(String[] args) {

        Test t1 = new Test();
        t1.id = 1;

        Test t2 = new Test();
        t2.id = 1;

        System.out.println(t1);
        System.out.println(t2); // Internally calls t1.toString() getClass().getName() + '@' + Integer.toHexString(hashCode())

        System.out.println(t1.equals(t2));
        //public boolean equals(Object obj) {
        //return this == obj;  -> compare references  -> if you override euwals it will be true
//    }
    }
}


