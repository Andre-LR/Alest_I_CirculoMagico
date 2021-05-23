import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circulo circulo = new Circulo();
        boolean continua = true;
        int escolha;
        System.out.println("  _____            _                       _                                _                      _           ______                        _        \n" +
                " / ___ \\          (_)                     | |                              (_)                    | |         |  ___ \\                      (_)       \n" +
                "| |   | |    ____  _   ____   ____  _   _ | |  ___     ____    ____   ____  _   ____   ___      _ | |  ____   | | _ | |  ____   ____  ____   _   ____ \n" +
                "| |   | |   / ___)| | / ___) / ___)| | | || | / _ \\   |    \\  / _  | / _  || | / ___) / _ \\    / || | / _  )  | || || | / _  | / ___)|    \\ | | / _  |\n" +
                "| |___| |  ( (___ | || |    ( (___ | |_| || || |_| |  | | | |( ( | |( ( | || |( (___ | |_| |  ( (_| |( (/ /   | || || |( ( | || |    | | | || |( ( | |\n" +
                " \\_____/    \\____)|_||_|     \\____) \\____||_| \\___/   |_|_|_| \\_||_| \\_|| ||_| \\____) \\___/    \\____| \\____)  |_||_||_| \\_||_||_|    |_|_|_||_| \\_||_|\n" +
                "                                                                    (_____|                                                                           ");
        
        System.out.print("\n\nTotal de pessoas participantes: ");
        int qtdPessoas = in.nextInt();
        while(qtdPessoas <=0){        
            System.out.print("\n\nQuantidade não pode ser 0 ou negativo, informe uma opção válida ");
            qtdPessoas = in.nextInt();
        }
            
            for(int i=0; i<qtdPessoas; i++){
               Integer elemento = i;
                    circulo.adicionar(elemento);
                    System.out.println("\n"+circulo.toString());    
            }

        while(continua){                   
            System.out.print("\n\nEscolha a opção Desejada: ");
            System.out.print("\n\n1)Continuar: ");
            System.out.print("\n0)Sair: ");
            System.out.println("");
            escolha=in.nextInt();
            switch(escolha){
                case 1:
                System.out.print("\n\n1)Total de pessoas participantes: ");
                qtdPessoas = in.nextInt();

                while(qtdPessoas <=0){        
                    System.out.print("\n\nQuantidade não pode ser 0 ou negativo, informe uma opção válida ");
                    qtdPessoas = in.nextInt();
                }
                //O(n) 
                for(int i=0; i<qtdPessoas; i++){
                    Integer elemento = i;
                    circulo.adicionar(elemento);
                    System.out.println("\n"+circulo.toString());
        
                }
                break;
            
                case 0:
                continua = false;       
            }
        }   

    }
}
