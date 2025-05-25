 public class Persona {
    // Propiedades privadas
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private double peso;
    private int altura;

    // Métodos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Constructores
    public Persona(String nombre, String apellido, String dni, int edad, double peso, int altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, String apellido, String dni, int edad) {
        this(nombre, apellido, dni, edad, 0.0, 0);
    }

    public Persona(String nombre, String apellido) {
        this(nombre, apellido, "111111111X", 0, 0.0, 0);
    }

    public Persona() {
        this("datos por defecto", "datos por defecto", "111111111X", 0, 0.0, 0);
    }

    private int identificador;
    private double calificacion;
    public Asignatura(){}
     public Asignatura

     public int getIdentificador() {
         return identificador;
     }

     public void setIdentificador(int identificador) {
         this.identificador = identificador;
     }
 }

