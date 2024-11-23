package com.curso.set.v2;

import java.util.*;

class Cliente {
	private String name;

	public Cliente(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cliente [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(name, other.name);
	}

}

public class Principal {

	public static void main(String[] args) {
		Set<Cliente> setCliente = new TreeSet<>();
		setCliente.add(new Cliente("Patrobas"));
		setCliente.add(new Cliente("Aristobulo"));
		setCliente.add(new Cliente("Herodion"));
		setCliente.add(new Cliente("Patrobas"));
		
		setCliente.forEach(System.out::println); //ClassCastException
		//Aristobulo, Herodion, Patrobas

		
	}

}
