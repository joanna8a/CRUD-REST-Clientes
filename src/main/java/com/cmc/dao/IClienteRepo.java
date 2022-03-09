package com.cmc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmc.entidad.Cliente;



public interface IClienteRepo extends JpaRepository<Cliente, Integer>{

}
