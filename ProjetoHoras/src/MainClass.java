public class MainClass {
    public static void main(String[] args) {
        Time time = new Time(15, 55, 7);

        Time time2 = new Time(22, 21);

        System.out.println(time.exibirHoraPadrao());
        System.out.println(time.exibirHoraUniversal());

        System.out.println(time2.exibirHoraPadrao());
        System.out.println(time2.exibirHoraUniversal());
    }
}
