package padraomemento;

import java.util.ArrayList;
import java.util.Iterator;

public class PadraoMemento {

    public static void main(String[] args) {
        ArrayList<AlunoMemento> estadoSalvos = new ArrayList();
        
        Aluno aluno = new Aluno();
        aluno.setNome("Igor");
        
        aluno.setEstado(new AlunoEstadoTrancado());
        estadoSalvos.add(aluno.saveToMemento());
        
        aluno.setEstado(new AlunoEstadoAtivo());
        estadoSalvos.add(aluno.saveToMemento());
        
        aluno.setEstado(new AlunoEstadoFormado());
        estadoSalvos.add(aluno.saveToMemento());
        
        for ( Iterator i = estadoSalvos.iterator(); i.hasNext();  ){
            System.out.println(i.next());
        }
        
        aluno.restoreFromMemento(estadoSalvos.get(1));
        System.out.println(aluno.getNomeEstado());
        
    }
    
}
