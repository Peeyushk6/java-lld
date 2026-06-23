package Generics;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        System.out.println("------------");
        Triple <String> idToNameToEmail = new Triple<>("1","Tantal","ds@ds");
        Triple <String> idToNameToEmail2 = new Triple<>("12","Tantal2","2ds@ds");
        Triple <Integer> idToAgeToPan = new Triple<>(1,200,323223);

        List<Triple<String>> triples = List.of(idToNameToEmail,idToNameToEmail2);
        print(triples);

    }

    private static <TRIPLE_TYPE> void print(List<Triple<TRIPLE_TYPE>> triples){
        for (Triple<TRIPLE_TYPE> triple : triples){
            System.out.println(triple.getLeft()+"-----------"+ triple.getMiddle()+"----------"+ triple.getRight());
        }
    }

}
