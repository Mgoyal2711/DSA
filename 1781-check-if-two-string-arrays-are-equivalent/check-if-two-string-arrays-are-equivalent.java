class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    // StringBuilder one = new StringBuilder();
    // StringBuilder two = new StringBuilder();

    // for(String w1 : word1){
    //     one.append(w1);
    // }

    // for(String w1 : word2){
    //     one.append(w1);
    // }


    // return one.toString().equals(two.toString());

String one = String.join("",word1);
String two = String.join("",word2);

if(one.equals(two)){
    return true;
} else
    return false;
    }
}
