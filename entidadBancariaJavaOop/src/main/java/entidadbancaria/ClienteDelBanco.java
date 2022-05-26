package entidadbancaria;/*
 * @author:Diego Marulanda B.
 * date:5/21/2022
 * time:9:48 AM
 * projectName:entidadBancaria
 * */

//TODO cuarta parte, va relacionado con testReferencia2


public class ClienteDelBanco {


	private String nombreDelCliente;
	private String documentoDeIdentidad;
	private String numeroDeTelefono;

	public String getNombreDelCliente() {
		return nombreDelCliente;
	}

	public void setNombreDelCliente(String nombreDelCliente) { //setter,siempre va a solicitar un dato o valor
		this.nombreDelCliente = nombreDelCliente;
	}

	public String getDocumentoDeIdentidad() {
		return documentoDeIdentidad;
	}

	public void setDocumentoDeIdentidad(String documentoDeIdentidad) {
		this.documentoDeIdentidad = documentoDeIdentidad;
	}

	public String getNumeroDeTelefono() {
		return numeroDeTelefono;
	}

	public void setNumeroDeTelefono(String numeroDeTelefono) {
		this.numeroDeTelefono = numeroDeTelefono;
	}
}
