package es.sanidad.citacion.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

@Getter
@Setter
public class CitacionCreacionDto {

    @NotNull(message = "The id is required.")
    private Integer id;
    @NotNull(message = "The horaCita is required.")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date horaCita;
    @NotNull(message = "The notificacionPdf is required.")
    private Boolean notificacionPdf;
    @NotNull(message = "The observacion is required.")
    private String observacion;
    @NotNull(message = "The urgente is required.")
    private Boolean urgente;
    @NotNull(message = "The doctorApellido is required.")
    private String doctorApellido;

    private Boolean doctorExistence;
}

