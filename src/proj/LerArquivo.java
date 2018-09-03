package proj;

import java.util.Scanner;

public class LerArquivo {
    public static void main(String[] args) {
        MyTxtFile txt = new MyTxtFile();
        MyHTMLFile ht = new MyHTMLFile();
        //MyPDFFile pd = neww MyPDFFile();
        System.out.println("Informe o tipo de arquivo que você deseja importar: \n 1- Arquivo com extensão txt;\n 2- Arquivo com extensão html;\n 3- Arquivo com extensão PDF;");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        if(opcao==1){
            System.out.println("Informe o endereço do arquivo com extensão 'txt'");
            txt.converter();
        }
        else if(opcao==2){
            ht.converter();
        }
        else if(opcao==3){
            //pd.converter();
        }
        else{
            System.out.println("Opção inválida. Reinicie o programa!");
        }
    }
    
}
