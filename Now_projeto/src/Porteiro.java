
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Porteiro {
    private List<ObservadodaChegadaAniversariante> observador = new ArrayList<>();

    public void registrarObservador(ObservadodaChegadaAniversariante observador){
        observador.add(observador);
    }
    public void monitorar(){
        Scanner entrada = new Scanner(System.in);
        String valor ="";
        while(!"sair".equalsIgnoreCase(valor)){
            System.out.println("Aniversariante chegou");
            valor = entrada.nextLine();
            
            if("sim".equalsIgnoreCase(valor)){
                //criar o evento
                EventoChegadadaAniversariante evento = new EventoChegadadaAniversariante(new Date());
                //notificar observadores
                observador.stream().forEach(o ->o.chegou((ObservadodaChegadaAniversariante) evento));
                //System.out.println(evento.getMomento());
                valor = "sair";
            }else{
                System.out.println("Alarme falso");
            }
        }
        entrada.close();
    }
}
