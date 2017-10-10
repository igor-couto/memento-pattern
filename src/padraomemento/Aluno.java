package padraomemento;

public class Aluno {
    private String nome;
    private AlunoEstado estado;
    
    // CONSTRUTOR
    
    public Aluno(AlunoEstado estado){
        this.estado = estado;
    }

    Aluno() {

    }
    
    // METODOS
    
    public String matricular(){
        return estado.matricular();
    }
    
    public AlunoMemento saveToMemento(){
        return new AlunoMemento(estado);
    }
    
    public void restoreFromMemento(AlunoMemento memento){
        estado = memento.getEstadoSalvo();
    }
    
    // GETS E SETS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AlunoEstado getEstado() {
        return estado;
    }

    public void setEstado(AlunoEstado estado) {
        this.estado = estado;
    }

    public String getNomeEstado() {
        return this.estado.toString();
    }
    
}
