import java.time.LocalDate;
import java.util.PriorityQueue;
import java.util.Queue;

import models.Person;

public class App {

    public static  void generatePersons(Queue<Person> personQueue ){

        // Generar 100 personas con datos aleatorios
        for (int i = 0; i < 100; i++) {
            String nombre = "Persona" + (i + 1);
            int numeroTicket = (int) (Math.random() * 1000) + 1;
            int edad = (int) (Math.random() * 80) + 20;  // Edad entre 20 y 99 años
            LocalDate fechaNacimiento = LocalDate.now().minusYears(edad).minusDays((long) (Math.random() * 365));

            // Agregar persona a la cola
            personQueue.add(new Person(nombre, numeroTicket, edad, fechaNacimiento));
        }
    }

    public static void main(String[] args) throws Exception {
        
        System.out.println("Cola de atencion de personas en extranjeria...");
        System.out.println("Processando Persona ....");

        Queue<Person> personQueue = new PriorityQueue<>();

        generatePersons(personQueue);
        
        while (!personQueue.isEmpty()) {
            Person p = personQueue.poll();
            System.out.println("La Persona =>" + p + " sera atendida");
            Thread.sleep(2000);
        }
        System.out.println("Lo Hay mas personas a procesar...");

   }
}
