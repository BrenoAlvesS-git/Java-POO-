public class Lista3Q3 {
    public static void main(String[] args) {
        int valor=5;
        float total=1;
        for(int x = 1;x<valor;x++){
            total = total + (1.0f/(x+1));
            System.out.println("Com for: "+total);
        }
        System.out.println("\n\n");
        valor =5;
        total = 1; 
        int x = 1;
        while (valor > x) {
            total = total +(1.0f / (x+1));
            x++;
            System.out.println("Com while: "+total);
        }
    }
}
