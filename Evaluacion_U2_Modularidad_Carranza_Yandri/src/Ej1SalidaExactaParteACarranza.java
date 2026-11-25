public class Ej1SalidaExactaParteACarranza {

     static int f(int x) { 
        return x * x;
    }

    static int g(int  x) {
        return f(x) + f(x + 1);
    }

    public static void main(String[] args) {
        int x = 2;
        System.out.println(g(x) + " " + f(g(1)));
        System.out.println(x);

    }
}

/*
La salida exacta es la siguiente:
(13, 25)
2
*/