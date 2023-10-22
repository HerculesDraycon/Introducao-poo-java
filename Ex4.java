/*Algoritmo em POO que possui a classe Produto com atributos de nome, 
preço, e quantidade e foram criados métodos para adicionar produtos no 
estoque, remove-los e para calcular o valor total de cada produto
em estoque.
*/

public class Ex4 {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Macarrao", 4.50, 10);
        Produto p2 = new Produto("Leite condensado", 8.50, 20);
        Produto p3 = new Produto("Peito de frango", 12, 5);
        Produto p4 = new Produto("Leite de coco", 5, 4);

        p2.AddProd(2);
        p4.RemoveProd(2);

        System.out.println(p1.CalcTotal());
        System.out.println(p2.CalcTotal());
        System.out.println(p3);
        System.out.println(p4.CalcTotal());
        
    }

    public static class Produto{

        private String nome;
        private double preco;
        private int qtd;

        public Produto(){}

        public Produto(String nome, double preco, int qtd){
            this.nome = nome;
            this.preco = preco;
            this.qtd = qtd;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public int getQtd() {
            return qtd;
        }

        public void setQtd(int qtd) {
            this.qtd = qtd;
        }

        @Override
        public String toString() {
            return "Produtos [nome=" + nome + ", preco=" + preco + ", qtd=" + qtd + "]";
        }

        public void AddProd(int qtd){
            this.qtd += qtd;
        }

        public void RemoveProd(int qtd){
            this.qtd -= qtd;
        }

        public double CalcTotal(){
            return qtd*preco;
        }

    }
}
