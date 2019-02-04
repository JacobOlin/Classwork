import java.util.List;
import java.util.ArrayList;
public class classwork{

  public static void main(String[] args) {
    /*System.out.println(makeAllWords(2,3));
    System.out.println(makeAllWords(3,2));
    System.out.println(makeAllWords(1,26));
    System.out.println(makeAllWords(4,3));
    System.out.println(makeAllWords(2,5));
    System.out.println(makeAllWords(0,2));*/

  }

  public static List<String> makeAllWords(int k, int maxLetter) {
    List<String> l = new ArrayList<String>();
    mAW(k,"",l,maxLetter);
    return l;
  }

  public static void mAW(int k, String word, List<String> l, int maxLetter) {
    if (k == 0) {
      l.add(word);
    }
    else {
      for (int i = 0;i < maxLetter;i += 1) {
        mAW(k-1,word + ((char)('a' + i)),l,maxLetter);
      }
    }
  }

}
