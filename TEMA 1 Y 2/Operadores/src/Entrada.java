import org.w3c.dom.ls.LSOutput;

public class Entrada {

    public static void main(String[] args) {

        //OPERADORES ARITMETICOS BINARIOS
        int operador1 = 10;
        int operador2 = 5;
        int resultado = operador1 + operador2;//15
        System.out.println("El resultado de la suma es " + resultado);

        resultado = operador1 - operador2; //
        System.out.println("El resiltado de la resta es " + resultado);

        resultado = operador1 * operador2; //50
        System.out.println("El resultado de la multiplicacion es " + resultado);

        resultado = operador1 / operador2; //2
        System.out.println("El resultado de la division es " + resultado);

        resultado = operador1 % operador2;//3.0// System.out.println("El resultado del resto es "+resultado);
        System.out.println("El resultado del modulo es " + resultado);


        //ARITMETICOS MONARIOS
        //opuesto
        resultado = -resultado; //-3
        System.out.println("El resultado del opuesto es " + resultado);//-3

        //INCREMENTO
        //resultado = resultado +1
        resultado = ++resultado; //-2
        System.out.println("El resultado del incremento es " + resultado);//2

        //DECREMENTO
        //resultado = resultado -1
        resultado = resultado;//-3
        System.out.println("El resultado del decremento es " + resultado);//1

        //resultado =1

        //ASIGNACION

        operador1 = 10;
        resultado += operador1;//11
        System.out.println("El resultado de la suma asingada es " + resultado);

        resultado -= 6; //5
        System.out.println("El resultado de la resta asingada es " + resultado);

        resultado *= 3; //15
        System.out.println("El resultado de la multiplicacion asingada es " + resultado);

        resultado /= 2; //7.5
        System.out.println("El resultado de la division asingada es " + resultado);

        resultado %= 2; //1
        System.out.println("El resultado del modulo asingado es " + resultado);
    








    }




}
