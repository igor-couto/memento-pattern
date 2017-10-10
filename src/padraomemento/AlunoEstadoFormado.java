package padraomemento;

public class AlunoEstadoFormado implements AlunoEstado {
    public String getEstado(){
        return "Formado";
    }
    
    public String matricular(){
        return "Matricula não pode ser realizada";
    }
}
