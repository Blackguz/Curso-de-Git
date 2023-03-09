public class main{

    static void saludar(){
        System.out.println("Hola mundo");
    }

    static void despedir(){
        System.out.println("Adios mundo");
    }

    static int sumar(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        saludar();
        despedir();
        System.out.println(sumar(5, 6));
    }
}