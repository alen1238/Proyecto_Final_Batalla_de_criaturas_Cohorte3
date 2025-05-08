public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Cría una criatura enséñala y entrénalapara actuar de diferentes maneras en una batalla
         * Cada criatura puede actuar con un comportamiento diferente: Agresivo, defensivo o evasivo
         */

         Criatura bultie = new Criatura("bultie", 100, 20, 5, new ComportamientoAgresivo());
         Criatura luminosa = new Criatura("luminosa", 100, 15, 10, new ComportamientoDefensivo());

         System.out.println("Inicio de la batalla entre bultie y luminosa");
        bultie.ejecutarAccion(luminosa);
        luminosa.ejecutarAccion(bultie);

    }
}
