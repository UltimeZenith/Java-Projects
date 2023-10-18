
package Test;

import inhiretance.*;

import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {
        Employee empleado1 = new Employee(3000, "Alex");
        System.out.println(empleado1);
        Employee empleado2 = new Employee(4000, "Reol");
        System.out.println(empleado2);
        
        //Crear Clientes
        var fecha = new Date(); //Obtener la fecha de hoy
        Client cliente1 = new Client(fecha, true, "Suny", 'F', 18, "Santo Tomas");
        System.out.println(cliente1);
    }
    
}
