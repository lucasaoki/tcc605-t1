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

        Descritor inteiro = new Descritor("int", nivelCorrent);
        inteiro.setNbytes(BYTES_INT);

        Descritor boolean_t = new Descritor("TRUE", nivelCorrent);
        boolean_t.setValor(1);
        boolean_t.setNbytes(BYTES_INT);

        Descritor boolean_f = new Descritor("FALSE", nivelCorrent);
        boolean_f.setValor(0);
        boolean_f.setNbytes(BYTES_INT);

        Descritor readlong = new Descritor("readlong", nivelCorrent);
        Descritor writelong = new Descritor("writelong", nivelCorrent);
        Descritor writeline = new Descritor("writeline", nivelCorrent);

        array.add(inteiro);
        array.add(boolean_t);
        array.add(boolean_f);

        array.add(readlong);
        array.add(writelong);
        array.add(writeline);

        //posição zero está todos os caras
        // que estão relacionados a nivel zero mesmo !!!
        lista.add(array);
    }

    void elimina(int nivel) {
        if (nivel != 0 && nivel < lista.size() && nivel > 0) {
            lista.remove(nivel);
        }
    }

    Descritor busca(String ident) {

        Iterator it = lista.iterator();

        while (it.hasNext()) {

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
