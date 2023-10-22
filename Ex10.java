/*Algoritmo em POO que possui a classe EqSegunGrau com atributos de
coeficiente de segundo grau, coeficiente de primeiro grau e termo
independente, foi criado um método que calcula as raízes e retorna o resultado.*/

import java.lang.Math;
public class Ex10{
    public static void main(String[] args) {
        
        EqSegunGrau eq1 = new EqSegunGrau(3.0, 0, -27.0); //com termo de primeiro grau = 0
        EqSegunGrau eq2 = new EqSegunGrau(5.0, -45.0, 0); //com termo independente = 0
        EqSegunGrau eq3 = new EqSegunGrau(1.0, -1.0, -12.0); //com todos os termos ≠ 0
        
        eq1.CalcRaiz();
        eq2.CalcRaiz();
        eq3.CalcRaiz();
    }

    public static class EqSegunGrau{

        private double x2, x, in;

        public EqSegunGrau(){}
        public EqSegunGrau(double x2, double x, double in){
            this.x2 = x2;
            this.x = x;
            this.in = in;
        }
        public double getX2() {
            return x2;
        }
        public void setX2(double x2) {
            this.x2 = x2;
        }
        public double getX() {
            return x;
        }
        public void setX(double x) {
            this.x = x;
        }
        public double getIn() {
            return in;
        }
        public void setIn(double in) {
            this.in = in;
        }
        @Override
        public String toString() {
            return "EqSegunGrau [x2=" + x2 + ", x=" + x + ", in=" + in + "]";
        }

        public void CalcRaiz(){

            double delta = (x*x) - (4*x2*in);

            double xi = ((-1*x) + Math.sqrt(delta))/(2*x2);
            double xii = ((-1*x) - Math.sqrt(delta))/(2*x2);

            System.out.println("x' = " + xi);
            System.out.println("x'' = "+ xii);
        }

    }
}