package NEW2024;

import java.util.function.Predicate;

public class CheckPhoneNumbersGetBooleanValue {

    public static void main(String[] args) {

        // Sample phone numbers
        String[] phoneNumbers = {"+919876543210", "+18001234567", "+912345678901", "+441234567890"};

        // Predicate to check if the phone number starts with +91
        Predicate<String> isIndianNumber = phoneNumber -> phoneNumber.startsWith("+91");

        // Check each phone number
        for (String phoneNumber : phoneNumbers) {
            boolean result = isIndianNumber.test(phoneNumber);
            System.out.println("Is " + phoneNumber + " an Indian number? " + result);
        }






    }

}
