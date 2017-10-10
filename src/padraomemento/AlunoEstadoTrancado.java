package padraomemento;

public class AlunoEstadoTrancado implements AlunoEstado {
    
    public String getEstado(){
        return "Trancado";
    }
    
    public String matricular(){
        return "Matricula não pode ser realizada";
    }
    
}
