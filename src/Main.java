import java.util.Random;

public class Main {
    //Task1
    public static int fibNthElement(int n) {
        int first = 0;
        int second = 1;
        int third;
        if (n == 0) return 0;
        for (int i = 2; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;
            System.out.println(second);
        }
        return second;
    }

    //Task2
    public static void equationSolutions(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d < 0) System.out.println(Double.NaN);
        else if (d == 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println(x1);
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The Solutions Are : " + x1 + " And " + x2);
        }
    }

    //Task3
    public static int factorial(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        return fact;

    }

    //Task4
    public static double hypotenuse(double k1, double k2) {
        if (k1 <= 0 || k2 <= 0) return Double.NaN;
        return Math.sqrt(k1 * k1 + k2 * k2);
    }

    //Task5
    public static double side(double h, double k) {
        if (k <= 0 || h <= 0) return Double.NaN;
        return Math.sqrt(h * h - k * k);
    }

    //Task6
    public static double areaOfEquilateralTriangle(double side) {
        if (side <= 0) return Double.NaN;
        return side * side * Math.sqrt(3) / 4;
    }

    //Task7
    public static void oldPhoneSymbol(int number) {
        switch (number) {
            case 2: {
                System.out.println('A');
                break;
            }
            case 22: {
                System.out.println('B');
                break;
            }
            case 222: {
                System.out.println('C');
                break;
            }
            case 3: {
                System.out.println('D');
                break;
            }
            case 33: {
                System.out.println('E');
                break;
            }
            case 333: {
                System.out.println('F');
                break;
            }
            case 4: {
                System.out.println('G');
                break;
            }
            case 44: {
                System.out.println('H');
                break;
            }
            case 444: {
                System.out.println('I');
                break;
            }
            case 5: {
                System.out.println('J');
                break;
            }
            case 55: {
                System.out.println('K');
                break;
            }
            case 555: {
                System.out.println('L');
                break;
            }
            case 6: {
                System.out.println('M');
                break;
            }
            case 66: {
                System.out.println('N');
                break;
            }
            case 666: {
                System.out.println('O');
                break;
            }
            case 7: {
                System.out.println('P');
                break;
            }
            case 77: {
                System.out.println('Q');
                break;
            }
            case 777: {
                System.out.println('R');
                break;
            }
            case 7777: {
                System.out.println('S');
                break;
            }
            case 8: {
                System.out.println('T');
                break;
            }
            case 88: {
                System.out.println('U');
                break;
            }
            case 888: {
                System.out.println('V');
                break;
            }
            case 9: {
                System.out.println('W');
                break;
            }
            case 99: {
                System.out.println('X');
                break;
            }
            case 999: {
                System.out.println('Y');
                break;
            }
            case 9999: {
                System.out.println('Z');
                break;
            }
        }

    }


    //Task8
    public static int randomDice() {
        Random r = new Random();
        return r.nextInt(1, 6);
    }

    //Task9
    public static int randomDicePair() {
        Random r = new Random();
        int n1 = randomDice();
        int n2 = randomDice();
        return 10 * n1 + n2;

    }

    //Task10
    public static String penalties(String goals1, String goals2) {
        int score1 = 0;
        int score2 = 0;
        for (int i = 0; i < goals1.length(); i++) {
            if (goals1.charAt(i) == '1') score1++;
            if (goals2.charAt(i) == '1') score2++;
        }
        if (score1 > score2) return "გაიმარჯვა პირველმა გუნდმა";
        if (score1 < score2) return "გაიმარჯვა მეორე გუნდმა";
        return "დასრულდა ფრე";
    }

    //Task11
    static String monthName(int monthNumber) {
        String month;

        switch (monthNumber) {
            case 1:
                month = "იანვარი";
                break;
            case 2:
                month = "თებერვალი";
                break;
            case 3:
                month = "მარტი";
                break;
            case 4:
                month = "აპრილი";
                break;
            case 5:
                month = "მაისი";
                break;
            case 6:
                month = "ივნისი";
                break;
            case 7:
                month = "ივლისი";
                break;
            case 8:
                month = "აგვისტო";
                break;
            case 9:
                month = "სექტემბერი";
                break;
            case 10:
                month = "ოქტომბერი";
                break;
            case 11:
                month = "ნოემბერი";
                break;
            case 12:
                month = "დეკემბერი";
                break;
            default:
                month = "ERROR";
                break;
        }

        return month;
    }

    //Task12
    public static int middleNum(int a, int b, int c) {
        if ((a >= b && b >= c) || (c >= b && b >= a)) return b;
        if ((b >= a && a >= c) || (c >= a && a >= b)) return a;
        return c;
    }


    //Task13
    public static int secondNum(int a, int b, int c, int d) {
        int minMiddle = middleNum(a, b, c);
        if (middleNum(a, b, d) <= minMiddle) minMiddle = middleNum(a, b, d);
        if (middleNum(a, c, d) <= minMiddle) minMiddle = middleNum(a, c, d);
        if (middleNum(b, c, d) <= minMiddle) minMiddle = middleNum(b, c, d);
        return minMiddle;
    }

    //Task14
    public static boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) return true;
                return false;
            }
            return true;
        }
        return false;
    }

    public static String olympic(int year) {
        if (year > 2023) return "ჯერ არ ჩატარებულა";
        else if (year < 1896) return "არ არსებობდა";
        else if (year <= 1920) return "ჩატარდა ზაფხულის ოლიმპიადა";
        else if (year <= 1992 && year % 4 == 0) return "ჩატარდა ზაფხულის და ზამთრის ოლიმპიადაც";
        else if (year > 1992 && isLeap(year - 2)) return "ჩატარდა ზამთრის ოლიმპიადა";
        else if (year > 1992 && isLeap(year)) return "ჩატარდა ზაფხულის ოლიმპიადა";
        return "არ ჩატარებულა";
    }


    //Task15
    public static double power(double a, int b) {
        double res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        return res;
    }


    //Task16
    public static void operations(int a) {
        int counter = 0;
        while (a != 1) {
            if (a % 2 == 1) a = a * 3 + 1;
            else a = a / 2;
            counter++;
        }
        System.out.println("Number of operations is: " + counter);
    }


    //Task17
    public static String ATM(int amount) {
        if (amount % 5 != 0) return "თანხა არასწორია";
        int amount200, amount100, amount50, amount20, amount10, amount5 = 0;
        String res = "";
        while (amount > 0) {
            if (amount >= 200) {
                amount200 = amount / 200;
                amount -= amount200 * 200;
                res += "200 X " + amount200 + ", ";
            } else if (amount >= 100) {
                amount100 = amount / 100;
                amount -= amount100 * 100;
                res += "100 X " + amount100 + ", ";

            } else if (amount >= 50) {
                amount50 = amount / 50;
                amount -= amount50 * 50;
                res += "50 X " + amount50 + ", ";

            } else if (amount >= 20) {
                amount20 = amount / 20;
                amount -= amount20 * 20;
                res += "20 X " + amount20 + ", ";


            } else if (amount >= 10) {
                amount10 = amount / 10;
                amount -= amount10 * 10;
                res += "10 X " + amount10 + ", ";

            } else if (amount >= 5) {
                amount5 = amount / 5;
                amount -= amount5 * 5;
                res += "5 X " + amount5 + ", ";
            }

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Math.random());
    }

}
