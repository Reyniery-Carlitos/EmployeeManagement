package Application;

import Business.Engineer;
import Business.Marketing;
import Employee.Employee;
import Employee.Supervisor;
import Employee.Colaborador;
import Utils.Information;
import Utils.InformationDeptos;

public class App {
    public static void main(String[] args) {
        Supervisor e1 = new Supervisor("1000","Uayeb", "Caballero", 1000);
        Supervisor e2 = new Supervisor("1112", "Ixchel", "Rodriguez", 33);
        Colaborador c1 = new Colaborador("1111", "Imix", "Rodriguez", 33);

        c1.setMi_supervisor(e1);

        c1.AddNewLanguage("PHP");
        c1.AddNewLanguage("NODE");
        c1.AddNewLanguage("SCALA");
        c1.AddNewLanguage("R");

        c1.PrintMyLanguages();

        e1.AssignNewEmployee(c1);
        e1.PrintEmployees();

        System.out.println(c1.getSalaryInfo() );
        e1.setEmployeeSalary(c1, 5000);
        System.out.println( c1.getSalaryInfo() );
        e2.setEmployeeSalary(c1, 7000);

        Engineer engineer = new Engineer("Ingenieria de Procesos", e1);
        Marketing marketing = new Marketing("Mercado Cuantitativo", e2);

        engineer.MainActivities();
        marketing.MainActivities();

        e1.setBu(marketing);

        e1.getBu().MainActivities();
        System.out.println(e1.getBu().getSupervisor().Presentation());

        e1.setMi_supervisor(e1);
        System.out.println(e1.getMi_supervisor().Presentation());

        Information.MainHolidays();
        System.out.println(Information.SALARY_SUPERVISOR_TAX_PERCENTAGE);

        // Inicio de la info de los departamentos
//        System.out.println(InformationDeptos.PagoHrsExtrasEngineer);
        InformationDeptos.InformacionMarketing();
        InformationDeptos.InformacionEngineer();
        InformationDeptos.PresupuestoDeptos();
//        System.out.println(InformationDeptos.PresupuestoMarketing);
    }
}
