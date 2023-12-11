
package Clases;


public class SolicitudViatico {
    private String codSolicitud;
    private Comisionado comisionado;
    private String fechaSolicitud;
    private String fechaIda;
    private String fechaRetorno;
    private String tipoViaje;
    private Viatico monto;

    public SolicitudViatico() {
    }

    public SolicitudViatico(String codSolicitud, Comisionado comisionado, String fechaSolicitud, String fechaIda, String fechaRetorno, String tipoViaje, Viatico monto) {
        this.codSolicitud = codSolicitud;
        this.comisionado = comisionado;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaIda = fechaIda;
        this.fechaRetorno = fechaRetorno;
        this.tipoViaje = tipoViaje;
        this.monto = monto;
    }

    public String getCodSolicitud() {
        return codSolicitud;
    }

    public void setCodSolicitud(String codSolicitud) {
        this.codSolicitud = codSolicitud;
    }

    public Comisionado getComisionado() {
        return comisionado;
    }

    public void setComisionado(Comisionado comisionado) {
        this.comisionado = comisionado;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getFechaIda() {
        return fechaIda;
    }

    public void setFechaIda(String fechaIda) {
        this.fechaIda = fechaIda;
    }

    public String getFechaRetorno() {
        return fechaRetorno;
    }

    public void setFechaRetorno(String fechaRetorno) {
        this.fechaRetorno = fechaRetorno;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public Viatico getMonto() {
        return monto;
    }

    public void setMonto(Viatico monto) {
        this.monto = monto;
    }

    
    
}
