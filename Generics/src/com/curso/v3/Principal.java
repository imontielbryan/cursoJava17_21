package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		
		Bici bici = new Bici("modeloZ");
		Contenedor<Bici> con1 = new Contenedor<Bici>(bici);
		System.out.println(con1);
		con1.mostrarCertificado(new StringBuilder("XZY123"));
		
		Moto moto = new Moto("motoModX");
		Contenedor<Moto> con2 = new Contenedor<Moto>(moto);
		System.out.println(con2);
		con2.mostrarCertificado(Integer.valueOf(12345));

		Motoneta motoneta = new Motoneta("motonetaModY");
		Contenedor<Motoneta> con3 = new Contenedor<Motoneta>(motoneta);
		System.out.println(con3);
		
		Moto trans = con2.getT();

	}

}
