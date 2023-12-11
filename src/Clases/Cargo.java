
package Clases;


public class Cargo {
    private String nombreCargo;
    private String tipoCargo;

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public String getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(String tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    public Cargo(String nombreCargo, String tipoCargo) {
        this.nombreCargo = nombreCargo;
        this.tipoCargo = tipoCargo;
    }

    public Cargo() {
    }
    
    
}
