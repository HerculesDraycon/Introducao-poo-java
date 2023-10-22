/*Algoritmo em POO que possui a classe Triangulo com atributos de base e
altura e foi criado um método que calcula a área e retorna o resultado.
*/

public class Ex5 {
    public static void main(String[] args) {
        
        Triangulo t1 = new Triangulo(7, 10);
        Triangulo t2 = new Triangulo(5, 4);
        Triangulo t3 = new Triangulo(22, 22);

        System.out.println(t1.CalcArea());
        System.out.println(t2.CalcArea());
        System.out.println(t3.CalcArea());

    }

    public static class Triangulo{

        private double base, alt;

        public Triangulo(){}

        public Triangulo(double base, double alt){
            this.base = base;
            this.alt = alt;
        }

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getAlt() {
            return alt;
        }

        public void setAlt(double alt) {
            this.alt = alt;
        }

        @Override
        public String toString() {
            return "Triangulo [base=" + base + ", alt=" + alt + "]";
        }

        public double CalcArea(){
            return (base*alt)/2;
        }

    }
}
