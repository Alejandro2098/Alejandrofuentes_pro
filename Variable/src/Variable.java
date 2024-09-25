import java.nio.file.FileSystemNotFoundException;
import java.sql.SQLOutput;

public class Variable {

  static int edadClase = 55;
  //mod_acc mod adicional mod_ret nombre ( argumentos) (cuerpo)
  public static void main (String[] args) {

    System.out.println("Proyecto de variables");
    valoresmaximos();


    //Tipo nombre = ( valor es opcional )
  String nombre= "Alejandro" ; //metodo ocmplejo

    char letra= 'A';
    Character letracompleja= 'a';

    final String CIF = "49701176";

    byte numeromuypequeno=1;
    Byte numeroMuyMpqueno=1;

    short numeroPequeno= 23; // numero pequeño( nunca se ejecuta ñ (ingles todo) (-255,255)
    Short pequenoCompleto= 23;

    int edad= 25; //numeros sin decimal (-65.435, 65.456)
    Integer edadCompleja=25;

    System.out.println("Mi edad es "+edad);
    edad= 26;
    System.out.println("Cambiando edad");
    System.out.println("Mi edad es "+edad);

    long telefono = 123456789;
    Long telefonoComplejo;

    float altura = 1.86f;
    Float alturaCompleja;
    double decimalesDetalle = 3.141516;
    Double decimalescomplejos;

    boolean carnet = true; //false
    Boolean carnetComplejo;


  }

  public static void miMetodo(){
    String nombre= "Miguel";
    int eddad = 23;

}
 public static void otroMetodo () {
 }

 public static void valoresmaximos(){
    //esto con println
   System.out.println("Imprimiendo los valores maximos y minimos de los tipos");
   System.out.println("El tipo byte tiene un maximo de "+Byte.MAX_VALUE+" y un minimo de "+Byte.MIN_VALUE);
   System.out.println("El tipo byte tiene un maximo de "+Short.MAX_VALUE+" y un minimo de "+Short.MIN_VALUE );
   System.out.println("El tipo byte tiene un maximo de "+Double.MAX_VALUE+" y un minimo de "+Double.MIN_VALUE);
   System.out.println("El tipo byte tiene un maximo de "+Long.MAX_VALUE+" y un minimo de "+Long.MIN_VALUE);
   System.out.println("El tipo byte tiene un maximo de "+Integer.MAX_VALUE+" y un minimo de "+Integer.MIN_VALUE);
   System.out.println("El tipo byte tiene un maximo de "+Float.MAX_VALUE+" y un minimo de "+Float.MIN_VALUE);

  //esto es con printlf

   System.out.printf("El tipo byte tiene un maximo de%d y un valor minimo de %d" , Byte.MAX_VALUE ,Byte.MIN_VALUE);
  }

 }

