/*Algoritmo em POO que possui a classe Alunoo com atributos de nota1,nota2 
e nota3, foi criado um método que calcula a média e retorna o resultado.*/

public class Ex6 {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno(7.5, 10.0, 8.8);
        Aluno a2 = new Aluno(6.0, 5.5, 8.8);
        Aluno a3 = new Aluno(9.0, 7.0, 9.0);

        System.out.println(a1.CalcNota());
        System.out.println(a2.CalcNota());
        System.out.println(a3.CalcNota());

    }

    public static class Aluno{

        private double nota1, nota2, nota3;

        public Aluno(){}
        public Aluno(double nota1, double nota2, double nota3){
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }

        public double getNota1() {
            return nota1;
        }
        public void setNota1(double nota1) {
            this.nota1 = nota1;
        }
        public double getNota2() {
            return nota2;
        }
        public void setNota2(double nota2) {
            this.nota2 = nota2;
        }
        public double getNota3() {
            return nota3;
        }
        public void setNota3(double nota3) {
            this.nota3 = nota3;
        }
        @Override
        public String toString() {
            return "Aluno [nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + "]";
        }
        
        public double CalcNota(){
            return (nota1+nota2+nota3)/3;
        }

    }

}
