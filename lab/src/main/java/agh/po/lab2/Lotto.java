package agh.po.lab2;

import java.util.ArrayList;
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
        ArrayList<Integer> liczby = new ArrayList<>();
        int y;
        for(int i=0; i<args.length; i++){
            liczby.add(Integer.parseInt(args[i]));
            }
        int t=0;
        for (int i : liczby){
            if (lista.contains(i)){
                t++;
            }
        }
        System.out.printf("Twoje liczby: " + liczby + "\n");
        System.out.printf("Wylosowane liczby: " + lista + "\n");
        System.out.printf("Trafienia: "+ t);

    }
}
