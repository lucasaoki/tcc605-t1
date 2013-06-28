/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semantico;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author gilvolpe
 */
public class TabelaSimbolos implements Constantes {

    public TabelaSimbolos() {
        nivelCorrent = 0;

        lista = new ArrayList< ArrayList<Descritor>>();

        ArrayList<Descritor> array = new ArrayList<Descritor>();

//-------- 6 primeiros elementos da tabela que são pré-definidos ---------------
        Descritor inteiro = new Descritor("int", nivelCorrent);
        inteiro.setNbytes(BYTES_INT);
        inteiro.setCategoria("tipo");

        Descritor boolean_t = new Descritor("TRUE", nivelCorrent);
        boolean_t.setValor(1);
        boolean_t.setNbytes(BYTES_INT);
        boolean_t.setCategoria(CONSTANTE);

        Descritor boolean_f = new Descritor("FALSE", nivelCorrent);
        boolean_f.setValor(0);
        boolean_f.setNbytes(BYTES_INT);
        boolean_f.setCategoria(CONSTANTE);

        Descritor readlong = new Descritor("readlong", nivelCorrent);
        readlong.setCategoria("proc");
        readlong.setNpar(Integer.MAX_VALUE);
        Descritor writelong = new Descritor("writelong", nivelCorrent);
        writelong.setCategoria("proc");
        writelong.setNpar(Integer.MAX_VALUE);
        Descritor writeline = new Descritor("writeline", nivelCorrent);
        writeline.setCategoria("proc");
        writeline.setNpar(Integer.MAX_VALUE);
//------------------------------------------------------------------------------

//-------------- adicionando os 6 elementos na TS ------------------------------
        array.add(inteiro);
        array.add(boolean_t);
        array.add(boolean_f);

        array.add(readlong);
        array.add(writelong);
        array.add(writeline);
//------------------------------------------------------------------------------

        //posição zero está todos os caras
        // que estão relacionados a nivel zero mesmo !!!
        lista.add(array);
    }

    void elimina(int nivel) {
        if (nivel != 0 && nivel < lista.size() && nivel > 0) {
            lista.remove(nivel);
        }
    }

    public int getNivelCorrent() {
        return nivelCorrent;
    }
    
    public int getPosition(String id) {
        Iterator it = (lista.get(0)).iterator();
        while (it.hasNext()) {
            Descritor elem = (Descritor)it.next();
            if (elem.getIdent().compareTo(id) == 0)
                return (lista.get(0)).indexOf(it);
        }
        return -1;
    }
    
    /**
     * Busca ident na TS
     * @param ident identificador a ser buscado na TS
     * @return retorna o identificador
     */
    Descritor busca(String ident) {
        
        Iterator it = lista.iterator();

        while ( it.hasNext() ) {

            ArrayList<Descritor> array = (ArrayList<Descritor>) it.next();

            Iterator elem = array.iterator();

            int nivel = lista.indexOf(array);
            
            while (elem.hasNext()) {

                Descritor comp = new Descritor(ident, nivel);
                Descritor des = (Descritor) elem.next();

                if (comp.equals(des)) {
                    return des;
                }
            }
        }
        return null;
    }

    /**
     * @param nivel indica o nível que se encontra o ident
     * @param ident identificador a ser procurado
     * @return true se encontrou o ident para aquele nivelcorr; false cc.
     */
    boolean declarado(String ident, int nivel) {

        if (nivel < lista.size()) {

            ArrayList<Descritor> array = lista.get(nivel);
            Iterator it = array.iterator();

            while (it.hasNext()) {
                Descritor comp = new Descritor(ident, nivel);
                Descritor des = (Descritor) it.next();

                if (comp.equals(des)) {
                    return true;
                }
            }
        }

        return false;
    }

    boolean insere(String ident) {

        Descritor des = new Descritor(ident, nivelCorrent);

        if (!declarado(ident, nivelCorrent)) {
            lista.get(nivelCorrent).add(des);
            return true;
        }

        return false;
    }
    
    void insere(Descritor desc) {
        if (!declarado(desc.getIdent(),desc.getNivel())) {
            lista.get(nivelCorrent).add(desc);
        }
    }

    /**
     * aumenta o nivel atual.
     */
    public void addNivelCorrente() {
        ArrayList<Descritor> array = new ArrayList<Descritor>();
        lista.add(array);
        this.nivelCorrent = lista.size() - 1;
    }

    public void subNivelCorrente() {
        if (this.nivelCorrent > 0) {
            lista.remove(nivelCorrent);
            this.nivelCorrent--;
        }
    }

    @Override
    public String toString() {
        String str = "";
        Iterator it = lista.iterator();

        while (it.hasNext()) {

            ArrayList<Descritor> array = (ArrayList<Descritor>) it.next();

            Iterator elem = array.iterator();
            int nivel = lista.indexOf(array);

            str += nivel + "\n";
            while (elem.hasNext()) {
                Descritor des = (Descritor) elem.next();
                str += des.toString();
            }
        }
        return str;
    }
    private ArrayList< ArrayList<Descritor>> lista;
    private int nivelCorrent;

    /*
     * Para testar as coisas dessa joça
     */
    public static void main(String[] args) {

        TabelaSimbolos ts = new TabelaSimbolos();

        System.out.println(ts);

        ts.addNivelCorrente();

        String jaca = "jaca";

        ts.insere(jaca);

        System.out.println(ts);

        ts.elimina(1);

        System.out.println(ts);

        Descritor des = ts.busca("int");

        System.out.println(des);
    }
}
