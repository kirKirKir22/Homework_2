public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task8() {

        System.out.println("Задача 8");

        var totalWorkingTime = 640;
        var workingHours = 8;
        var staff = totalWorkingTime / workingHours;
        staff = staff + 94;

        System.out.println("Всего работников в компании " + totalWorkingTime / workingHours);
        System.out.println("Если в компании работает " + staff + " человек, то всего " + staff * workingHours + " часов работы может быть поделено между сотрудниками");

    }

    private static void task7() {

        System.out.println("Задача 7");

        var weightBoxer_1 = 78.2;
        var weightBoxer_2 = 82.7;

        System.out.println(weightBoxer_2 - weightBoxer_1);
        System.out.println(weightBoxer_2  % weightBoxer_1);

    }

    private static void task6() {

        System.out.println("Задача 6");

        var weightBoxer_1 = 78.2;
        var weightBoxer_2 = 82.7;

        System.out.println(weightBoxer_1 + weightBoxer_2);
        System.out.println(weightBoxer_2 - weightBoxer_1);

    }

    private static void task5() {

        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

    }

    private static void task4() {

        System.out.println("Задача 4");

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);
    }

    private static void task3() {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("Задача 3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    private static void task2() {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("Задача 2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    private static void task1() {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Задача 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
}