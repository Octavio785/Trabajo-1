package activación;

import java.util.ArrayList;
import caracters.Persona;

public class DatosPersona {
    
    ArrayList<Persona> lista = new ArrayList<>();
    
    public void create(Persona p){
        System.out.println("Insertando:"+p.getNombre()); 
        lista.add(p);
    }
    
    public ArrayList<Persona> listaPersonas(){
        return lista;
    } 
    
    public void eliminarPersonas(int id){
        
        for(Persona s : lista){
            if(id==s.getId()){
                System.out.println("Eliminando registro de: "+s.getNombre());
                lista.remove(s);
            }
    }
        
    
    }
    public void actualizarPersona (int id, Persona p){
        for(Persona s : lista){
            if(id==s.getId()){
             s.setNombre(p.getNombre());
             s.setAp_paterno(p.getAp_paterno());
             s.setAp_materno(p.getAp_materno());
             s.setDireccion(p.getDireccion());
             s.setSexo(p.getSexo());
    }
    } 
    }

    public void actualizarPersona(Persona pl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    

