public class Sorts {

/*
  //selectionSort
  public static void selectionSort(int[] ary) {
    for (int x = 0; x < ary.length; x++) {
      int min = ary[x]; //assumes smallest value in array is current value
      int minInd = x;   //assumes index of smallest value is current index
      for (int y = x; y < ary.length; y++) { //starts counting at current index until end
        if (ary[y] < min) {
          min = ary[y]; //if a lesser value is found, sets minimum and miniumIndex
          minInd = y;
        }
      }
      int oldVal = ary[x]; //temporarily holds the old value of current index to set up swapping
      ary[x] = ary[minInd]; //sets current index to the smallest value
      ary[minInd] = oldVal; //sets the index of the smallest value to the old value of current index
    }
  }
*/

  //bubbleSort
  public static void bubbleSort(int[] ary) {
    int aryLen = ary.length;
    int firstNum, secNum, tempNum;
    boolean fin = false;
    while (fin == false) {
      for (int s = 0; s < aryLen - 1; s++) {
        firstNum = ary[s];
        secNum = ary[s] + 1;
        if (firstNum > secNum) {
          tempNum = firstNum;
          firstNum = secNum;
          secNum = tempNum;
        }
      }
      for (int t = 0; t < aryLen - 1; t++) {
        firstNum = ary[t];
        secNum = ary[t]+1;
        if (firstNum > secNum) break;
        if (t == aryLen - 2 && firstNum < secNum) fin = true;
      }
  }
}

  public static String toString(int[] ary) {
    String ret = "";
    if (ary.length > 0) {
      for (int i = 0; i < ary.length; i++) {
        ret = ret + ary[i] + ",";
      }
      ret = ret.substring(0,ret.length()-1); //to eliminate the last comma
      ret = "[" + ret + "]"; //to make it into array format
      return ret;
    } else return "[]";
  }

  public static void main(String[] args) {
    int[] ary = {-2,-4,0,5,3,1};
    selectionSort(ary);
    System.out.println("Test 1: Should print -4,2,0,1,3,5");
    System.out.println(toString(ary));

    System.out.println();

    int[] ary2 = {10000,-999,8,2,5};
    selectionSort(ary2);
    System.out.println("Test 2: Should print -999,2,5,8,10000");
    System.out.println(toString(ary2));

    System.out.println();

    int[] ary3 = {};
    selectionSort(ary3);
    System.out.println("Test 3: Should print nothing ");
    System.out.println(toString(ary3));
  }
}

//forgot to continously commit while working on this and only realized after!
//will commit more next time
