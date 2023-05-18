package ball;
import java.awt.Color;
public class Ball {

        private double weight;
        private Color color;
        private boolean exits;

        public Ball(double weight, Color color) {

            this.weight=weight;
            this.color = color;
            this.exits = true;
        }
        public Ball(boolean exists){
            this.exits = exists;
        }
    public void Kill(){
        this.exits = false;
    }
            public Ball collideWith(Ball ball) {
               if(this.exits && ball.exits) {

                    int r = (this.color.getRed() + ball.color.getRed()) / 2;
                    int g = (this.color.getGreen() + ball.color.getGreen()) / 2;
                    int b = (this.color.getBlue() + ball.color.getBlue()) / 2;

                    this.Kill();
                    ball.Kill();

                    return new Ball(this.weight + ball.weight, new Color(r, g, b));
                }
                return new Ball(false);
            }

            public void show() {

            if(this.exits){
                System.out.println("Weight: "+weight+", Color: "+color.toString());
            }
            else
                System.out.println("not exits");
            }

            public static void main(String[] args) {
                Ball a = new Ball ( 40,  Color.RED);
                Ball b = new Ball ( 50, new Color( 108, 25,200));

                Ball c = a.collideWith(b);
                Ball err = a.collideWith(b);

                a.show();
                b.show();
                c.show();
                err.show();
}}

