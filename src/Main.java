import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circulo circulo = new Circulo();

        System.out.println("  _____            _                       _                                _                      _           ______                        _        \n" +
                " / ___ \\          (_)                     | |                              (_)                    | |         |  ___ \\                      (_)       \n" +
                "| |   | |    ____  _   ____   ____  _   _ | |  ___     ____    ____   ____  _   ____   ___      _ | |  ____   | | _ | |  ____   ____  ____   _   ____ \n" +
                "| |   | |   / ___)| | / ___) / ___)| | | || | / _ \\   |    \\  / _  | / _  || | / ___) / _ \\    / || | / _  )  | || || | / _  | / ___)|    \\ | | / _  |\n" +
                "| |___| |  ( (___ | || |    ( (___ | |_| || || |_| |  | | | |( ( | |( ( | || |( (___ | |_| |  ( (_| |( (/ /   | || || |( ( | || |    | | | || |( ( | |\n" +
                " \\_____/    \\____)|_||_|     \\____) \\____||_| \\___/   |_|_|_| \\_||_| \\_|| ||_| \\____) \\___/    \\____| \\____)  |_||_||_| \\_||_||_|    |_|_|_||_| \\_||_|\n" +
                "                                                                    (_____|                                                                           ");


        System.out.print("\n\nInforme quantas pessoas participaram: ");
        int qtdPessoas = in.nextInt();

        for(int i=0; i<qtdPessoas; i++){
            Integer elemento = i;
            circulo.adicionar(elemento);
            System.out.println("\n"+circulo.toString());

        }

    }
}
