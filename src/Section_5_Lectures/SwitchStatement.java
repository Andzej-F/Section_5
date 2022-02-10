package Section_5_Lectures;

public class SwitchStatement {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1, 2, 3, 4 or 5");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, or 4, or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;

        }
        System.out.println();

        char newSwitchValue = 'E';
        switch (newSwitchValue) {

            case 'A':
                System.out.println("Was " + newSwitchValue);
                break;

            case 'B':
                System.out.println("Was " + newSwitchValue);
                break;

            case 'C':
            case 'D':
            case 'E':
                System.out.println("C or D or E was found");
                break;


            default:
                System.out.println("Was not A, B, C, D or E");
                break;
        }

        String month = "JunE";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;
        }
    }
}




