public class Relogio {
    private int horas, minutos, segundos;

    public Relogio(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public void setHoras(int setarHorario) {
        if (setarHorario >= 0 && setarHorario <= 23) {
            horas = setarHorario;
        }
    }

    public void setMinutos(int setarMinutos) {
        if (setarMinutos >= 0 && setarMinutos <= 59) {
            minutos = setarMinutos;
        }
    }

    public void setSegundos(int setarSegundos) {
        if (setarSegundos >= 0 && setarSegundos <= 59) {
            segundos = setarSegundos;
        }
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public String getHoraAtual() {
        return horas + "h" + minutos + "m" + segundos + "s";
    }
}
