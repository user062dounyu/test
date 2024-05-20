
public class JavaProgrammingBasicSummary {
    public static void main(String[] args) {
        add(45,13);
        double result= add(12.3 , 4.8);
        System.out.println("double型の加算;" +result);
    }

    // int型引数を2つ受け取るadd()メソッドの定義（戻り値なし）
    public static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("int型の加算：" + result);
    }

    // double型引数を2つ受け取るadd()メソッドの定義（戻り値あり）
    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

}