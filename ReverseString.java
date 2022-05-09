class ReverseString {
    public static void main(String [] args){
        String result = reverseString("Hello");
        System.out.println(result);
    }

    public static String reverseString(String word){
        char [] l = new char[word.length()];

        int indexLetter= 0;
        for (int i= word.length()-1;i>=0;i--){
            l[indexLetter] = word.charAt(i);
            indexLetter++;
        }

        String reverse = "";
        for (int i=0;i<word.length();i++){
            reverse = reverse + l[i];
        }
        return reverse;
    }

}