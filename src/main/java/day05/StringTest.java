package day05;



import javax.security.auth.login.Configuration;

public class StringTest {
    static public void main(String[] args){
        String string="111dsadhgsadhkjwq";
        //输出指定下边元素
        System.out.println(string.charAt(4));
        //将指定字符串连接到此字符串的结尾。
        System.out.println(string.concat("aaa"));
        //该方法是判断字符串中是否有子字符串。如果有则返回true，如果没有则返回false。
        System.out.println(string.contains("jwq"));
        //此方法测试字符串是否以指定的后缀结束
        System.out.println(string.endsWith("q"));
        //比较字符串是否相等
        System.out.println(string.equals("111dsadhgsadhkjwq"));
        //比较字符串是否相等,忽略大小写因素
        System.out.println(string.equalsIgnoreCase("111dsAdhgsadhkjwq"));
        //方法是得到一个操作系统默认的编码格式的字节数组。这表示在不同的操作系统下,返回的东西不一样!
        //System.out.println(string.getBytes("ISO8859-1"));
        //indexOf匹配字符  返回下标
        System.out.println(string.indexOf("a"));
        //isEmpty字符串是否为空
        System.out.println(string.isEmpty());
        //返回指定字符在此字符串中最后一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1
        System.out.println(string.lastIndexOf("a"));
        //正则匹配方法 这个方法主要是返回是否匹配指定的字符串，如果匹配则为true,否则为false
        System.out.println(string.matches("\\d*?"));
        //replace将指定老字符转换成新字符
        System.out.println(string.replace("1","2"));
        //replaceAll 将匹配到的所有字符换成指定字符串
        System.out.println(string.replaceAll("(.*)","1"));
        //replaceFirst() 方法使用给定的参数 replacement 替换字符串第一个匹配给定的正则表达式的子字符串。
        System.out.println(string.replaceFirst("(.*)","1"));
        //分割字符串
        String[] s=string.split("1");
        //startWith如果此字符串的方法测试用指定的前缀
        System.out.println(string.startsWith("1"));
        //切割字符串
        System.out.println(string.substring(1,3));
        //该方法的作用是返回一个字符数组，该字符数组中存放了当前字符串中的所有字符
        char[] c=string.toCharArray();
        //ToLowerCase()是将string这个字符串中的字母全部变成小写，而非字母则不作改变。
        System.out.println(string.toLowerCase());
        //　toUpperCase()方法用于将所有英文字母转换为大写字母
        System.out.println(string.toUpperCase());
        //trim去除两端空格
        System.out.println(string.trim());
//        String.valueOf(boolean b) : 将 boolean 变量 b 转换成字符串
//        String.valueOf(char c) : 将 char 变量 c 转换成字符串
//        String.valueOf(char[] data) : 将 char 数组 data 转换成字符串
//        String.valueOf(char[] data, int offset, int count) :
//        将 char 数组 data 中 由 data[offset] 开始取 count 个元素 转换成字符串
//        String.valueOf(double d) : 将 double 变量 d 转换成字符串
//        String.valueOf(float f) : 将 float 变量 f 转换成字符串
//        String.valueOf(int i) : 将 int 变量 i 转换成字符串
//        String.valueOf(long l) : 将 long 变量 l 转换成字符串
//        String.valueOf(Object obj) : 将 obj 对象转换成 字符串, 等于 obj.toString()
    }
}
