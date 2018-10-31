public class MomyWorkouter extends Workouter implements Nutritionist{

    public MomyWorkouter(){
        this.setAge(17);
        this.setHeight(178);
        this.setWeight(67);

    }

    @Override
    public void flag() {

        System.out.println("I make flag ");
    }

    @Override
    public void towel() {

        System.out.println("I make  towel");
    }

    @Override
    public void makeHorizont() {

        System.out.println("I make horizont");
    }

    @Override
    public void swallow() {
        System.out.println("I make swallow");
    }

    @Override
    public String makeDiet() {

        return "go to grandma and eat punck cake";
    }

    public void run(int distance){
        super.run(distance);
        System.out.println("Da nu nafig");
    }

    public void trainig(){
        PhisicalExersice();
        flag();
        towel();
        makeHorizont();
        swallow();
        makeDiet();
    }
}
