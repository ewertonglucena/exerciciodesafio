package dados;
import java.util.Scanner;
public class Hd extends Drive{
    private int quantidadeSetores;
    
    Motor motor1 = new Motor();
    
    public Hd(){
        super.setInfo("HD");
    }
    
    public Hd(String marca, double preco, int capacidade){
        super(marca, preco, capacidade);
        super.setInfo("HD");
    }
    
    public Hd(String marca){
        super(marca);
        super.setInfo("HD");
    }
    
    public Hd(String marca, double preco){
        super(marca, preco);
        super.setInfo("HD");
    }
    
    public Hd(String marca, int capacidade){
        super(marca, capacidade);
        super.setInfo("HD");
    }
    
    public Hd(double preco){
        super(preco);
        super.setInfo("HD");
    }
    
    public Hd(int capacidade){
        super(capacidade);
        super.setInfo("HD");
    }
    
    public Hd(String marca, double preco, int capacidade, int quantidadeSetores){
        super(marca, preco, capacidade);
        setQuantidadeSetores(quantidadeSetores);
        super.setInfo("HD");
    }
    
    public Hd(String marca, double preco, int capacidade, Motor motor1, int quantidadeSetores){
        super(marca, preco, capacidade);        
        setMotor1(motor1);
        setQuantidadeSetores(quantidadeSetores);
        super.setInfo("HD");
    }
    
    public Hd(Motor motor1, int quantidadeSetores){      
        setMotor1(motor1);
        setQuantidadeSetores(quantidadeSetores);
        super.setInfo("HD");
    }

    public Hd(double preco, int quantidadeSetores){
        super(preco);
        setQuantidadeSetores(quantidadeSetores);
        super.setInfo("HD");
    }

    public int getQuantidadeSetores() {
        return quantidadeSetores;
    }

    public void setQuantidadeSetores(int quantidadeSetores) {
        if(quantidadeSetores <= 0){
            throw new IllegalArgumentException("Não são válidos números negativos ou zero.");
        }
        this.quantidadeSetores = quantidadeSetores;
    }

    public Motor getMotor1() {
        return motor1;
    }

    public void setMotor1(Motor motor1) {
        this.motor1 = motor1;
    }
    
    public void cadastrar(String marca, double preco, int capacidade, Motor motor1, int quantidadeSetores){
        super.cadastrar(marca, preco, capacidade);
        setMotor1(motor1);
        setQuantidadeSetores(quantidadeSetores);
        super.setInfo("Hd");
    }
    
    public void imprimir(){
        super.imprimir();
        motor1.imprimir();
        System.out.println("Interface: " + ENTRADAHD);
        System.out.println("Quantidade Setores: "+getQuantidadeSetores());
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        motor1.entradaDados();
        boolean loop = true;
        do{
            try{
                System.out.print("Digite a quantidade de setores: ");
                setQuantidadeSetores(Integer.parseInt(sc.nextLine()));
                loop = false;
            }catch(IllegalArgumentException e){
                System.out.println("Erro: "+e.getMessage());
                System.out.println(msgErro);
            }
        }while(loop);

    }
    
}

