package exerciciodesafio;
import dados.*;
public class ExercicioDesafio {
    public static void main(String[] args) {
        try{
        Hd hd[] = new Hd[5];
        for(int i = 0; i < hd.length; i++){
        hd[i] = new Hd();
        hd[i].entradaDados();
        hd[i].imprimir();
        hd[i].gravar();
        hd[i].ler();
        hd[i].apagar();
        }
        }catch(NullPointerException e){
            System.out.println("Erro: "+e.getMessage());
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Erro: "+e.getMessage());
        }
        try{
        Pendrive pen[] = new Pendrive[5];
        for(int i = 0; i < pen.length; i++){
                pen[i] = new Pendrive();
                pen[i].entradaDados();
                pen[i].imprimir();
                pen[i].gravar();
                pen[i].ler();
                pen[i].apagar();
            }
        }
        catch(NullPointerException e){
            System.out.println("Erro: "+e.getMessage());
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}

//Ewerton Gomes de Lucena - 20141104662
//Rosana Baima de Amaro - 
