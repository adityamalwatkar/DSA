public class CommonCharacterInThreeString {
    public static void main(String[] args) {
        String str1 = "adibnad";
        String str2 = "shnjadi";
        String str3 = "anbadiw";

        StringBuilder common = new StringBuilder();

        for(char c : str1.toCharArray()){
            if (str1.indexOf(c) != -1 && str2.indexOf(c) != -1 && str3.indexOf(c) != -1){
                common.append(c);
            }
        }
        System.out.println(common);
    }
}
