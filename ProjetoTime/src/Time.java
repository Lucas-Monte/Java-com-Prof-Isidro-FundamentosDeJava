public class Time {
    private int hora;
    private int min;
    private int seg;

    public Time(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public Time(int min, int hora) {
        this.min = min;
        this.hora = hora;
    }

    public Time(int hora) {
        this.hora = hora;
    }

    public Time() {
    }

    public void setTime(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public void setTime(int hora, int min) {
        this.hora = hora;
        this.min = min;
        this.seg = 0;
    }

    public void setTime(int hora) {
        this.hora = hora;
        this.min = 0;
        this.seg = 0;
    }

    public String exibirHoraUniversal() {
        return formataNumero(hora) + ":" + formataNumero(min) + ":" + formataNumero(seg);
    }

    public String exibirHoraPadrao() {
        String strHora, sufixo;
        if(hora == 12) {
            strHora = "12";
            sufixo = "PM";
        }
        else if(hora == 0) {
            strHora = "12";
            sufixo = "AM";
        }
        else if(hora >= 1 && hora <= 11) {
            strHora = formataNumero(hora);
            sufixo = "AM";
        }
        else {
            strHora = formataNumero(hora - 12);
            sufixo = "PM";
        }
        return strHora + ":" + formataNumero(min) + ":" + formataNumero(seg) + " " + sufixo;
    }

    private String formataNumero(int num) {
        if (num <= 10) {
            return "0"+num;
        }
        return String.valueOf(num);
    }
}
