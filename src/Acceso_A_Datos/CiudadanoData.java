
package Acceso_A_Datos;

import Entidades.Ciudadano;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/* Rodrigo Fazzito */
public class CiudadanoData {
    private Connection con=null;

    public CiudadanoData() {
        con = Conexion.getConexion();
    }
   public void GuardarCiudadano(Ciudadano ciudadano){
       String sql = "INSERT INTO ciudadano(dni,nombreCompleto,email,celular,patologia,ambitoTrabajo)values(?,?,?,?,?,?)";
       try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ciudadano.getDni());
            ps.setString(2, ciudadano.getNombreComp());
            ps.setString(3, ciudadano.getEmail());
            ps.setInt(4, ciudadano.getCelular());
            ps.setString(5, ciudadano.getPatologia());
            ps.setString(6, ciudadano.getAmbitoTrabajo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                ciudadano.setDni(rs.getInt(1));
                ps.close();
            }
        } catch (SQLException ex) {
            System.out.println("error al acceder a la tabla ciudadano"+ ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudadano " + ex.getMessage());
        }
   } 
       public Ciudadano buscarCiudadano(int dni){
        String sql = "select nombreCompleto,email,celular,patologia,ambitoTrabajo from ciudadano where dni = ?";
        Ciudadano ciudadano = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                ciudadano = new Ciudadano();
                ciudadano.setDni(dni); 
                ciudadano.setNombreComp(rs.getString("nombreCompleto"));
                ciudadano.setEmail(rs.getString("email"));
                ciudadano.setCelular(rs.getInt("celular"));
                ciudadano.setPatologia(rs.getString("patologia"));
                ciudadano.setAmbitoTrabajo(rs.getString("ambitoTrabajo"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudadano");
        }
        return ciudadano;
    }
       public List<Ciudadano> listarciudadanos(){
        String sql = "select dni,nombreCompleto,email,celular,patologia,ambitoTrabajo from ciudadano";
        ArrayList<Ciudadano> ciudadanos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Ciudadano ciudadano = new Ciudadano();
                ciudadano.setDni(rs.getInt("dni")); 
                ciudadano.setNombreComp(rs.getString("nombreCompleto"));
                ciudadano.setEmail(rs.getString("email"));
                ciudadano.setCelular(rs.getInt("celular"));
                ciudadano.setPatologia(rs.getString("patologia"));
                ciudadano.setAmbitoTrabajo(rs.getString("ambitoTrabajo"));
                ciudadanos.add(ciudadano);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla alumno");
        }
        //JOptionPane.showMessageDialog(null, alumnos);
        return ciudadanos;
    }
}
