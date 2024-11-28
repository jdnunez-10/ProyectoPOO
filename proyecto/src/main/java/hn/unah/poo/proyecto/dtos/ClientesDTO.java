package hn.unah.poo.proyecto.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientesDTO {
 
private String dni;

private String nombre;

private String apellido;

private String telefono;

private String correo;

private int sueldo;

private DireccionesDTO direccionesDTO;
}
