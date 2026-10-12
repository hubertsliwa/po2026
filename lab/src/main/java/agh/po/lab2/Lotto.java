package agh.po.lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        int x;
        for(int i=0; i<6; i++){
            do{
                x = random.nextInt(49)+1;
            }
            while(lista.contains(x));
            lista.add(x);
        }
            for(int i=0; i<args.length; i++){
            System.out.printf("Twoje liczby: " + args[i]);
            System.out.println(lista);
            }
    }
}
