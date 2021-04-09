package Utils;

public class InformationDeptos {
    public static int PresupuestoMarketing = 150000;
    public static int PresupuestoEngineer = 100000;
    public static float PagoHrsExtrasMarketing = 75;
    public static float PagoHrsExtrasEngineer = 62.5F;

    public static void InformacionMarketing(){
        System.out.println("****** INFORMACION MARKETING ******");
        // Pago por hora extra trabajada
        System.out.println("El pago por hora extra en el depto de marketing es de: " + PagoHrsExtrasMarketing + " Lps");
        System.out.println(" ");

        // Proyectos realizados recientemente.
        System.out.println("=====> PROYECTOS RECIENTES DE MARKETING <=====");
        System.out.println("Titulo proyecto 1 de marketing");
        System.out.println("Titulo proyecto 2 de marketing");
        System.out.println("Titulo proyecto 3 de marketing");
        System.out.println("Titulo proyecto 4 de marketing");
        System.out.println(" ");
    }

    public static void InformacionEngineer(){
        System.out.println("****** INFORMACION INGENIERIA ******");
        // Pago por hora extra trabajada
        System.out.println("El pago por hora extra en el depto de ingenieria es de: " + PagoHrsExtrasEngineer + " Lps");
        System.out.println(" ");

        // Proyectos realizados recientemente
        System.out.println("=====> PROYECTOS RECIENTES DE INGENIERIA <=====");
        System.out.println("Titulo proyecto 1 de ingenieria");
        System.out.println("Titulo proyecto 2 de ingenieria");
        System.out.println("Titulo proyecto 3 de ingenieria");
        System.out.println("Titulo proyecto 4 de ingenieria");
        System.out.println(" ");
    }

    public static void PresupuestoDeptos(){
        System.out.println("Presupuesto de ingenieria: " + PresupuestoEngineer + " Lps");
        System.out.println("Presupuesto de marketing: " + PresupuestoMarketing + " Lps");
    }
}
