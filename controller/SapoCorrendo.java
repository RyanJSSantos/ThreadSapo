package controller;

 

public class SapoCorrendo  extends Thread {
    
    private String nome;
    private int distanciaCorrida = 0; 
    private int distanciaTotalCorrida; 
    private int pulo = 0; 
    private int pulos = 0; 
    private static int colocacao = 0; 
    private final static int pulo_maximo = 25; 
    
    
    public SapoCorrendo(String nome, int distanciaTotalCorrida) {
         
        super(nome);
        this.distanciaTotalCorrida = distanciaTotalCorrida;
        this.nome = nome;
    }
    
    public void sapoImprimindoSituacao() {
         System.out.println("O "+ nome + " pulou " + pulo + " e ja percorreu " + distanciaCorrida + " m" );
    } 
     
    public void sapoPulando() {
        pulos++;
        pulo = (int) (Math.random() *pulo_maximo);
        distanciaCorrida += pulo;
        if(distanciaCorrida > distanciaTotalCorrida) {
            distanciaCorrida = distanciaTotalCorrida;
        }
    }

 

    public void sapoDescansando() { 
        yield();
    }
    
    public void colocacaoSapo() {
        colocacao++;
        System.out.println("\n" + nome + " foi o " + colocacao + " colocado com " + pulos + " pulos");
    }
    
    public void run() {
        while (distanciaCorrida < distanciaTotalCorrida) {
        sapoPulando();
        sapoImprimindoSituacao();
        sapoDescansando();
        
        try {
            sleep(200);
            }catch (InterruptedException e) {}
        try {
            sleep(2000);
        }catch (InterruptedException e) {}
        }    
        colocacaoSapo();
    }
}