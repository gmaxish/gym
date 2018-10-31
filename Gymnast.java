public abstract class Gymnast extends Human implements  EasyAthlete {


    @Override
    public void pushup(int set, int amount) {
        System.out.println("I make pushup " + set + " sets" + " x " + amount + " amounts");
    }

    @Override
    public void pulup(int set, int amount) {
        System.out.println("I make pulup " + set + " sets" + " x " + amount + " amounts");

    }

    @Override
    public void run(int distance) {
        System.out.println("I run " + distance + " kilometers");

    }

    @Override
    public void paralleleBarsPushUp(int set, int amount) {
        System.out.println("I make parallelBarsPushUo " + set + " sets" + " x " + amount + " amounts");

    }
        public void PhisicalExersice() {
            System.out.println("Let's start doing exersise, dude!");
            pushup(4,25);
            pulup(4, 6);
            paralleleBarsPushUp(4, 20);
            run(3);
        }

        abstract void makeHorizont();

        abstract void swallow();



    }

