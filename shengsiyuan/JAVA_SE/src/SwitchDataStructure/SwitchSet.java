package SwitchDataStructure;

import java.util.HashSet;

public class SwitchSet {
    public static void main(String[] args) {
        HashSet<String> setTest = new HashSet<>();
        setTest.add("good");
        setTest.add("lol");
        String[] zz = setTest.toArray(new String[0]);
        System.out.println(zz);
    }
}
