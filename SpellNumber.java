import java.util.Scanner;

public class SpellNumber {
    public static void main(String[] args) {
        int hundred, ten, unit;
        String hundred_text, ten_text = null, unit_text = null, result;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if (number <= 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
            }
        } else if (number<=99) {
            switch (number) {
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                case 15:
                    System.out.println("fifteen");
                    break;
                default:
                    if ((number < 30) && (number >= 20) || (number < 40 && (number >= 30)) || (number < 60 && (number >= 50)) ) {
                        ten = number / 10;
                        unit = number % 10;

                        switch (ten) {
                            case 2:
                                ten_text = "twenty";
                                break;
                            case 3:
                                ten_text = "thirty";
                                break;
                            case 5:
                                ten_text = "fifty";
                                break;
                        }

                        switch (unit) {
                            case 0:
                                unit_text = "";
                                break;
                            case 1:
                                unit_text = " - one";
                                break;
                            case 2:
                                unit_text = " - two";
                                break;
                            case 3:
                                unit_text = " - three";
                                break;
                            case 4:
                                unit_text = " - four";
                                break;
                            case 5:
                                unit_text = " - five";
                                break;
                            case 6:
                                unit_text = " - six";
                                break;
                            case 7:
                                unit_text = " - seven";
                                break;
                            case 8:
                                unit_text = " - eight";
                                break;
                            case 9:
                                unit_text = " - nine";
                                break;
                        }
                        result = ten_text + unit_text;
                        System.out.println(result);
                    }
            }
        }
    }
}
