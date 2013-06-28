/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semantico;

/**
 *
 * @author gilvolpe
 */
public class Descritor {

    public Descritor(String ident, int nivel){
        this.ident = ident;
        this.nivel = nivel;
    }
    
    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEnder() {
        return ender;
    }

    public void setEnder(String ender) {
        this.ender = ender;
    }

    public int getNbytes() {
        return nbytes;
    }

    public void setNbytes(int nbytes) {
        this.nbytes = nbytes;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getNpar() {
        return npar;
    }

    public void setNpar(int npar) {
        this.npar = npar;
    }

    public String getClassetransf() {
        return classetransf;
    }

    public void setClassetransf(String classetransf) {
        this.classetransf = classetransf;
    }

    public int getInf() {
        return inf;
    }

    public void setInf(int inf) {
        this.inf = inf;
    }

    public int getSup() {
        return sup;
    }

    public void setSup(int sup) {
        this.sup = sup;
    }

    @Override
    public boolean equals(Object o) {
        
        Descritor d = (Descritor) o;
        String comp = d.getIdent() + Integer.toString(d.nivel);
        String this_ = this.getIdent() + Integer.toString(this.nivel); 
    
        return (this_.compareTo(comp) == 0);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        
        String str = ident + " ";
        str += Integer.toString(nivel) + " ";
        str += Integer.toString(nbytes) + " ";
        str += categoria + " ";
        str += ender + " ";
        str += Integer.toString(valor) + " ";
        str += Integer.toString(npar) + " ";
        str += classetransf + " ";
        str += Integer.toString(inf) + " ";
        str += Integer.toString(sup) + "\n";
        
        return str;
    }
    
    private String ident;
    private int nivel;
    private String categoria;
    private String ender;
    private int nbytes;
    private int valor;
    private int npar;
    private String classetransf;
    private int inf;
    private int sup;
}
