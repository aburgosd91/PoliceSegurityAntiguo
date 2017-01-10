package com.nisira.core.entity;

import com.google.gson.annotations.SerializedName;
import com.nisira.annotation.Columna;
import com.nisira.annotation.Tabla;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;
import java.util.Date;

@Tabla(nombre = "DORDENSERVICIOCLIENTE")
@XStreamAlias("DORDENSERVICIOCLIENTE")

public class Dordenserviciocliente implements Serializable {
	@Columna
	@SerializedName("idempresa") 
	@XStreamAlias("idempresa") 
	private String idempresa = "" ;
	@Columna
	@SerializedName("idordenservicio") 
	@XStreamAlias("idordenservicio") 
	private String idordenservicio = "" ;
	@Columna
	@SerializedName("item") 
	@XStreamAlias("item") 
	private String item = "" ;
	@Columna
	@SerializedName("idvehiculo") 
	@XStreamAlias("idvehiculo") 
	private String idvehiculo = "" ;
	@Columna
	@SerializedName("placa_cliente") 
	@XStreamAlias("placa_cliente") 
	private String placa_cliente = "" ;
	@Columna
	@SerializedName("hora_req") 
	@XStreamAlias("hora_req") 
	private Double hora_req = 0.00 ;
	@Columna
	@SerializedName("fecha_fin_servicio") 
	@XStreamAlias("fecha_fin_servicio") 
	private Date fecha_fin_servicio;
	@Columna
	@SerializedName("fechacreacion") 
	@XStreamAlias("fechacreacion") 
	private Date fechacreacion;



	/* Sets & Gets */
	public void setIdempresa(String idempresa) {
		this.idempresa = idempresa;
	}

	public String getIdempresa() {
		return this.idempresa;
	}

	public void setIdordenservicio(String idordenservicio) {
		this.idordenservicio = idordenservicio;
	}

	public String getIdordenservicio() {
		return this.idordenservicio;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getItem() {
		return this.item;
	}

	public void setIdvehiculo(String idvehiculo) {
		this.idvehiculo = idvehiculo;
	}

	public String getIdvehiculo() {
		return this.idvehiculo;
	}

	public void setPlaca_cliente(String placa_cliente) {
		this.placa_cliente = placa_cliente;
	}

	public String getPlaca_cliente() {
		return this.placa_cliente;
	}

	public void setHora_req(Double hora_req) {
		this.hora_req = hora_req;
	}

	public Double getHora_req() {
		return this.hora_req;
	}

	public void setFecha_fin_servicio(Date fecha_fin_servicio) {
		this.fecha_fin_servicio = fecha_fin_servicio;
	}

	public Date getFecha_fin_servicio() {
		return this.fecha_fin_servicio;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Date getFechacreacion() {
		return this.fechacreacion;
	}



	/* Sets & Gets FK*/

}