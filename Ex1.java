/*Algoritmo em POO que possui a classe Pessoa com atributos de nome e idade
e foram criados métodos de adicionar um ano e mudar o nome.
*/

public class Ex1{
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(15, "Bernardo Abreu");
        Pessoa p2 = new Pessoa(42, "Sonia Alencar");

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("-----------------------");

        p1.MaisUmAno();
        p2.MudarNome("Sonia Souza");

        System.out.println(p1);
        System.out.println(p2);

    }

    public static class Pessoa{

        private int idade;
        private String nome;

        public Pessoa(){}

        public Pessoa(int idade, String nome){
            this.idade = idade;
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public String getNome() {
            return nome;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        @Override
        public String toString() {
            return "Pessoa [idade=" + idade + ", nome=" + nome + "]";
        }

        public void MaisUmAno(){
            this.idade += 1;
        }

        public  void MudarNome(String nome){
            this.nome = nome;
        }

    }
    
}