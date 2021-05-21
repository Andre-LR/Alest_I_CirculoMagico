public class Circulo {
    // Referencia para a posicao corrente da lista encadeada
    private Pessoa active;
    //Rei é o primeiro da lista sempre
    private Pessoa rei;
    // Contador do numero de elementos da lista.
    private int count;

    public Circulo() {
        active = new Pessoa(null);
        count = 0;
    }

    public Integer somaActive(){
        // Soma os elementos next+prev do active, o resultado será a posicao do proximo active
        Integer soma = active.next.getElemento() + active.prev.getElemento();

        return soma;
    }

    //Add elemento no final, ou no inicio caso seja o primeiro
    //O(1)
    public void adicionaFinal(Integer elemento){
        // Primeiro cria o nodo
        Pessoa n = new Pessoa(elemento);

        //Se a lista estiver vazia, adiciona o primeiro nodo(n)
        if(count==0){
            n.next = n;
            n.prev = n;
            rei = n;

        }else{
            //Se não estiver vazia, adiciona no final
            //Encontra o ultimo nodo(n)
            Pessoa ultimo = rei.prev;

            //linka o novo nodo(n) ao rei
            n.next = rei;
            //linka o rei ao novo nodo(n)
            rei.prev = n;

            //linka o novo nodo(n) ao ex-ultimo nodo(ultimo)
            n.prev = ultimo;

            //linka o ex-ultimo nodo(ultimo) ao novo nodo(n)
            ultimo.next = n;

        }

        //Atualiza o active
        active = n;

        //acrescenta contador
        count++;
    }

    //Insere o novo elemento após o elementoBase
    //O(n)
    public void adicionaMeio(Integer elemento, Integer elementoBase){
        // Primeiro cria o nodo
        Pessoa n = new Pessoa(elemento);

        //Encontrar o nodo que contem elementoBase na lista percorrendo a lista
            //começa conferindo o elemento do rei que é a primeira posição da lista
        Pessoa posicao = rei;

            //percorre as posições até achar o nodo que tem o elementoBase
        while(posicao.getElemento() != elementoBase){
            posicao = posicao.next;
        }

        //Após achar o nodo que tem o elementoBase...
        //...Cria um nodo que correspondente ao nodo seguinte do elementoBase
        Pessoa nodoNext = posicao.next;

        //coloca o novo nodo(n) a ser inserido entre o "posicao" e "nodoNext"
        posicao.next = n;
        n.prev = posicao;
        n.next = nodoNext;
        nodoNext.prev = n;

        //Atualiza o active
        active = n;

        //Atualiza o count
        count++;
    }

    //O(n)
    public void adicionar(Integer elemento){
        //Se estiver vazia, adicionar o primeiro elemento
        if(count <=2 ){
            adicionaFinal(elemento);
            return;
        }

        //Verificar a posição do active e adicionar o novo elemento após ele

            //Número de nodos que irá percorrer
        Integer soma = somaActive();

            //Percorre os nodos, e o último se torna o novo active
        for(int i=0; i<soma; i++){
            active = active.next;
        }

            //Se o active for o último da lista, add no final
        if(active.next.getElemento().equals(rei.getElemento())){
            adicionaFinal(elemento);
            return;
        }

            //Se não for, adiciona no meio, fazendo a procura da posição através do elemento do active
        Integer elementoBase = active.getElemento();

        //O elemento será adicionado após o novo active
        adicionaMeio(elemento, elementoBase);

        return;
    }


    //Retorna os vizinhos do rei
    public String vizinhosRei(){
        Integer vizinhoDireita = rei.next.getElemento();
        Integer vizinhoEsquerda = rei.prev.getElemento();

        String txt = "Direita do Rei: " + vizinhoDireita + "\nEsquerda do Rei: " + vizinhoEsquerda;

        return txt;
    }

    public String toString() {
        String txt = "";

        Pessoa aux = rei;

        for(int i=0; i<count; i++){
            if(aux.equals(active)){
                txt = txt + "[" + aux.elemento.toString() + "]";

            }else{
                txt = txt + aux.elemento.toString();
            }



            txt = txt + " ";
            aux = aux.next;
        }
        System.out.println(txt);
        System.out.println(vizinhosRei());
        System.out.println("Soma: "+somaActive());
        return "";
    }
}
