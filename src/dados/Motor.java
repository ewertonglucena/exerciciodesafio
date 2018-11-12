package dados;
import static dados.Drive.msgErro;
import java.util.Scanner;
/**
 *
 * @author ewerton.lucena
 */
public class Motor {
    private String modelo;
    private int rpm;
    private double voltagem;
    
    public Motor(){}
    
    public Motor(String modelo, int rpm, double voltagem){
        setModelo(modelo);
        setRpm(rpm);
        setVoltagem(voltagem);
    }
    
    public Motor(String modelo){
        setModelo(modelo);
    }
    
    public Motor(String modelo, int rpm){
        setModelo(modelo);
        setRpm(rpm);
    }
    
    public Motor(int rpm, double voltagem){
        setRpm(rpm);
        setVoltagem(voltagem);
    }
    
    public Motor(int rpm){
        setRpm(rpm);
    }
    
    public Motor(String modelo, double voltagem){
        setModelo(modelo);
        setVoltagem(voltagem);
    }

    public Motor(double voltagem){
        setVoltagem(voltagem);
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if("".equals(modelo)){
            throw new IllegalArgumentException("Não insira campos vazios.");   
        }
        if(" ".equals(modelo)){
            throw new IllegalArgumentException("Não insira espaços vazios");
        }if(modelo == null){
            throw new IllegalArgumentException("Não são permitidos valores nulos");
        } 
        this.modelo = modelo;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        if(rpm <=0){
            throw new IllegalArgumentException("Não são permitidos valores negativos ou zero.");
        }
        this.rpm = rpm;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        if(voltagem <=0){
            throw new IllegalArgumentException("Não são permitidos valores negativos ou zero.");
        }
        this.voltagem = voltagem;
    }
    
    public void imprimir(){
        System.out.println("Dados Motor:");
        System.out.println("Modelo: "+getModelo());
        System.out.println("Rpm: "+getRpm());
        System.out.println("Voltagem: "+getVoltagem());
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
                boolean loop = true;
                do{
                    try{
                       System.out.println("Digite o modelo: "); 
                       setModelo(sc.nextLine());
                       loop = false;
                    }catch(NumberFormatException e){
                        System.out.println("Erro : "+e.getMessage());
                        System.out.println(msgErro);
                    }catch(IllegalArgumentException e){
                        System.out.println("Erro :"+e.getMessage());
                        System.out.println(msgErro);
                    }
                }while(loop);
                loop = true;
        do{
                    try{
        System.out.println("Digite a Rpm: ");
        setRpm(Integer.parseInt(sc.nextLine()));
        loop = false;
                    }catch(NumberFormatException e){
                        System.out.println("Erro : "+e.getMessage());
                        System.out.println(msgErro);
                    }catch(IllegalArgumentException e){
                        System.out.println("Erro :"+e.getMessage());
                        System.out.println(msgErro);
                    }
                }while(loop);
                loop = true;
                
                do{
                    try{
        System.out.println("Digite a Voltagem: ");
        setVoltagem(Double.parseDouble(sc.nextLine()));
        loop = false;
                    }catch(NumberFormatException e){
                        System.out.println("Erro : "+e.getMessage());
                        System.out.println(msgErro);
                    }catch(IllegalArgumentException e){
                        System.out.println("Erro :"+e.getMessage());
                        System.out.println(msgErro);
                    }
                }while(loop);
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
    }
    
    public void cadastrar(String m, int r, double v){
        setModelo(m);
        setRpm(r);
        setVoltagem(v);
    }
}
