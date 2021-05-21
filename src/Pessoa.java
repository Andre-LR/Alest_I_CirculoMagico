public class Pessoa {
    // Classe interna Node(Pessoa)

    public Integer elemento;
    public Pessoa next;
    public Pessoa prev;

    public Pessoa(Integer elemento) {
        this.elemento = elemento;
        next = null;
        prev = null;
    }

    public Pessoa(Integer elemento, Pessoa next) {
        this.elemento = elemento;
        this.next = next;
    }

    public Integer getElemento() {
        return elemento;
    }

    public Pessoa getNext() {
        return next;
    }

    public void setNext(Pessoa next) {
        this.next = next;
    }

    public Pessoa getPrev() {
        return prev;
    }

    public void setPrev(Pessoa prev) {
        this.prev = prev;
    }

    public void setElemento(Integer elemento) {
        this.elemento = elemento;
    }
}
