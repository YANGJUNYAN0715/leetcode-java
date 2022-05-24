package data_structure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("TaoBao");
        sites.add("Wiki");
        sites.add("Abc");
        Collections.sort(sites);
        for(String i:sites){
            System.out.println(i);
        }
    }
}
