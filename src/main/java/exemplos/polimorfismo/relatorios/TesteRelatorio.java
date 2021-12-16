package exemplos.polimorfismo.relatorios;

import java.util.Arrays;

public class TesteRelatorio {

    public static void main(String[] args) {
        RelatorioAbstrato[] relatorios = {new RelatorioX(), new RelatorioY()};
        Arrays.stream(relatorios).forEach(relatorio -> relatorio.imprimir());
    }
}
