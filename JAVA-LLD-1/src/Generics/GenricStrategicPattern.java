package Generics;

interface Processor<T>{
    T process(T input);
}

class StringProcessor implements Processor<String>{
    public String process(String input){
        return input.toUpperCase();
    }
}

class IntegerProcessor implements Processor<Integer>{
    public Integer process (Integer input){
        return input * input;
    }
}

public class GenricStrategicPattern {
    static void main() {
        Processor<String> sp = new StringProcessor();
        Processor<Integer> ip = new IntegerProcessor();

        System.out.println(sp.process("Peeyush"));
        System.out.println(ip.process(10));
    }
}
