package Dao;

import entidad.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class clsUsuarioDao {

    clsConexion con = new clsConexion();
    Connection cn = con.MyConectar();

    ResultSet rs;

    public boolean AccesoSistema(Usuario usu) {
        PreparedStatement ps = null;
        String Sql = "SELECT nomusuario,usuario FROM usuarios WHERE nomusuario=? and clave=?";
        try {
            String sql = null;
            ps = cn.prepareStatement(sql);
            ps.setString(1, usu.getNomUsuario());
            ps.setString(2, usu.getClave());

            rs = ps.executeQuery();
            if (rs.next()) {
                if(usu.getNomUsuario().equals(rs.getString(1)) && usu.getClave().equals(rs.getString(2)));
                    return true;
            }else{
            return false;
            }
        } catch (Exception e) {
            System.out.println("Error en: "+e);
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
        return false;
    }
}
