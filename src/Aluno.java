
public class Aluno {

    String nome;
    String email;
    int matricula;

    //construtor aluno:
    Aluno (String nome, String email, int matricula){
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
    }

    //CRIAÇÃO DOS MÉTODOS GETTERS
    public int getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    //CRIAÇÃO DOS MÉTODOS SETTERS
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.email = email;
    }





}//Final class aluno
