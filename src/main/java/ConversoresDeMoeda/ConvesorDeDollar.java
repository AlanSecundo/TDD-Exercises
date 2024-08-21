package ConversoresDeMoeda;

public class ConvesorDeDollar implements ConversorDeMoeda {

    static double COTACAO_REAL = 5;

    @Override
    public double converterParaDollar(double valor) {
        return valor;
    }

    @Override
    public double converterParaReal(double valor) {
        return valor * COTACAO_REAL;
    }
}
