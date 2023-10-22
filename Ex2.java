/*Algoritmo em POO que possui a classe Livro com atributos de título, 
autor e número de páginas e foram criados métodos de mudar título, mudar 
autor e adicionar página.
*/

public class Ex2 {
    
    public static void main(String[] args) {
        
        Livro l1 = new Livro("Voo Noturno", "Antoine de Saint-Exupéry", 200);
        Livro l2 = new Livro("Depois", "Stephen King", 320);
        Livro l3 = new Livro("Terra dos Homens", "Antoine de Saint-Exupéry", 180);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        l1.ChangeAutor("Antoine de Saint");
        l2.ChangeTitle("After");
        l3.AddOnePage();

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

    }

    public static class Livro{

        private String titulo, autor;
        private int n_paginas;

        public Livro(){}

        public Livro(String titulo, String autor, int n_paginas){
            this.titulo = titulo;
            this.autor = autor;
            this.n_paginas = n_paginas;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public int getN_paginas() {
            return n_paginas;
        }

        public void setN_paginas(int n_paginas) {
            this.n_paginas = n_paginas;
        }

        @Override
        public String toString() {
            return "Livro [titulo=" + titulo + ", autor=" + autor + ", n_paginas=" + n_paginas + "]";
        }

        public void ChangeTitle(String titulo){
            this.titulo = titulo;
        }

        public void ChangeAutor(String autor){
            this.autor = autor;
        }

        public void AddOnePage(){
            this.n_paginas += 1;
        }

    }

}
