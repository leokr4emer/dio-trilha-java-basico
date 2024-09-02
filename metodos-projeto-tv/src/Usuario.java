public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("a TV está ligada? : " + smartTv.ligada);
        System.out.println("canal da TV : " + smartTv.canal);
        System.out.println("volume da TV : " + smartTv.volume);
    }
}
