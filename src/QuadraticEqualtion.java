public class QuadraticEqualtion {
    public int a,b,c, delta;
    public QuadraticEqualtion(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        this.delta = this.b * this.b - 4 * this.a * this.c;
        return this.delta;
    }

    public double getRoot1(){
        return (- this.b + Math.sqrt(this.delta)) / (2 * this.a);
    }

    public double getRoot2(){
        return (- this.b - Math.sqrt(this.delta)) / (2 * this.a);
    }

    public double getSameRoot(){
        return -this.c / this.b;
    }

    public double getSameRoot2(){
        return -this.b / (2 * this.a);
    }

}
