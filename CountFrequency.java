package project;
import java.util.HashMap;
import java.util.Map;

class CountFrequency{
    String[] words ;
    Map<String,Integer> wordFrequency = new HashMap<>();
    
    CountFrequency(){
        System.out.println("\n\n***************************------- welcome to count frequency project -------*********************\n\n");
    }

    public Map<String , Integer> wordFrequency(String inputs){
        words = inputs.split("\\s+");

        for(String word : words){
            if(wordFrequency.containsKey(word)){
                wordFrequency.put(word, wordFrequency.get(word)+1);
            }  else{
                wordFrequency.put(word , 1);
            }
        }
        return wordFrequency;
    }

    public void print(Map<String ,Integer> printMe){
        //Now I want to print how many each word was a frequented
        System.out.println("Word Frequencies : ");
        for(Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + " Repeated ---> " + entry.getValue());
        }
    }


}