package com.cmc.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cmc.entidad.Cliente;
import com.cmc.servicio.ServicioCliente;

@RestController
public class ControladorCliente {
	@Autowired
	private ServicioCliente servicioCliente;
	
	@PostMapping("/crearCliente")
	public Cliente crearCliente(@RequestBody Cliente cliente) {
		return servicioCliente.crearCliente(cliente);
	}
	@GetMapping("/cliente/{id}")
	public Cliente consultarClientePorId(@PathVariable int id) {
		return servicioCliente.consultarClientePorId(id);
	}
	
	@GetMapping("/clientes")
	public List<Cliente> consultarClientes() {
		return servicioCliente.consultarClientes();
	}
	
	@PutMapping("/actualizarCliente")
	public Cliente atualizarCliente(@RequestBody Cliente cliente) {
		return servicioCliente.actualizarCliente(cliente);
	}
	
	@DeleteMapping("/eliminarCliente/{id}")
	public String eliminarCliente(@PathVariable int id) {
		return servicioCliente.eliminarCliente(id);
	}
}
