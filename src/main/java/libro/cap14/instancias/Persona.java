package libro.cap14.instancias;

import libro.cap14.fechas.Fecha;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {

    private String nombre;
    private String dni;
    private Fecha fechaNacimiento;
    private int cont = 0;

    public Persona(String nombre, String dni, Fecha fecNac){
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fecNac;
    }

    @Override
    public String toString() {
        cont++;
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
