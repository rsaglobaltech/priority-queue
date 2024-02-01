import models.Empleado;
import models.Estudiante;
import models.Person;

public class App {

    public static void main(String[] args) throws Exception {
        Person empleado = new Empleado("Carlos", 41, null, 2500);
        //Person estudiante = new Estudiante();

        System.out.println(empleado);
        //System.out.println(estudiante);
    
        //Figura figura = new Circulo();
        //figura.area(); //calcular el area del circulo
        //Figura fugura2 = new Cuadrado();
        //figura.area(); //Calcular el area del cuadrado
        //figura.perimetro(); //calcular el perimetro del cuadrado
    
    }
    
}
