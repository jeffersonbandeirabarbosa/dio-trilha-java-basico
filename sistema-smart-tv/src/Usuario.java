public class Usuario {
    public static void main(String[] args) throws Exception {
          
        SmartTv smartTv = new SmartTv();

            System.out.println("Tv ligada ? " + smartTv.ligada);
            System.out.println("Canal atual: " + smartTv.canal);
            System.out.println("Volume atual: "+ smartTv.volume);

        System.out.println("_____________________________________");

            smartTv.ligar();
                System.out.println("Novo Status -> Tv ligada ? " + smartTv.ligada);

            smartTv.desligar();
                System.out.println("Novo Status -> Tv ligada ? " + smartTv.ligada);

            smartTv.aumentarVolume();
                System.out.println("Novo volume atual -> "+ smartTv.volume);

            smartTv.diminuirVolume();
                System.out.println("Novo volume atual -> "+ smartTv.volume);

        smartTv.mudarCanal(10);

            smartTv.avancarCanal();
            System.out.println("Avancou para o canal " + smartTv.canal);

            smartTv.voltarCanal();
                System.out.println("Voltou para o canal " + smartTv.canal);
    }
}
