public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) { // mes menor que 1 e maior que 12
            System.out.println("Mês inválido. Alterando data para 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
            return;
        } else if (mes == 2) {
            if (verificaAnoBissexto()) { // ano bissexto
                if (dia > 29) { // mais de 29 dias
                    System.out.println("Dia inválido para ano bissexto. Alterando data para 1/1/2000");
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                    return;
                }
            } else { // nao é bissexto
                if (dia > 28) { // mais de 28 dias num ano que não é bissexto
                    System.out.println("Dia inválido para ano não bissexto. Alterando data para 1/1/2000");
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                    return;
                }
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                System.out.println("Data inválida. Alterando data para 1/1/2000");
                this.dia = 1;
                this.mes = 1;
                this.ano = 2000;
                return;
            }
        } else {
            if (dia > 31) {
                System.out.println("Data inválida. Alterando data para 1/1/2000");
                this.dia = 1;
                this.mes = 1;
                this.ano = 2000;
                return;
            }
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return getDia() + "/" + getMes() + "/" + getAno();
    }

    public boolean verificaAnoBissexto() {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
