package Sistema;


import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class APP {
	public static void main(String[]args){		
		Scanner scanner = new Scanner(System.in);
		
		Queue<Paciente>normal = new LinkedList<>();
		Queue<Paciente>leve = new LinkedList<>();
		Queue<Paciente>severo = new LinkedList<>();
		Queue<Paciente>moderado  = new LinkedList<>();
		
		
		
		
		Paciente paciente = new Paciente("fulano", 1234567,0);
        int prioridade = paciente.getNprioridade();
        
        
        if (prioridade == 0) {
            normal.add(paciente);
            System.out.println(normal);
            
        } else if (prioridade == 1) {
            leve.add(paciente);
            System.out.println(leve);
            
        } else if (prioridade == 2) {
            normal.add(paciente);
            System.out.println(normal);
            
        } else {
            severo.add(paciente);
            System.out.println(severo);
        }
    }
}
