public class NumberToWords {

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }
        int revNum = reverse(number);
        int digitCount = getDigitCount(number);
        int reversedDigits = getDigitCount(revNum);

        if (revNum == 0){
            System.out.println("Zero");
        }


        while (revNum > 0){

            switch ((revNum % 10)){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
                    break;
            }
            revNum /= 10;
        }
        for (int i = reversedDigits; i<digitCount; i++){
            System.out.println("Zero");
        }

    }

    public static int reverse(int num){
        int inversion = 0;
        int lastDigit;

        while (num != 0){
            lastDigit = num % 10;
            inversion *= 10;
            inversion += lastDigit;
            num /= 10;
        }
        return (inversion);
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        } else if(number == 0){
            return 1;
        }
        int count = 0;
        while (number != 0){
            int a = number/1;
            count++;
            number /= 10;
        }
        return count;

    }
}



//        } else if (number > 0) {
//                int count = 0;
//                while (number > 0){
//                number /= 10;
//                count ++;
//                }
//                return count;
//                } return 1;
//
//                }