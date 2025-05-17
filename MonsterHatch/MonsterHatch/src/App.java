public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Cría una criatura enséñala y entrénalapara actuar de diferentes maneras en una batalla
         * Cada criatura puede actuar con un comportamiento diferente: Agresivo, defensivo o evasivo
         */

         Criatura bultie = new Criatura("bultie", 100, 20, 5, new ComportamientoAgresivo());
         Criatura luminosa = new Criatura("luminosa", 100, 15, 10, new ComportamientoDefensivo());

         Criatura Frieren = new CriaturaMagica("Frieren", 50, 30, 8, new ComportamientoGuillenMagico(30, 20), 300);
         Criatura Aura = new CriaturaMagica("Aura", 50, 10, 4, new ComportamientoGuillenMagico(20, 10), 100);

         System.out.println("\n===== INICIO DE LA SIMULACIÓN =====");

         System.out.println("Inicio de la batalla entre bultie y luminosa");
        bultie.ejecutarAccion(luminosa);
        luminosa.ejecutarAccion(bultie);

        System.out.println("Inicio de la batalla entre Frieren y Aura");
        Frieren.ejecutarAccion(Aura);
        Aura.ejecutarAccion(Frieren);

        System.out.println("\n===== FIN DE LA SIMULACIÓN =====");

    }
}
