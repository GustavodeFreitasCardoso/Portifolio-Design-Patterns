public class teste05 {

    public double calcular(double peso, String modalidade) {

        if (modalidade.equals("normal"))
            return peso * 1.0;

        if (modalidade.equals("sedex"))
            return peso * 2.0;

        if (modalidade.equals("express"))
            return peso * 4.0;

        if (modalidade.equals("jato"))
            return peso * 5.0;

        if (modalidade.equals("fragil"))
            return peso * 8.0;

        return 0;
    }
}