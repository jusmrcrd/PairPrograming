public class Child extends Person {
    private Adult responsible;

    Child(String name,int age,Adult resAdult){
        super(name,age);
        this.responsible = resAdult;

        if(age <= 0){
            throw new RuntimeException("criança de colo não pode");
        }
    }

    public void setResponsible(Adult responsible) {
        this.responsible = responsible;
    }

    public Adult meuResponsavel() {
        return responsible;
    }
}
