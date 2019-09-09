public class Animal {

        private String breed;
        private String color;
        private int age;

        public Animal(String breed, String color, int age) {
            this.breed = breed;
            this.color = color;
            this.age = age;
        }

        public String getBreed() {
            return this.breed;
        }

        public String getColor() {
            return this.color;
        }

        public int getAge() {
            return this.age;
        }
    }

    class Dog extends Animal
    {

        private String size;

        public Dog(String breed, String color, int age, String size) {
            super(breed,color,age);
            this.size = size;
        }
        public String getSize() {
            return this.size;
        }
    }
    class Aplication {

        public static void main (String[] args) {

            Dog dog = new Dog("Toller", "bursztynowy", 1, "sredni");

            int age = dog.getAge();


            System.out.println(age);
        }
    }
