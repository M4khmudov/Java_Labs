public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish("Немо", 1, "Красная", "Пресная");
        fish.showInfo();
        System.out.println(fish.getWater());
        Parrot parrot = new Parrot("Кеша", 5, "Красный", true);
        parrot.showInfo();
        parrot.setTalk(false);
        parrot.showInfo();
        System.out.println("Создано объектов: " + Animal.getCount());
    }
}

