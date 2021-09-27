package caracters;

public class Persona {
    private int Id;
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String direccion;
    private String sexo;
    public Persona (){
        }
    public Persona(int Id, String nombre, String ap_paterno, String ap_materno, String direccion, String sexo) {
        this.Id = Id;
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.direccion = direccion;
        this.sexo = sexo;
    }      
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void create(Persona pl) {
        }

    public void listarpersonas(Persona pl) {
        }

    public void eliminarPersonas(Persona pl) {
        }

    
    
    
}
