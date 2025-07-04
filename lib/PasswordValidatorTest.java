package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate("123");
        // Test Case 2: รหัสผ่านสั้นควรจะ Weak
        PasswordStrength result2 = PasswordValidator.validate("sunnyday");
        // Test Case 3: รหัสผ่านสั้นควรจะ Medium
        PasswordStrength result3 = PasswordValidator.validate("Sunnyday");
        // Test Case 4: รหัสผ่านสั้นควรจะ Strong
        PasswordStrength result4 = PasswordValidator.validate("Happyday1#");

        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }
         // --- เขียน Test Case อื่นๆ ต่อ ---
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: sunnyday is Weak.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected Weak but got " + result2);
        }
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: Sunnyday is Medium.");
        } else {
            System.out.println("Test Case 3 FAILED: Expected Medium but got " + result3);
        }
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed: Happyday1# is Strong.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected Strong but got " + result4);
        }
        

       

        System.out.println("--------------------------------");
    }
}
