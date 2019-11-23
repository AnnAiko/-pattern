package lab_11_1;

public class Hash {

    public String hashCode(String hash) {
        int iLength = hash.length();
        StringBuffer sb = new StringBuffer(iLength);
        for (int i = 0; i < 10; i++) {
            //Получить символ 
            int v = (int) hash.charAt(i);
            //Перевести в шестнадцетеричную 
            sb.append(Integer.toHexString(v));
        }
        return sb.toString().toUpperCase();
    }
}
