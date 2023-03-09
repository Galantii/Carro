public class exercicios {

    public static void main(String[] args) {
        System.out.println(fato(5));
        System.out.println(fibo(6));

    }

    public static int fato(int x) {
        if (x == 1) {
            return 1;
        }

        return x * fato(x - 1);
    }

    public static int fibo(int x) {
        
        if (x<=1){
            return 1;
        
    }
    return fibo(x-1) + fibo(x-2);
}

}