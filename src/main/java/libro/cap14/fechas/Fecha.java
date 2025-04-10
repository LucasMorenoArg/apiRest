package libro.cap14.fechas;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int d, int m, int a) {
        dia = d;
        mes = m;
        año = a;
    }

    public Fecha(String s){
        //Buscamos la primera ocurrencia de '/'.
        int pos1 = s.indexOf('/');
        //Buscamos la ultima ocurrencia de '/'.
        int pos2 = s.indexOf('/');

        //Procesamos el día.
        String sDia = s.substring(0, pos1);
        dia = Integer.parseInt(sDia);
        String sMes = s.substring(pos1+1, 2);
        mes = Integer.parseInt(sDia);
        String sAño = s.substring(pos2+1);
        año = Integer.parseInt(sAño);
    }

}
