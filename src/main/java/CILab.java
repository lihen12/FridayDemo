// Henry
public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        boolean notif = false;
        int count = 0;

        // Coutning how many letters are lowercase
        for (int i = 0; i < myString.length(); i++) {
            if (Character.isLowerCase(myString.charAt(i))) {
                count++;
            }
        }

        // This tests if all letters are capital
        if (myString.length() == count) {
            notif = true;
        }

        // This tests if all letters are undercase
        if (count == 0) {
            notif = true;
        }

        // This tests if only the first letter is capital
        if (Character.isUpperCase(myString.charAt(0)) && myString.length() - count == 1) {
            notif = true;
        }

        return notif;
    }
}

