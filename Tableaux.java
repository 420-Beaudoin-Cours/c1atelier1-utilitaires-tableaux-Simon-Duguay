package com.company;

import java.util.Arrays;

/**
 * @author France Beaudoin
 */
public class Tableaux {
    private static void permute(int[] tab, int i1, int i2) {
        int transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    private static void permute(String[] tab, int i1, int i2) {
        String transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    public static void trierCroissantSSS(int[] tab) {
        int imin;
        for (int i = 0; i < tab.length - 1; i++) {
            imin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierCroissantSSS(String[] tab) {
        int imin;
        for (int i = 0; i < tab.length - 1; i++) {
            imin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (Integer.parseInt(tab[j]) < Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierDecroissantSSS(int[] tab) {
        int imax;
        for (int i = 0; i < tab.length - 1; i++) {
            imax = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] > tab[imax])
                    imax = j;
            }
            if (imax != i)
                permute(tab, i, imax);
        }
    }

    public static void trierDecroissantSSS(String[] tab) {
        int imax;
        for (int i = 0; i < tab.length - 1; i++) {
            imax = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (Integer.parseInt(tab[j]) > Integer.parseInt(tab[imax]))
                    imax = j;
            }
            if (imax != i)
                permute(tab, i, imax);
        }
    }

    public static void print(int[] tab) {
        System.out.print(Arrays.toString(tab));
    }

    public static void print(String[] tab) {
        System.out.print(Arrays.toString(tab));
    }

    public static int maximum(int[] tab) {
        int max = tab[0];

        for (int nb : tab) {
            if (nb > max)
                max = nb;
        }
        return max;
    }

    public static int maximum(String[] tab) {
        int max = Integer.parseInt(tab[0]);
        int nb;

        for (String strNb : tab) {
            nb = Integer.parseInt(strNb);
            if (nb > max)
                max = nb;
        }
        return max;
    }

    public static int minimum(int[] tab) {
        int min = tab[0];

        for (int nb : tab) {
            if (nb < min)
                min = nb;
        }
        return min;
    }

    public static int minimum(String[] tab) {
        int min = Integer.parseInt(tab[0]);
        int nb;

        for (String strNb : tab) {
            nb = Integer.parseInt(strNb);
            if (nb < min)
                min = nb;
        }
        return min;
    }

    public static int moyenne(int[] tab) {
        int somme = 0;
        int moyenne;

        for (int nb : tab) {
            somme += nb;
        }
        moyenne = somme / tab.length;
        return moyenne;

    }

    public static int moyenne(String[] tab) {
        int somme = 0;
        int moyenne;

        for (String strnb : tab) {
            somme += Integer.parseInt(strnb);
        }
        moyenne = somme / tab.length;
        return moyenne;
    }

    public static int fouilleSeq(int[] tab, int elem) {
        for (int index = 0; index < tab.length; index++) {
            if (tab[index] == elem)
                return index;
        }
        return -1;
    }

    public static int fouilleSeq(String[] tab, String elem) {
        for (int index = 0; index < tab.length; index++) {
            if (tab[index].equals(elem))
                return index;
        }
        return -1;
    }

}