public class Time {
    private int horas;
    private int minutos;
    private int segundos;

    public Time(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Time(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }

    public Time(int horas) {
        this.horas = horas;
    }

    public Time(){
    }

    public String exibirHoraUniversal() {
        return formataNumero(this.horas) + ":" + formataNumero(this.minutos) + ":" + formataNumero(this.segundos);
    }

    public String exibirHoraPadrao() {
        String hor, sufixo;

        if (this.horas == 12) {
            hor = "12";
            sufixo = "PM";
        } else if (this.horas == 0)  {
            hor = "12";
            sufixo = "AM";
        } else if (this.horas >= 1 && this.horas <= 11) {
            hor = formataNumero(this.horas);
            sufixo = "AM";
        } else {
            hor = formataNumero(this.horas - 12);
            sufixo = "PM";
        }
        return hor + ":" + formataNumero(this.minutos) + ":" + formataNumero(this.segundos) + " " + sufixo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    private String formataNumero(int num) {
        if (num < 10) {
            return "0" + num;
        }
        return String.valueOf(num);
    }
}
