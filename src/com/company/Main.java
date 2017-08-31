package com.company;

public class Main {

    public static void main(String[] args) {

        int[] values = {1,1};
        int oneOccur = 0;
        int twoOccur = 0;
        int threeOccur = 0;



        for (int i = 0; i < values.length; i++) {

            if (values[i] == 1) {
                oneOccur++;
            } else if (values[i] == 2) {
                twoOccur++;
            } else if (values[i] == 3) ;
                threeOccur++;
            }

        System.out.print(oneOccur);
    }
}
