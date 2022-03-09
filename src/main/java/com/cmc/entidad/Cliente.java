package com.cmc.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {
@Id
@GeneratedValue
private int id;
@Column
private String nombres;
@Column
private String apellidos;
@Column
private String direccion;
@Column
private String celular;
@Column
private String telefono;
}
