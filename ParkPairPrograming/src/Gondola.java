public class Gondola {
    private int gondola;
    private Person assent1,assent2;

    Gondola(int gondolanumber,Person assent1,Person assent2){
        if(gondolanumber < 1 || gondolanumber > 18)
            throw new RuntimeException("epa ta errado ai");

        this.gondola = gondolanumber;
        this.assent1 = assent1;
        this.assent2 = assent2;
    }

    public int getGondola() {
        return gondola;
    }

    public Person getAssent1() {
        return assent1;
    }

    public Person getAssent2() {
        return assent2;
    }

}
