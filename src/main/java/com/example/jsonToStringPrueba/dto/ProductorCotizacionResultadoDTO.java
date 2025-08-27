package com.example.jsonToStringPrueba.dto;

import java.util.List;

public class ProductorCotizacionResultadoDTO {

    private Integer codAgt;
    private Long numPropuesta;
    private String inicioVigencia;
    private String finVigencia;
    private ErrorDTO error;
    private List<CotizacionResultadoDTO> cotizacionesResultado;

}
