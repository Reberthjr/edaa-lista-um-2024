package Lista3.Atividade1;
import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<>();
        String[] nomes = { "Isadora Rodrigues", "Arthur Maestri", "Augusto Fabio", 
                            "Breno Vinicius", "Vinícius Raphael",
                            "César Augusto", "Daniela Teixeira", "Eduardo Jose", "Emerson Vinicios", 
                            "Felipe dos Santos",
                            "Gabriel Felipe", "Pedro Castro", "Pedro Rodrigues", "Gabriel Silva", 
                            "Henrique Cezar",
                            "Isadora Ribeiro", "João Reberth", "Lucas Alves", "Lucas Ferreira", 
                            "Marcus Paulo",
                            "Maria Clara", "André Luiz", "Diogo Freitas", "Matheus Felipe", "Nátali Isaltino",
                            "Paulo Vítor", "Rogério Lopes", "Thiago Luis", "Víctor Henrique", 
                            "Vinicius Garcia",
                            "Vinícius Paiva", "Wesley Carvalho", "Weslley Ferreira", "Caio Alves", 
                            "Lucas Marques",
                            "Marcela Maria" };
        
            Random random = new Random();
            for (String nome : nomes) {
                int idade = random.nextInt(18,55);
                listaPessoas.add(new Pessoa(nome, idade));
            }          

        Collections.sort(listaPessoas, (pessoa, outraPessoa) -> pessoa.getNome().compareToIgnoreCase(outraPessoa.getNome()));
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa);
        }
        
    }
    // Bubble Sort
    public static void Atividade3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra qualquer: ");
        String palavra = scanner.nextLine();

        char[] letras = palavra.toCharArray();
        for(int i = 0; i < letras.length - 1; i++){
            for(int j = 0; j < letras.length - 1 - i; j++){
                if(letras[j] > letras[j + 1]){
                    char temp = letras[j];
                    letras[j] = letras[j + 1];
                    letras[j + 1] = temp;
                }
            }
        }

        System.out.println("Palavra ordenada: " + new String(letras));
    }


    //Selection Sort
    public static void Atividade4() {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<String>();

        boolean digitarNomes = true;
        while (digitarNomes){
            System.out.println("Digite um nome:");
            String nome = scanner.nextLine();
            nomes.add(nome);

            System.out.println("Deseja adicionar mais nomes? (s/n)");
            String escolha = scanner.nextLine();

            if(escolha.equals("n")){
                digitarNomes = false;
            }
        }

        int menorIndex;
        String aux;
        for(int i = 0; i < nomes.size() - 1; i++){
            menorIndex = i;
            for (int j = i + 1; j < nomes.size(); j++){
                if(nomes.get(j).length() < nomes.get(menorIndex).length()){
                    menorIndex = j;
                }
            }
            aux = nomes.get(menorIndex);
            nomes.set(menorIndex, nomes.get(i));
            nomes.set(i, aux);
        }

        nomes.forEach(item -> System.out.println(item));
    }

    // Quick Sort
    public static void Atividade5() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String word = scanner.nextLine();


        char[] array = word.toCharArray();
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(char[] array, int startIndex, int endIndex) {

        char pivot = array[startIndex];
        int left = startIndex;
        int right = endIndex;

        while (left <= right){
            while (array[left] < pivot){
                left++;
            }

            while (array[right] > pivot){
                right--;
            }

            if(left <= right){
                char temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                left++;
                right--;
            }

        }

        if(startIndex < right){
            quickSort(array, startIndex, right);
        }

        if(left < endIndex){
            quickSort(array, left, endIndex);
        }

    }
}