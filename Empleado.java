import java.util.ArrayList;

/*
sistema de liq de nomina

empresa 

*/


public class Empleado {
 
 
    private int id;

    //propiedades basicas
    private String nombre;
    private int horasExtra;
    private boolean auxilioTransporte;
    private int salario;
    private Double totalDevengado;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoraExtra() {
        return horasExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horasExtra = horaExtra;
    }

    public boolean isAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(boolean auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    
    public Double getTotalDevengado() {
        return this.totalDevengado;
    }

    public void setTotalDevengado(double devengado) {
        this.totalDevengado = devengado;
    }

public Empleado( String nombre, int horasExtra, boolean auxilioTransporte, int salario) {
        this.nombre = nombre;
        this.horasExtra = horasExtra;
        this.auxilioTransporte = auxilioTransporte;
        this.salario = salario;

    }

     


public static ArrayList <Double> liquidarNominaQuincenal(ArrayList<Empleado> empleados){
        ArrayList<Double> nomina = new ArrayList<Double>();

        
        double valorHora;
        double mes = 0;
        double devengado;
        
        for (int i = 0; i < empleados.size(); i++) {  
                boolean st=empleados.get(i).auxilioTransporte;
                double he=empleados.get(i).horasExtra;
                double sal=empleados.get(i).salario;
          
                if (empleados.get(i).auxilioTransporte == true){
                    mes=106454; }
                else
                {mes=0;}
                
                valorHora=sal/240;
                devengado =  ((valorHora*he+sal)*0.08);
                mes =(mes +((valorHora*he)+(sal)-(devengado)));
                System.out.println( devengado);
                mes =(int)mes;
                nomina.add(mes);
         }
                
        return nomina;
        
    }
        
 }