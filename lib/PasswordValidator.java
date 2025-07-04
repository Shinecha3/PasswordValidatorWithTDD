package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param  รับรหัสผ่านที่เป็น String เข้ามาโดยรหัสผ่านความยาวไม่น้อยกว่า 8ตัว และไม่ว่างปล่าว
     * @return ระดับความปลอดภัยของรหัสผ่าน
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        int count = 0;
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        if (password.length() < 8) {
            return PasswordStrength.INVALID;
        }
        for(int i=0; i< password.length()-1; i++){
            if (password.charAt(i) == '!' || password.charAt(i) == '#' || 
                password.charAt(i) == '$' || password.charAt(i) == '&' || 
                password.charAt(i) == '*') {
                System.out.println("Special character found: " + password.charAt(i));
                count++;
                break;
            }
        }
        for(int i=0; i< password.length()-1; i++){
            if (password.charAt(i) == '0' || password.charAt(i) == '1' || 
            password.charAt(i) == '2' || password.charAt(i) == '3' || 
            password.charAt(i) == '4' || password.charAt(i) == '5' || 
            password.charAt(i) == '6' || password.charAt(i) == '7' || 
            password.charAt(i) == '8' || password.charAt(i) == '9') {
            System.out.println("Digit found: " + password.charAt(i));
            count++;
            break;
            }
            
        }
        for(int i=0; i< password.length()-1; i++){
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                System.out.println("Lowercase letter found: " + password.charAt(i));
                count++;
                break;
            }
        }
        for(int i=0; i< password.length()-1; i++){
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                System.out.println("Uppercase letter found: " + password.charAt(i));
                count++;
                break;
            }
        }


        
        System.out.println(count + password);
        if(count == 3){
            return PasswordStrength.STRONG;
        } else if(count == 2){
            return PasswordStrength.MEDIUM;
        } else if(count == 1){
            return PasswordStrength.WEAK;
        }
        // ถ้าไม่ตรงกับเงื่อนไขใดๆ
        

        
        int minLength = 8 ;// TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        
        return null ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
    }
}