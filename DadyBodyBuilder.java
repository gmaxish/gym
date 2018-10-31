public class DadyBodyBuilder extends BodyBuilder{

    @Override
    void continentalPress() {
        System.out.println("DadyBodyBuilder Made continentalPress");
    }

    @Override
    void upBarell() {
        System.out.println("DadyBodyBuilder Made upBarbell");
    }

    @Override
    void backExtension() {
        System.out.println("DadyBodyBuilder Made backExtension");
    }

    @Override
    public void training() {
        backExtension();
        continentalPress();
        swallow();
        upBarell();
    }

    @Override
    void makeHorizont() {
        System.out.println("DadyBodyBuilder Made Horizon");
    }


    @Override
    void swallow() {



    }

    @Override
    public String makeDiet() {
        return "I want eat all around me";
    }
}

