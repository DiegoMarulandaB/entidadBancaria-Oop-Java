package entidadbancaria;/*
 * @author:Diego Marulanda B.
 * date:5/20/2022
 * time:18:18 PM
 * projectName:entidadBancaria
 * */

//TODO parte uno
//extension para resaltar los commentarios , bettercomments

import org.apache.logging.log4j.LogManager; //!los import, private static final y looger los pueden borrar
import org.apache.logging.log4j.Logger;

public class Cuenta { //!class, representa un tipo, un objeto o una entidad, en este caso es cuenta

	private static final Logger logger = LogManager.getLogger(Cuenta.class);
	//atributos de la cuenta
	//todos los atributos se inician en 0 porque las variables  no tienen ningun valor, ejemplo saldo;, en caso del String titular; su valor es null

	//private es un modificador de acceso, y restringe cambios sin usar metodos predefinidos Getter
	private double saldo;
	private int agencia;
	private int numero;
	private ClienteDelBanco titular = new ClienteDelBanco(); //reeferencia a objeto

	//public Cuenta() { //!aqui se creo el constructor manualmente, pero no fue usado, para obligar al objeto. al momento de su creación informarle un numéro de agencia

	//}
	private static int total = 0; //La variable total, no pertenece a la instancia (new Cuenta) ya que es static, sino que pertenece a la clase Cuenta

	public Cuenta(int agencia) { //ver constructorCuenta
		if (this.agencia <= 0) {
			logger.info("no existe una agencia que contenga el numéro 0"); //este mensaje no deberia salir al crear una cuenta, luego se corrige
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++; //cada vez que se crea una cuenta nueva se incrementa en 1
		logger.info("Cuenta número " + total + " creada");
	}


	//!Metodo es la secuencia de pasos para realizar una accion
	//void es un metodo que no retorna nada
	//this se refiere a que se esta trabajando con este objeto, ejemplo this.saldo//
	//public es un modificador
	public void depositarDinero(double valor) { // el scope se determina por las {}
		//this.saldo = this.saldo + valor; por buena practica se usa como esta en la linea de abajo
		this.saldo += valor; //esta linea se usa para aumentar el saldo de miCuenta
	}

	public boolean retirarDinero(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}


	// cuenta es un objeto del tipo Cuenta
	public boolean transferirDinero(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor; //en esta linea se retira dinero por la transferencia
			cuenta.depositarDinero(valor); //aumentar valor en el saldo de la cuenta
			return true;
		}
		return false;
	}

	//getter y setter
	public double getSaldo() { //getter sirve para obtener el valor de una clase privada
		return saldo;
	}

	public void setSaldo(double saldo) { //setter,siempre va a solicitar un dato o valor
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	//public void setAgencia(int agencia) {
	//	if (agencia > 0) {
		//	this.agencia = agencia;
	//	} else {
		//	logger.info(
					//"No estan permitidos los saldos negativos "); //ver ModificadorAccesoCuenta, cuenta.setAgencia(-22);
	//	}
	//}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ClienteDelBanco getTitular() {
		return titular;
	}

	public void setTitular(ClienteDelBanco titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Cuenta.total;
	}
}
