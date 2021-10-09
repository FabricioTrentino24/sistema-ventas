
package entidad;


public class Usuario {
    private int id;
    private String nomUsuario;
    private String clave;
    private int idempleado;

    public Usuario() {
    }

    public Usuario(int id, String nomUsuario, String clave, int idempleado) {
        this.id = id;
        this.nomUsuario = nomUsuario;
        this.clave = clave;
        this.idempleado = idempleado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }
    
    
    
}
