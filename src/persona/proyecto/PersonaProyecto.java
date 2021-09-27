package persona.proyecto;

import activación.DatosPersona;
import caracters.Persona;
import java.util.ArrayList;
import java.util.Scanner;


public class PersonaProyecto {
    
    public static void main(String[] args) {
        
        DatosPersona pd = new DatosPersona ();
      
        Scanner input= new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Persona pl=new Persona(); 
      int opt=0;
      do{
      System.out.println("Elija la opcion 1-crear 2-listar 3-eliminar 4-actualizar 5-cerrar sistema");
        opt= input.nextInt();
          switch(opt){
              case 1:
                   System.out.print("\n Ingrese el nombre: ");
                   pl.setNombre(sc.nextLine());
                   System.out.print("\n Ingrese el apellido paterno: ");
                   pl.setAp_paterno(sc.nextLine());
                   System.out.print("\n Ingrese el apellido materno: ");
                   pl.setAp_materno(sc.nextLine());
                   System.out.print("\n Ingrese la direccion: ");
                   pl.setDireccion(sc.nextLine());
                   System.out.print("\n Ingrese el sexo: ");
                   pl.setSexo(sc.nextLine());
                   
                   pl.create(pl);
              break;
              
              case 2:
                 pl.listarpersonas(pl);
                 
                
              break;
             
              case 3:
                System.out.print("\n Ingrese el id: ");
                pl.setId(sc.nextInt() );
                pl.eliminarPersonas(pl);
                  
              break;
              
              case 4:
                  System.out.print("\n Ingrese el id: ");
                   pl.setId(sc.nextInt() );
                  System.out.print("\n Ingrese el nuevo nombre: ");
                   pl.setNombre(sc.nextLine());
                  System.out.print("\n Ingrese el nuevo apellido paterno: ");
                   pl.setAp_paterno(sc.nextLine());
                  System.out.print("\n Ingrese el nuevo apellido materno: ");
                   pl.setAp_materno(sc.nextLine());
                  System.out.print("\n Ingrese la nueva direccion: ");
                   pl.setDireccion(sc.nextLine());
                  System.out.print("\n Ingrese de nuevo el sexo: ");
                   pl.setSexo(sc.nextLine());
                  pd.actualizarPersona(pl);
              break;
              
              case 5:
                  System.exit(0);
              default:
                  System.out.println("\nOpcion no valida, intente otra vez");
                  break;
              
          }
      }while(opt!=0); 
        
        
        
        
        
        
        
        /*
        DatosPersona pd = new DatosPersona ();
        Persona p1 = new Persona ();
        p1.setId(1);
        p1.setNombre("Octavio");
        p1.setAp_paterno("Ramos");
        p1.setAp_materno("Ccama");
        p1.setDireccion("Av. Pichigua");
        p1.setSexo("M");
  
        Persona p2 = new Persona ();
        p2.setId(2);
        p2.setNombre("Juan");
        p2.setAp_paterno("Huanca");
        p2.setAp_materno("Quispe");
        p2.setDireccion("Av. Alfonso Ugarte");
        p2.setSexo("F");
        
        pd.create(p1);
        pd.create(p2);
        System.out.println("--------------Antes de eliminar----------------");
        for(Persona ps:pd.listaPersonas())
            System.out.println(ps.getId()+" "+ps.getNombre()+" "+ps.getAp_paterno()+
                    " "+ps.getAp_materno()+
                    " vive en "+ps.getDireccion()+
                    " de sexo "+ps.getSexo());
        
        
        pd.eliminarPersonas(1);
        System.out.println("--------------Despues de eliminar----------------");
        for(Persona ps:pd.listaPersonas())
            System.out.println(ps.getId()+" "+ps.getNombre()+" "+ps.getAp_paterno()+
                    " "+ps.getAp_materno()+
                    " vive en "+ps.getDireccion()+
                    " de sexo "+ps.getSexo());
      */   
              }
    
}
