package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroVuelo {
    public static List<Vuelo> filtrar(List<Vuelo> vuelos, LocalDate desde, LocalDate hasta) {
        return vuelos.stream()
                .filter(v -> desde == null || v.getFechaInicio().isAfter(desde))
                .filter(v -> hasta == null || v.getFechaInicio().isBefore(hasta))
                .sorted(Comparator.comparing(Vuelo::getFechaInicio))
                .collect(Collectors.toList());
    }
}
