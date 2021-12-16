package exemplos.polimorfismo.relatorios;

public class RelatorioX extends RelatorioAbstrato {
    @Override
    protected String construirCorpo() {
        return "conteudo relatorio X";
    }
}
