package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param  Password String เข้ามาโดยรหัสผ่านความยาวไม่น้อยกว่า 8ตัว และไม่ว่างปล่าว
     * @return ระดับความปลอดภัยของรหัสผ่าน เป็น INVAILD WEAK MEDIUM STRONG 
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        int count = 0;
        int minLength = 8;

        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        //ตรวจ password น้อยกว่า 8 ไหม
        if (password.length() < minLength) {
            return PasswordStrength.INVALID;
        }
        //ตรวจ password มีตัวเลข ไหม
        for(char c: password.toCharArray()){
            if (Character.isDigit(c)) {
                //System.out.println("Digit found: "); //แจ้งเตือน
                count++;
                break;
            }
        }
        //ตรวจ password มีตัวพิมเล็ก ไหม
        for(char c: password.toCharArray()){
            if (Character.isLowerCase(c)) {
                //System.out.println("Lower found: "); //แจ้งเตือน
                count++;
                break;
            }
        }
        //ตรวจ password มีตัวพิมใหญ่ ไหม
        for(char c: password.toCharArray()){
            if (Character.isUpperCase(c)) {
                //System.out.println("Upper found: "); //แจ้งเตือน
                count++;
                break;
            }
        }


        // เช็คของแต่ละ password ว่า count เท่าไหร่
        //System.out.println(count + password);

        if(count >= 3){
            return PasswordStrength.STRONG;
        } else if(count == 2){
            return PasswordStrength.MEDIUM;
        } else if(count == 1){
            return PasswordStrength.WEAK;
        }else
        
        // ถ้าไม่ตรงกับเงื่อนไขใดๆ
        return PasswordStrength.INVALID; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
    }
}