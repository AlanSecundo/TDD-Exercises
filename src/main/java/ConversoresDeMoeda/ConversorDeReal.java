package ConversoresDeMoeda;

public class ConversorDeReal implements ConversorDeMoeda{

    static double COTACAO_DOLLAR = 5;

    @Override
    public double converterParaDollar(double valor) {
        return valor / COTACAO_DOLLAR;
    }

    @Override
    public double converterParaReal(double valor) {
        return valor;
    }
}
