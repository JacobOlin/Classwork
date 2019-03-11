import java.util.List;
import java.util.ArrayList;
import java.util.Random;
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

  public static int partition(int[] data,int start, int end) {
    Random r  = new Random();
    int index = start + r.nextInt()%(end - start + 1);
    int pivot = data[index];
    data[index] = data[start];
    data[start] = pivot;
    return recursive(data,start+1,end,start);
  }

  public static int recursive(int[] data,int start,int end,int pivotInd) {
    if (start == end) {
      if (data[pivotInd] > data[start]) {
        int pivot = data[pivotInd];
        data[pivotInd] = data[start - 1];
        data[start - 1] = pivot;
        return start - 1;
      }
      int pivot = data[pivotInd];
      data[pivotInd] = data[start];
      data[start] = pivot;
      return start;
    }
    if (data[start] >= data[pivotInd]) {
      int change = data[start];
      data[start] = data[end];
      data[end] = change;
      return recursive(data,start,end - 1,pivotInd);
    }
    return recursive(data,start+1,end,pivotInd)
  }

}
