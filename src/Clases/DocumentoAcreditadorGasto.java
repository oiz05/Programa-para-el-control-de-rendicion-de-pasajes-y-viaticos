
package Clases;


public class DocumentoAcreditadorGasto {
    private String nombreEmpresa;
    private double montoGasto;
    private String fechaGasto;
    private String codDoc;
    private SolicitudViatico solicitudV;
    private String tipoDAG;
    private String descripcionGasto;
    //ATRIBUTOS DECLARACION JURADA-----------------------
    private String nombreDeclarador;
    private String apellidoDeclarador;
    private String tipoDocumentoDeclarador;
    private String documentoDeclarador;
    
    
    

    public DocumentoAcreditadorGasto() {
    }

    public DocumentoAcreditadorGasto(String nombreEmpresa, double montoGasto, String fechaGasto, String codDoc, SolicitudViatico solicitudV, String tipoDAG, String descripcionGasto, String nombreDeclarador, String apellidoDeclarador, String tipoDocumentoDeclarador, String documentoDeclarador) {
        this.nombreEmpresa = nombreEmpresa;
        this.montoGasto = montoGasto;
        this.fechaGasto = fechaGasto;
        this.codDoc = codDoc;
        this.solicitudV = solicitudV;
        this.tipoDAG = tipoDAG;
        this.descripcionGasto = descripcionGasto;
        this.nombreDeclarador = nombreDeclarador;
        this.apellidoDeclarador = apellidoDeclarador;
        this.tipoDocumentoDeclarador = tipoDocumentoDeclarador;
        this.documentoDeclarador = documentoDeclarador;
    }

    
    
   
    
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public double getMontoGasto() {
        return montoGasto;
    }

    public void setMontoGasto(double montoGasto) {
        this.montoGasto = montoGasto;
    }

    public String getFechaGasto() {
        return fechaGasto;
    }

    public void setFechaGasto(String fechaGasto) {
        this.fechaGasto = fechaGasto;
    }

    public String getCodDoc() {
        return codDoc;
    }

    public void setCodDoc(String codDoc) {
        this.codDoc = codDoc;
    }

    public SolicitudViatico getSolicitudV() {
        return solicitudV;
    }

    public void setSolicitudV(SolicitudViatico solicitudV) {
        this.solicitudV = solicitudV;
    }

    public String getTipoDAG() {
        return tipoDAG;
    }

    public void setTipoDAG(String tipoDAG) {
        this.tipoDAG = tipoDAG;
    }

    public String getDescripcionGasto() {
        return descripcionGasto;
    }

    public void setDescripcionGasto(String descripcionGasto) {
        this.descripcionGasto = descripcionGasto;
    }

    public String getNombreDeclarador() {
        return nombreDeclarador;
    }

    public void setNombreDeclarador(String nombreDeclarador) {
        this.nombreDeclarador = nombreDeclarador;
    }

    public String getApellidoDeclarador() {
        return apellidoDeclarador;
    }

    public void setApellidoDeclarador(String apellidoDeclarador) {
        this.apellidoDeclarador = apellidoDeclarador;
    }

    public String getTipoDocumentoDeclarador() {
        return tipoDocumentoDeclarador;
    }

    public void setTipoDocumentoDeclarador(String tipoDocumentoDeclarador) {
        this.tipoDocumentoDeclarador = tipoDocumentoDeclarador;
    }

    public String getDocumentoDeclarador() {
        return documentoDeclarador;
    }

    public void setDocumentoDeclarador(String documentoDeclarador) {
        this.documentoDeclarador = documentoDeclarador;
    }

  
    
}
