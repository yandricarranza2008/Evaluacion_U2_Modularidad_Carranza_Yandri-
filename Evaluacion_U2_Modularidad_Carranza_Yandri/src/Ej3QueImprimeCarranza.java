public class Ej3QueImprimeCarranza {

    static void m(int a, int[] v) { 
        a++; 
        v[1] += a; 
    }
// main: int a = 5; int[] v = {1, 2, 3}; m(a, v); System.out.println(a + " " + v[1]);

    public static void main(String[] args) {
        
        int a = 5;
        int[] v = {1, 2, 3};
        m(a, v);
        System.out.println(a + " " + v[1]);
    }
}

// La respuesta es (5, 8)