public class Main {

    public static void main(String[] args){
        coche miCoche = new coche();
        miCoche.aumentarPuertas();
        System.out.println(miCoche.puertas);
        System.out.println(suma(5,7,3));
    }
    public static int suma(int a, int b, int c){

        return a + b + c;
    }
public static class coche{
        public int puertas = 4;
        public void aumentarPuertas(){
            this.puertas++;
        }
}

}
