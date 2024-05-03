public class Adult extends Person {
    Adult(String name,int age){
        super(name,age);
        if(age < 18){
            throw new RuntimeException("não e um adulto");
        }
    }
}
