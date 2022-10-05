public class Main {
    public static void main(String[] args) {
        int a = 10;
        Car mazda = new Car();
        mazda.brand = "mazda";
        mazda.horsePower = 198;
        mazda.isAwd = false;

        System.out.println("is a " + mazda.brand + "; power is " + mazda.horsePower + "; is it AWD - " + mazda.isAwd);
        System.out.println("is a " + mazda.brand + "; power is " + mazda.horsePower + "; is it AWD - " + mazda.isAwd);
        System.out.println("is a " + mazda.brand + "; power is " + mazda.horsePower + "; is it AWD - " + mazda.isAwd);

    }

}

