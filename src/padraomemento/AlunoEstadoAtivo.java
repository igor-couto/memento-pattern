package padraomemento;

public class AlunoEstadoAtivo implements AlunoEstado {
    
    public String getEstado(){
        return "Ativo";
    }
    
    public String matricular(){
        return "Matricula Realizada";
    }
}
