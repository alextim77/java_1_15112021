package hw1;

  public class MainApp {


      public static void main(String[] args) {
          treeWordsPrint();
          int a = 15,b = -22;
          checkSumSign(a,b);
          int value = 130;
          printColor(value);;
          int x =22,z =98;
          compareNumbers(x,z);
      }


      public static void treeWordsPrint () {
              System.out.println("Orange");
              System.out.println("Banana");
              System.out.println("Apple");
          }

      public static void checkSumSign(int a,int b) {
          if ((a + b) > 0){
              System.out.println("Сумма положительная");}
          else{
              System.out.println("Сумма отрицательная");}
      }

      public static void printColor(int value) {
          if(value <= 0){
              System.out.println("Красный");
          }if (value >=0 && value <=100 ){
              System.out.println("Желтый");
          }if (value > 100 ){
              System.out.println("Зеленый");
          }
      }

      public static void compareNumbers(int x,int z) {
          if (x >= z){
              System.out.println("x >= z");
          }else {
              System.out.println("x < z");
          }

      }
  }




