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
     * Rotina 0, 2, 3 e 4. Se declarado(TS,s,nivelcorr) então 
     * erro(‘id já declarado’); senão insere(TS,s,ref);
     * Atualiza os campos nível, categoria, tipo_v das variáveis na TS através 
     * da rotina seta_atributos com: nivelcorr, variável, o endereço fornecido 
     * pela rs(9);
     * @param id identificador a ser verificado (s)
     * @param nivelcorr nível a ser buscado
     */
    public void verificaEInsereID(String id, int nivelcorr) {
        Descritor desc = new Descritor(id, nivelcorr);
        if (TS.declarado(id, nivelcorr)) {
            System.err.println("id já declarado");
        } else {
            desc.setCategoria("var");
            desc.setEnder(this.rotinaNove(id, nivelcorr, "int"));
            TS.insere(desc, nivelcorr);
        }
    }

    /**
     * Rotina 9. busca(TS,s,ref,achou); Se não achou ou (achou e categoria <> tipo) 
     * então erro(‘tipo não definido’) End_tipo:= ref
     * @param id identificador 
     * @param nivelcorr nivel atual
     * @param tipo 
     * @return 
     */
    public String rotinaNove(String id, int nivelcorr, String tipo) {
        Descritor achou = TS.busca(id); // essa busca tem que ser feita no nivelcorr
        if (achou == null || !achou.getCategoria().equals(tipo)) {
            System.err.println("tipo não definido");
        }
        return achou.getEnder();
    }
    
    // ATRIBUTOS
    private TabelaSimbolos TS;
}
