import java.util.ArrayList;

class Main {

    public static void main(String[] args){
        System.out.println("hola");


        ArrayList<Empleado> listaEmp = new ArrayList<Empleado>();
        Empleado e1= new Empleado("Ada",5,true, 1500000);
        e1.setTotalDevengado(1500000);
        Empleado e2= new Empleado("jorge",2,true, 1500000);
        e2.setTotalDevengado(1500000);
        Empleado e3= new Empleado("jorge",2,true, 1500000);
        e3.setTotalDevengado(1500000);
        Empleado e4= new Empleado("jorge",2,true, 1500000);
        e4.setTotalDevengado(1500000);

        listaEmp.add(e1);
        listaEmp.add(e2);
        listaEmp.add(e3);
        listaEmp.add(e4);

        Empresa empresa = new Empresa();
        
        empresa.liquidarSegSocEmp(listaEmp);

    }
}