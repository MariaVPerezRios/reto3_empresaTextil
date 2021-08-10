
import java.util.ArrayList;
import java.util.List;

public class Empresa {


public Empresa(){

}
   
private ArrayList<Empleado> empleados = new ArrayList<Empleado>(); 
 
  
ArrayList<Double> liquidarNominaEmp(ArrayList<Empleado> empleados){

    ArrayList<Double> liquida = new ArrayList<>();
    int auxilio=0;
    double totals=0;int valh=0;
    System.out.println("------------------");
    
    for(int z=0;z<empleados.size();z++){

       //boolean st=empleados.get(z).isAuxilioTransporte();
       int he=empleados.get(z).getHoraExtra();
       int sal=empleados.get(z).getSalario();
       
      if(empleados.get(z).isAuxilioTransporte()==true){
        auxilio=106454;  }
        else
        { auxilio=0;            
                }
       valh=sal/240;
     
      totals=(sal +(he*valh) );
    } 

    return null;
}

ArrayList<Double> liquidarParafiscales(ArrayList<Empleado> empleados){
   return null;
}

//todo: 
ArrayList<Double> liquidarSegSocEmp(ArrayList<Empleado> empleados){

    ArrayList<Double> seguridadSocialList = new  ArrayList<>();
    
    for(int indice= 0; indice< empleados.size();indice++ ){

        double devengado = empleados.get(indice).getSalario();

        double salud = devengado * 0.085;
        double pension = devengado * 0.12;
        double riesgosLaborales = devengado * 0.0522;

        System.out.println("devengado: "+ devengado);
        double seguridadSocial = salud + pension + riesgosLaborales; 
        
        seguridadSocialList.add(seguridadSocial);
        System.out.println(seguridadSocial);
    }

    return seguridadSocialList;

}

ArrayList<Double> liquidarPrestacionesEmp(ArrayList<Empleado> empleados){
    ArrayList<Double> prestacionesList = new  ArrayList<>();
    
    for(int indice= 0; indice< empleados.size();indice++ ){

        Double devengado = empleados.get(indice).getTotalDevengado();

        double primaServiciosYCesantias = devengado * 0.0833;
        double interesesCesantias = 0;
        double vacaciones = devengado * 0.0416;

        double prestaciones = primaServiciosYCesantias + vacaciones + interesesCesantias; 

        prestacionesList.add(prestaciones);
        System.out.println(prestaciones);
    }

   
    return prestacionesList;
 }
 



public List<Empleado> getEmpleados(){
    return this.empleados;
}

public void setEmpleados(ArrayList<Empleado> empleados){
    this.empleados = empleados;
}
}