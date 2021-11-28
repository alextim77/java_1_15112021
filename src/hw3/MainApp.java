package hw3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainApp {


    public static void main(String[] args){




        int[] arr = new int[]{0, 1, 1, 0, 0, 1, 0, 1, 0, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] -= 1;
            } else if (arr[i] == 0) {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));


        int[] arrHandred = new int[100];
        {
            for (int i = 0; i < arrHandred.length; i++) {
                arrHandred[i] = i + 1;
            }
            for (int i = 0; i < arr.length; i++) {
            }
            System.out.println(Arrays.toString(arrHandred) + " ");

        }

        int[] arrIntellig = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        {
            for (int i = 0; i < arr.length; i++) {
                if (arrIntellig[i] < 6) {
                    arrIntellig[i] *= 2;
                }
            }
            System.out.println(Arrays.toString(arrIntellig) + " ");
        }


          int[][] arrSguare = new int [5][5];
           arrSguare[0][0] = 1;  arrSguare[0][4] = 1;
           arrSguare[1][1] = 1;  arrSguare[1][3] = 1;
           arrSguare[2][2] = 1;  arrSguare[2][2] = 1;
           arrSguare[3][3] = 1;  arrSguare[3][1] = 1;
           arrSguare[4][4] = 1;  arrSguare[4][0] = 1;
             for (int i = 0; i < arrSguare.length ; i++) {
                for (int j = 0; j <arrSguare[i].length ; j++) {
                   System.out.printf("%4d",arrSguare[i][j]);
                }
                System.out.println();
            }



        arrLine(4);

    }

    public static void arrLine(int a) {
        int[] arrLine = new int[a];
        {
            for (int i = 0; i < arrLine.length; i++) {
            }
            System.out.print(Arrays.toString(arrLine) + " ");
        }

    }




    }

