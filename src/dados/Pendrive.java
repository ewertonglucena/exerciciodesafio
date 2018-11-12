
package dados;
import java.util.Scanner;
public class Pendrive extends Drive {
    private double peso;
    private double velocidadeGravacao;
    private double velocidadeLeitura;
    
    public Pendrive(){super.setInfo("Pendrive");}
    
    public Pendrive(String marca, double preco, int capacidade){
        super(marca, preco, capacidade);
        super.setInfo("Pendrive");
    }
    
    public Pendrive(String marca, double preco, int capacidade, double peso
            , double velocidadeGravacao, double velocidadeLeitura){
        super(marca, preco, capacidade);
        setPeso(peso);
        setVelocidadeGravacao(velocidadeGravacao);
        setVelocidadeLeitura(velocidadeLeitura);
        super.setInfo("Pendrive");
    }
    
    public Pendrive(String marca, double peso
        , double velocidadeGravacao, double velocidadeLeitura){
        super(marca);
        setPeso(peso);
        setVelocidadeGravacao(velocidadeGravacao);
        setVelocidadeLeitura(velocidadeLeitura);
        super.setInfo("Pendrive");
    }
    
    public Pendrive(double preco, int capacidade, double peso
        , double velocidadeGravacao, double velocidadeLeitura){
        super(preco, capacidade);
        setPeso(peso);
        setVelocidadeGravacao(velocidadeGravacao);
        setVelocidadeLeitura(velocidadeLeitura);
        super.setInfo("Pendrive");
    }
    
    public Pendrive(String marca, int capacidade, double peso
            , double velocidadeGravacao, double velocidadeLeitura){
        super(marca, capacidade);
        setPeso(peso);
        setVelocidadeGravacao(velocidadeGravacao);
        setVelocidadeLeitura(velocidadeLeitura);
        super.setInfo("Pendrive");
    }
    
    public Pendrive(double peso, double velocidadeGravacao, double velocidadeLeitura){
        setPeso(peso);
        setVelocidadeGravacao(velocidadeGravacao);
        setVelocidadeLeitura(velocidadeLeitura);
        super.setInfo("Pendrive");
    }
    
    public Pendrive(double preco, double peso, double velocidadeGravacao, double velocidadeLeitura){
        super(preco);
        setPeso(peso);
        setVelocidadeGravacao(velocidadeGravacao);
        setVelocidadeLeitura(velocidadeLeitura);
        super.setInfo("Pendrive");
    }
    
    public Pendrive(int capacidade, double peso, double velocidadeGravacao, double velocidadeLeitura){
        super(capacidade);
        setPeso(peso);
        setVelocidadeGravacao(velocidadeGravacao);
        setVelocidadeLeitura(velocidadeLeitura);
        super.setInfo("Pendrive");
    }
    
    public Pendrive(String marca, double preco, int capacidade, double velocidadeGravacao
            , double velocidadeLeitura){
        super(marca, preco, capacidade);
        setVelocidadeGravacao(velocidadeGravacao);
        setVelocidadeLeitura(velocidadeLeitura);
        super.setInfo("Pendrive");
    }

    public double getVelocidadeGravacao() {
        return velocidadeGravacao;
    }

    public void setVelocidadeGravacao(double velocidadeGravacao) {
        if(velocidadeGravacao <= 0){
            throw new IllegalArgumentException("Não são permitidos valores negativos ou zero.");
        }
        this.velocidadeGravacao = velocidadeGravacao;
    }

    public double getVelocidadeLeitura() {
        return velocidadeLeitura;
    }

    public void setVelocidadeLeitura(double velocidadeLeitura) {
        if(velocidadeLeitura <= 0){
            throw new IllegalArgumentException("Não são permitidos valores negativos ou zero.");
        }
        this.velocidadeLeitura = velocidadeLeitura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso <= 0){
            throw new IllegalArgumentException("Não são permitidos valores negativos ou zero.");
        }
        this.peso = peso;
    }
    
    public void cadastrar(String marca, double preco, int capacidade, double peso,
            double velocidadeGravacao, double velocidadeLeitura){
        super.cadastrar(marca, preco, capacidade);
        setPeso(peso);
        setVelocidadeGravacao(velocidadeGravacao);
        setVelocidadeLeitura(velocidadeLeitura);
        super.setInfo("Pendrive");
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Peso: "+getPeso()+" gramas");
        System.out.println("Interface: "+ENTRADAPENDRIVE);
        System.out.println("Velocidade de Gravação: "+getVelocidadeGravacao() + " MBps");
        System.out.println("Velocidade de Leitura: "+getVelocidadeLeitura()+  " MBps");
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        boolean loop = true;
        do{
            try{
                System.out.print("Digite o Peso: ");
                setPeso(Double.parseDouble(sc.nextLine()));
                loop = false;
            }catch(NumberFormatException e){
                System.out.println("Erro: "+e.getMessage());
                System.out.println(msgErro);
            }catch(IllegalArgumentException e){
                System.out.println("Erro: "+e.getMessage());
                System.out.println(msgErro);
            }
        }while(loop);
        loop = true;
        do{
            try{
                System.out.print("Digite a Velocidade de Gravação: ");
                setVelocidadeGravacao(Double.parseDouble(sc.nextLine()));
                loop = false;
            }catch(NumberFormatException e){
                System.out.println("Erro: "+e.getMessage());
                System.out.println(msgErro);
            }catch(IllegalArgumentException e){
                System.out.println("Erro: "+e.getMessage());
                System.out.println(msgErro);
            }
        }while(loop);
        loop = true;
        do{
            try{
                System.out.print("Digite a Velocidade de Leitura: ");
                setVelocidadeLeitura(Double.parseDouble(sc.nextLine()));
                loop = false;
            }catch(NumberFormatException e){
                System.out.println("Erro: "+e.getMessage());
                System.out.println(msgErro);
            }catch(IllegalArgumentException e){
                System.out.println("Erro: "+e.getMessage());
                System.out.println(msgErro);
            }
        }while(loop);
    }
}
