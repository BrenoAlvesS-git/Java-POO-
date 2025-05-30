public class Personagem { //classe personagem
    private String nome;
    private String trabalho;
    private String desejos;
    private int idade;
    private float altura;

    Personagem(){ //inicialização do objeto
        this.nome = "";
        this.trabalho = "";
        this.desejos = "";
        this.idade = 0;
        this.altura = 0;
    }
    Personagem(String nome, String trabalho, String desejos, int idade, int altura){
        this.nome = nome;
        this.trabalho = trabalho;
        this.desejos = desejos;
        this.idade = idade;
        this.altura = altura;
    }
    public void correr(){ //Metodo para o objeto
        System.out.println("Corra");
    }
    public void setNome(String nome){ // o 'set' é metodo pra atribuir valores, poderia ser setTrabalho, setAltura e etc 
        this.nome = nome;
    }

    public String getNome(){//Metodos para obter alguma informação de um objeto é usado o 'get', nesse caso getTrabalho etc
        return this.nome;

    }

    public static void main(String[] args) {
        Personagem persona = new Personagem();// criação do personagem
        persona.setNome("Breno"); //atribuindo nome ao personagem
        System.out.println(persona.getNome());

    }
}
