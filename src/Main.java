public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int n = 1; n <= 10; n = n + 1) {
            System.out.println(n);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int g = 10; g >= 1; g = g - 1) {
            System.out.println(g);
        }
    }
    public static void task3(){
        System.out.println("Задача 3");
        for(int h=0; h<=17;h=h+2){
            System.out.println(h);
        }
    }
 public static void task4(){
     System.out.println("Задача 4");
     for(int v=10;v>=-10;v=v-1){
         System.out.println(v);
     }
    }
}