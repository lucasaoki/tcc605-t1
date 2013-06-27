/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semantico;

/*
 * @author Gustavo Luvizotto Cesar - 6783544 - gustavoluvizotto@gmail.com
 */
public class Rotinas {

    public Rotinas() {
        TS = new TabelaSimbolos();
    }

    /**
     * Rotina 0, 2, 3. Verifica se ident ja esta declarado na TS
     *
     * @param id
     * @param nivelcorr
     */
    public void verificaEInsereID(String id, int nivelcorr) {
        if (TS.declarado(id, nivelcorr)) {
            System.err.println("id já declarado");
        } else {
            TS.insere(id);
        }
    }

    public String rotinaNove(String id, int nivelcorr, String tipo) {
        Descritor achou = TS.busca(id); // essa busca tem que ser feita no nivelcorr
        if (achou == null || !achou.getCategoria().equals(tipo)) {
            System.err.println("tipo não definido");
        }
        return achou.getEnder();
    }
    public void preencheVarNaTS(Descritor des) {
        
    }
    private TabelaSimbolos TS;
}
