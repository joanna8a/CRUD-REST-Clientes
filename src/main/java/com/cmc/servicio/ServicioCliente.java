package com.cmc.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmc.dao.IClienteRepo;
import com.cmc.entidad.Cliente;

@Service
public class ServicioCliente {
	@Autowired
	private IClienteRepo iClienteRepo;
	
	public Cliente crearCliente(Cliente cliente) {
		return iClienteRepo.save(cliente);
	}
	
	public Cliente consultarClientePorId (int id) {
		return iClienteRepo.findById(Integer.valueOf(id)).orElse(null);
	}
	
	public List<Cliente> consultarClientes(){
		return iClienteRepo.findAll();
	}
	
	public Cliente actualizarCliente(Cliente cliente) {
		Optional<Cliente> opcional=iClienteRepo.findById(cliente.getId());
		if(opcional.isPresent()) {
			/*Cliente antiguo = opcional.get();
			antiguo.setNombre_1(cliente.getNombre_1());
			*/
			return iClienteRepo.save(cliente);
		}else {
			return new Cliente();
		}
	}
	public String eliminarCliente(int id) {
		Optional<Cliente> opcional=iClienteRepo.findById(id);
		if(opcional.isPresent()) {
			iClienteRepo.deleteById(id);
			return "Usuario de id "+id +" fue eliminado";
		}else {
			return "No se encontró el usuario de id "+id;
		}
		
	}
}
