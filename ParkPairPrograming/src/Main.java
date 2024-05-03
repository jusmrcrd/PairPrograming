public class Main {
    public static void main(String[] args) {
        Adult Bruno = new Adult("bruno",25);
        Child bruninho = new Child("bruninho",8,Bruno);
        bruninho.setResponsible(new Adult("Ricardão",28));
    }
}