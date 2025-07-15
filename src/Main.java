import entities.Vuelo;
import utils.FiltroVuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //Aquí podemos modificar Null por una fecha para comprobar que fiunciona. Usamos LocalDate.of().

    public static final LocalDate fechaDesde = null;

    public static final LocalDate fechaHasta = null;

    public static void main(String[] args) {

        //Crear 10 vuelos. Ej: H001-V, Iberia, Madrid, Buenos Aires

        List<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(new Vuelo(1,"H001-V","Ryanair","A Coruña","Bilbao", LocalDate.of(2025,1,4),LocalDate.of(2025,1,4)));
        vuelos.add(new Vuelo(2,"H002-V","Emirates","Santiago de Compostela","Dubai", LocalDate.of(2025,5,30),LocalDate.of(2025,5,30)));
        vuelos.add(new Vuelo(3,"H003-V","Air Canada","Barcelona","Vancouver", LocalDate.of(2025,12,1),LocalDate.of(2025,12,1)));
        vuelos.add(new Vuelo(4,"H004-V","Vueling","Madrid","Helsinki", LocalDate.of(2025,10,24),LocalDate.of(2025,10,24)));
        vuelos.add(new Vuelo(5,"H005-V","AirEuropa","Porto","París", LocalDate.of(2025,9,8),LocalDate.of(2025,9,8)));
        vuelos.add(new Vuelo(6,"H006-V","Iberia","Londres","Buenos Aires", LocalDate.of(2025,12,28),LocalDate.of(2025,12,28)));
        vuelos.add(new Vuelo(7,"H007-V","Iberia","Amsterdam","Sidney", LocalDate.of(2025,2,22),LocalDate.of(2025,2,22)));
        vuelos.add(new Vuelo(8,"H008-V","Vueling","Madrid","Bogotá", LocalDate.of(2025,8,15),LocalDate.of(2025,8,15)));
        vuelos.add(new Vuelo(9,"H009-V","Turkish","Roma","Japón", LocalDate.of(2025,4,7),LocalDate.of(2025,4,7)));
        vuelos.add(new Vuelo(10,"H010-V","Emirates","Barcelona","New York", LocalDate.of(2025,6,15),LocalDate.of(2025,6,15)));

        //Aquí se usa el filtro(En clase se dijo que si ambas son Null tiene que devolver todas las fechas de vuelo)
        //Por defecto las muestra por orden de Salida(fechaDesde).
        List<Vuelo> resultado = FiltroVuelo.filtrar(vuelos, fechaDesde, fechaHasta);

        //Mostrar por consola
        System.out.println("Filtrar los vuelos (fechaDesde = null, fechaHasta = null):");
        resultado.forEach(System.out::println);
    }
}