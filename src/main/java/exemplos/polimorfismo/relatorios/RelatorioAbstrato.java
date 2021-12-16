package exemplos.polimorfismo.relatorios;

public abstract class RelatorioAbstrato {

    public static final String DIVISORIA_CABECALHO = "\n=============================================\n";
    public static final String DIVISORIA_RODAPE = "\n---------------------------------------------\n";
    public static final String CABECALHO_PADRAO = "Cabecalho Padrão";
    public static final String RODAPE_PADRAO = "Rodape Padrão";

    public final String imprimir() {
        StringBuilder conteudo = new StringBuilder();

        conteudo.append(construirCabecalho());
        conteudo.append(construirCorpo());
        conteudo.append(construirRodape());

        String relatorio = conteudo.toString();
        System.out.println(relatorio + "\n");
        return relatorio;
    }

    protected String construirCabecalho() {
        return DIVISORIA_CABECALHO + CABECALHO_PADRAO + DIVISORIA_CABECALHO;
    }

    protected String construirRodape() {
        return DIVISORIA_RODAPE + RODAPE_PADRAO + DIVISORIA_RODAPE;
    }

    protected abstract String construirCorpo();
}
