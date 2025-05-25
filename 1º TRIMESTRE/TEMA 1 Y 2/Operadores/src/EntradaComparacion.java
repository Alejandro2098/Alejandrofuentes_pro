public class EntradaComparacion {

       public static void main(String[] args ){

        //COMPARACION

        int n1 = 20;
        int n2 = 30;

        //COMPARACION


        //> mayor que
        boolean resultado = n1 > n2; //20>30
        System.out.println("El resultado de la comparacion es " + resultado);

        //>= mayor o igual que
        resultado = n2 >= n1; //30>=40
        System.out.println("El resultado de la comparacion es " + resultado);

        //<menor que
        resultado = n2 < n1; //30<40
        System.out.println("El resultado de la comparacion es " + resultado);

        //<=x mnenor o igual que
        resultado = n2 <= n1; //80<30
        System.out.println("El resultado de la comparacion es " + resultado);

        //==igual que
        resultado = n1 == n2; //90==90
        System.out.println("El resultado de la comparacion es " + resultado);

        //!= diferente
        resultado = n1 != n2; //7 90!= 90 false
        System.out.println("El resultado de la comparacion es " + resultado);

        //negacion
        resultado = !resultado; // true



        //OPERACIONES LOGICAS

        System.out.println("Operadores logicos" );

        n1=30;
        n2=40;

        boolean n3= true;

        int n4= -20;
        boolean resultadoLogico= (n1<n2)&& !n3 && n4<0; // true && true && true = true
        System.out.println("El resultado logico  de las &6 es "+resultadoLogico);
        resultadoLogico= (n1>0) || (n2!=n1) || n3 || n4>0; // true ||true || true
           System.out.println("El resultado logico de las && es "+resultadoLogico);
        boolean resultadoCompuesto = ((n1>n2) && !n3 && (n4<10)) || n4>0 || n2>0;
                                   //(F && F && F) || F ||T
                                   // F || F || T
                                   // T
           String palabra1 = "Hola";
           String palabra2 = "hola";
            boolean resultadoPalabras = palabra1.equalsIgnoreCase(palabra2);
           System.out.println( "El resultado de la comparacion de las palabras es "+resultadoPalabras);


           //casting implicito
           //paseo forzado
             n1=4;
             n2=3;

             double resultadoOperacion = (double) n1/n2;
             String n1String = String.valueOf(n1);
             int numeroPalabra = Integer.parseInt(Palabra);
           System.out.println("El resultado de la division es "+resultadoOperacion);













    }




}
