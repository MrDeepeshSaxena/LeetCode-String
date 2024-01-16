
public class Faulty_Keyboard_2810 {
    public String finalString(String s) {
        StringBuffer str = new StringBuffer();
        for(int i=0; i<s.length(); i++){
            if(str.length()>0 && s.charAt(i) == 'i'){
                str.reverse();
            } else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
