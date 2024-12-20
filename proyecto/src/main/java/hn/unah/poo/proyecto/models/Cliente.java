package hn.unah.poo.proyecto.models;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="clientes")
public class Cliente {
    
@Id
private String dni;

private String nombre;

private String apellido;

private String telefono;

private String correo;

private double sueldo;

@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
private List<Direcciones> direcciones;

@ManyToMany
@JoinTable(name = "cliente_prestamos", 
           joinColumns = @JoinColumn(name = "dni"),
           inverseJoinColumns = @JoinColumn(name = "idPrestamo"))
private Set<Prestamo> prestamos;
}
