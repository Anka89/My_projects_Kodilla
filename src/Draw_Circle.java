    interface Shape {
        void draw();
    }

    class Draw_Circle implements Shape {

        public void draw () {
            System.out.println("I am drawing a circle");
        }
    }

    class Rectangle implements Shape {

        public void draw () {
            System.out.println("I am drawing a rectangle");
        }
    }

    class ShapeDrawer {

        private Shape ksztalt;

        public ShapeDrawer (Shape ksztalt) {
            this.ksztalt = ksztalt;
        }
        public void process () {
            System.out.println("you have chosen your shape");
            this.ksztalt.draw();
            System.out.println("Shape has been draw");
        }
    }

    class Aplication1 {
        public static void main(String args[]) {


            Shape circle = new Draw_Circle();

            ShapeDrawer ryswonik = new ShapeDrawer(circle);

            ryswonik.process();

            Shape rectangle = new Rectangle();

            ShapeDrawer malownik = new ShapeDrawer(rectangle);
            malownik.process();

        }
    }
