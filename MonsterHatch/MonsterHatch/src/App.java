public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Cría una criatura enséñala y entrénalapara actuar de diferentes maneras en una batalla
         * Cada criatura puede actuar con un comportamiento diferente: Agresivo, defensivo o evasivo
         */

         Criatura bultie = new Criatura("bultie", 100, 20, 5, new ComportamientoAgresivo());
         Criatura luminosa = new Criatura("luminosa", 100, 15, 10, new ComportamientoReflectivoACQN());

         System.out.println("Inicio de la batalla entre bultie y luminosa");
         for(int i = 0; i < 5; i++){
            System.out.println("Turno #"+(i+1));
            bultie.ejecutarAccion(luminosa);
            luminosa.ejecutarAccion(bultie);
        }
    }
}
