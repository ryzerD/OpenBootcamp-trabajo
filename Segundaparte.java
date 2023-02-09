import javax.sound.midi.VoiceStatus;

class primeraparte{
    public static void main(String[] args) {
        carro carro=new carro();
        System.out.println(carro.puertas);
        carro.aumentar();
        System.out.println(carro.puertas);
    }
    
 
    }
    class carro{
    int puertas=4;
    public void aumentar(){
        this.puertas++;
    }

    }