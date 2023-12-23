package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //balls and bins simulation

        int repeat = 50; //repeat k times
        int maxAmountOfBins = 100000;

        for (int i = 1000; i <= maxAmountOfBins ; i += 1000) {
            System.out.println("-------------------------------------" + i + "-------------------------------------");
            doAction(repeat, i, i);
        }
    }

    public static void doAction(int repeat, int amountOfBins, int amountOfBalls) {

        //vars to find
        int[] bns = new int[repeat]; //first moment of picking not empty bin
        int[] uns = new int[repeat]; //amount of empty bins at the end
        int[] lns = new int[repeat]; //max amount of ball in the bin
        int[] cns = new int[repeat]; //min amount of balls that are needed for every bin to have at least one ball
        int[] dns = new int[repeat]; //min amount of balls that are needed for every bin to have at least two balls
        int[] dncns = new int[repeat]; //difference between Dn and Cn

        //averages
        int bnSum = 0;
        int unSum = 0;
        int lnSum = 0;
        int cnSum = 0;
        int dnSum = 0;
        int dncnSum = 0;

        for (int i = 0; i < repeat; i++) {
            int bn = 0;
            int un = amountOfBins;
            int ln = 0;
            int cn = amountOfBins;
            int dn = amountOfBins;
            int dncn;

            int[] array = initializeArray(amountOfBins);
            int[] nums = generateArrayWithRandomNumbers(amountOfBalls, amountOfBins);
            int count = 0;
            for (int num : nums) {
                array[num] = array[num] + 1;
                count++;
                if (bn == 0 && array[num] == 2) bn = count;
                if (array[num] == 1) un--;
                if (array[num] == 1) cn--;
                if (array[num] == 2) dn--;
                if (ln < array[num]) ln = array[num];
            }

            while(cn != 0) {
                int num = getRandomNumber(amountOfBins);
                array[num] = array[num] + 1;
                count++;
                if (array[num] == 1) cn--;
                if (array[num] == 2) dn--;
            }
            cn = count;
            while(dn != 0) {
                int num = getRandomNumber(amountOfBins);
                array[num] = array[num] + 1;
                count++;
                if (array[num] == 2) dn--;
            }
            dn = count;
            dncn = dn - cn;

            bns[i] = bn;
            uns[i] = un;
            lns[i] = ln;
            cns[i] = cn;
            dns[i] = dn;
            dncns[i] = dncn;

            bnSum += bn;
            unSum += un;
            lnSum += ln;
            cnSum += cn;
            dnSum += dn;
            dncnSum += dncn;
        }

        System.out.println("Bn: " + Arrays.toString(bns));
        System.out.println("Average Bn: " + bnSum/repeat);
        System.out.println("Un: " + Arrays.toString(uns));
        System.out.println("Average Un: " + unSum/repeat);
        System.out.println("Ln: " + Arrays.toString(lns));
        System.out.println("Average Ln: " + lnSum/repeat);
        System.out.println("Cn: " + Arrays.toString(cns));
        System.out.println("Average Cn: " + cnSum/repeat);
        System.out.println("Dn: " + Arrays.toString(dns));
        System.out.println("Average Dn: " + dnSum/repeat);
        System.out.println("Dn-Cn: " + Arrays.toString(dncns));
        System.out.println("Average Dn-Cn: " + dncnSum/repeat);
    }

    public static int[] generateArrayWithRandomNumbers(int amountOfBalls, int amountOfBins) {
        int[] nums = new int[amountOfBalls];

        for (int i = 0; i < amountOfBalls; i++) {
            nums[i] = getRandomNumber(amountOfBins);
        }
        return nums;
    }

    public static int getRandomNumber(int amountOfBins) {
        return (int) ((Math.random() * (amountOfBins)));
    }

    public static int[] initializeArray(int amountOfBins) {
        return new int[amountOfBins];
    }
}