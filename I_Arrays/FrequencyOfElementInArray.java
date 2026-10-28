package I_Arrays;

public class FrequencyOfElementInArray {
    public static void main(String[] args) {
        String[] names = {"hamid","anas","James","james","jameS","hamid","jaMes"};
        int count=0;
        String word="James";
        for (String eachWord : names) {
            if(eachWord.equalsIgnoreCase(word)){
                count++;
            }
        }
        System.out.println(word + " : " + count);
    }
}

