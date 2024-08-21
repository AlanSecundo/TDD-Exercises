import ConversoresDeMoeda.ConversorDeMoeda;
import ConversoresDeMoeda.ConversorDeReal;
import ConversoresDeMoeda.ConvesorDeDollar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCurrencyConverter {

    @Test
    public void realParaDollarTeste() {
        double valorEmReais = 10;
        double valorConvertidoEmDollar = 2;

        ConversorDeMoeda conversorDeMoeda = new ConversorDeReal();

        double result = conversorDeMoeda.converterParaDollar(valorEmReais);

        assertEquals(result, valorConvertidoEmDollar);
    }

    @Test
    public void dollarParaRealTeste() {
        double valorEsperadoEmReais = 10;
        double valorEmDollar = 2;

        ConversorDeMoeda conversorDeMoeda = new ConvesorDeDollar();

        double result = conversorDeMoeda.converterParaReal(valorEmDollar);

        assertEquals(result, valorEsperadoEmReais);
    }
}
