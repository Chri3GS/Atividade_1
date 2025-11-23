private class Disciplina {
    private String codigo;
    private String titulo;
    private int capacidadeMaxima, List<Aluno>;

    //CRIAÇÃO DOS MÉTODOS SETTERS
    public void setcodigo (String codigo){
        this.codigo = codigo;
    }
    public void settitulo (String titulo){
        this.titulo = titulo;
    }
    public void setcapacidadeMaxima (int capacidaMaxima){
        this.capacidadeMaxima = capacidadeMaxima;
    }

    //CRIAÇÃO DOS MÉTODOS GETTERS
    String getcodigo (){
        return codigo;
    }
    String gettitulo (){
        return titulo;
    }
    String getcapacidadeMaxima (){
         return capacidadeMaxima;
    }
    // FIM DOS MÉTODOS GETTERS E SETTERS

    boolean isLotada(){

    }
    List<Aluno>getAlunos(){

    }
    construtor(String codigo, String titulo,int capacidade){

    }

}