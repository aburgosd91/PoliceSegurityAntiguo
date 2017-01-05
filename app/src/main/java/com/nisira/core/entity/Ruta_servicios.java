package com.nisira.core.entity;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.Date;
@XStreamAlias("RUTA_SERVICIOS")
public class Ruta_servicios {
	private String idbasedatos;
	@XStreamAlias("IDEMPRESA")
	
	private String idempresa;
	@XStreamAlias("IDORDENSERVICIO")
	
	private String idordenservicio;
	@XStreamAlias("ITEM")
	
	private String item;
	@XStreamAlias("ITEMRUTA")
	
	private String itemruta;
	@XStreamAlias("IDRUTA")
	
	private String idruta;
	@XStreamAlias("LATITUD")
	
	private String latitud;
	@XStreamAlias("LONGITUD")
	
	private String longitud;
	@XStreamAlias("GLOSA")
	
	private String glosa;
	@XStreamAlias("FECHACREACION")
	
	private Date fechacreacion;
	private String ruta;

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

	public void setItemruta(String itemruta) {
		this.itemruta = itemruta;
	}

	public String getItemruta() {
		return this.itemruta;
	}

	public void setIdruta(String idruta) {
		this.idruta = idruta;
	}

	public String getIdruta() {
		return this.idruta;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLatitud() {
		return this.latitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getLongitud() {
		return this.longitud;
	}

	public void setGlosa(String glosa) {
		this.glosa = glosa;
	}

	public String getGlosa() {
		return this.glosa;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Date getFechacreacion() {
		return this.fechacreacion;
	}



	/* Sets & Gets FK*/

    /**
     * @return the ruta
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    /**
     * @return the idbasedatos
     */
    public String getIdbasedatos() {
        return idbasedatos;
    }

    /**
     * @param idbasedatos the idbasedatos to set
     */
    public void setIdbasedatos(String idbasedatos) {
        this.idbasedatos = idbasedatos;
    }

}