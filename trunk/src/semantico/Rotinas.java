/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semantico;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * @author Gustavo Luvizotto Cesar - 6783544 - gustavoluvizotto@gmail.com
 */
public class Rotinas {

    public Rotinas() {
        TS = new TabelaSimbolos();
        this.nparam = 0;
        this.st = new ArrayList<Integer>();
    }

    /**
     * Rotina 0, 1, 3 e 4. Se declarado(TS,s,nivelcorr) então erro(‘id já
     * declarado’); senão insere(TS,s,ref); Atualiza os campos nível, categoria,
     * tipo_v das variáveis na TS através da rotina seta_atributos com:
     * nivelcorr, variável, o endereço fornecido pela rs(9);
     *
     * @param id identificador a ser verificado (s)
     */
    public void verificaEInsereID(String id) {
        if (TS.declarado(id, TS.getNivelCorrent())) {
            System.err.println("id já declarado");
        } else {
            Descritor desc = new Descritor(id, TS.getNivelCorrent());
            desc.setCategoria("var");
            desc.setEnder("int");
            TS.insere(desc);
        }
    }

    /**
     * Rotina 9. busca(TS,s,ref,achou); Se não achou ou (achou e categoria <>
     * tipo) então erro(‘tipo não definido’) End_tipo:= ref
     *
     * @param id identificador
     * @param nivelcorr nivel atual
     * @param tipo
     * @return
     */
    public int rotina9(String id, String tipo) {
        Descritor achou = TS.busca(id);
        System.out.println(TS.getNivelCorrent());
        if (achou == null || achou.getCategoria().compareTo(tipo) != 0) {
            System.err.println("tipo não definido");
            return -1;
        }
        return TS.getPosition(id);
    }

    public void rotina5(String id) {
        if (TS.declarado(id, TS.getNivelCorrent())) {
            System.err.println("id já declarado");
        } else {
            Descritor desc = new Descritor(id, TS.getNivelCorrent());
            desc.setCategoria("proc");
            desc.setNpar(0);
            TS.insere(desc);
            TS.addNivelCorrente();
        }
    }

    public void rotina18(String id) {
        if (TS.declarado(id, TS.getNivelCorrent())) {
            System.err.println("id já declarado");
        } else {
            Descritor desc = new Descritor(id, TS.getNivelCorrent());
            desc.setCategoria("param");
            this.nparam++;
            desc.setNpar(nparam);
            System.out.println(id);
            desc.setEnder(Integer.toString(this.rotina9("int", "tipo")));  // rotina 19
            TS.insere(desc);
        }
    }

    public void rotina20() {
        this.nparam = 0;
    }

    public void rotina8() {
        this.nparam = 0;
        TS.subNivelCorrente();
    }

    public int rotina26(String valor) {
        return Integer.parseInt(valor);
    }

    public void rotina21(String id) {
        Descritor desc = TS.busca(id);
        if (desc == null) {
            System.err.println("id nao foi declarado");
        }
    }

    public void rotina25(String id){
        Descritor desc = TS.busca(id);
        if (desc == null || desc.getCategoria().compareTo("proc") != 0 ) {
            System.err.println("procedimento nao definido");
        }
    }
    
    public void rotina25_l(String id) {
        Descritor desc = TS.busca(id);
        if (desc == null || desc.getCategoria().compareTo("var") != 0 || desc.getCategoria().compareTo("param") != 0) {
            System.err.println("variavel ou parametro nao definidos");
        }
    }

    public void rotina23() {
        this.nparam++;
    }

    public void rotina24(String id) {
        Descritor desc = TS.busca(id);
        if (desc == null) {
            System.err.println("id nao foi declarado");
        } else {
            if (desc.getNpar() != this.nparam) {
                System.err.println("incompatibilidade no numero de parametros");
            }
            this.nparam = 0;
        }
    }

    public void rotina27(int valor) {
        if (this.st.contains(valor)) {
            System.err.println("constante do switch ja declarada");
        } else {
            this.st.add(valor);
        }
    }

    public void rotina28() {
        Iterator it = st.iterator();

        while (it.hasNext()) {
            st.remove(it);
        }
    }
    // ATRIBUTOS
    private TabelaSimbolos TS;
    private int nparam;
    private ArrayList<Integer> st;
}
