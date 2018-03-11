public class Common {
    static public String repeatString(String str, int times){
        StringBuffer buffer=new StringBuffer();
        for(int i=0;i<times;i++){
            buffer.append(str);
        }
        return buffer.toString();
    }
}
