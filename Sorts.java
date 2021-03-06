public class Sorts {
  /**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data the elements to be sorted.
  */
  public static void selectionSort(int[] data) {
    for (int x = 0; x < data.length; x++) {
      int min = data[x]; //assumes smallest value in array is current value
      int minInd = x;   //assumes index of smallest value is current index
      for (int y = x; y < data.length; y++) { //starts counting at current index until end
        if (data[y] < min) {
          min = data[y]; //if a lesser value is found, sets minimum and miniumIndex
          minInd = y;
        }
      }
      int oldVal = data[x]; //temporarily holds the old value of current index to set up swapping
      data[x] = data[minInd]; //sets current index to the smallest value
      data[minInd] = oldVal; //sets the index of the smallest value to the old value of current index
    }
  }

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data the elements to be sorted.
  */
  public static void bubbleSort(int[] data) {
    int aryLen = data.length;
    int firstNum, secNum, tempNum;
    boolean go = true; //assumes everything isn't sorted yet, go is true
    if (aryLen > 0) { //if aryLen is 0, then toString returns "[]" by default
      while (go) {
        for (int s = 0; s < aryLen-1; s++) {
          firstNum = data[s]; //holds in value at current index, and the value immediately after
          secNum = data[s+1];
          if (firstNum > secNum) {
            tempNum = firstNum; //swaps by using a temporary variable
            data[s] = secNum;
            data[s+1] = tempNum;
          }
        }
        for (int t = 0; t < aryLen - 1; t++) { //checks through array and if it is sorted
          if (data[t] > data[t+1]) { //if there is any case of current is bigger than next, breaks
            break;                   //and the previous for loop is repeated
          }
          else if (t == aryLen - 2) {
            go = false;              //this means the next value is bigger, and that every value behind this index
          }                          //are smaller. Stops while loop
        }
      }
  }
}

  /**Insertion sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data the elements to be sorted.
  */
  public static void insertionSort(int[] data) {
    for (int x = 1; x < data.length; x++) {
      int a = x;                                //counting variable
      int hold = data[x];                       //temporary var hold to hold value of current index
      while (a - 1 >= 0 && hold < data[a-1]) {  //while the previous index maxes out at zero (prevents indexoutofbounds),
                                                //and while the value of currrent index is less than the previous value
        data[a] = data[a-1];                    //replaces current value with the previous value (essentially shifting right)
        a--;                                    //goes back an index again and repeats
      }
      data[a] = hold;                           //finally, when there isn't anything to the left (index is 0) or when
                                                //the previous index is smaller than the value of hold
                                                //the current index is replaced by hold
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
    int[] sSort = {-2,-4,0,5,3,1};
    System.out.println("Orignal: [-2,-4,0,5,3,1]");
    selectionSort(sSort);
    System.out.println("selectionSort 1: Should print [-4,2,0,1,3,5]");
    System.out.println(toString(sSort));

    System.out.println();

    int[] sSort2 = {10000,-999,8,2,5};
    System.out.println("Original: [10000,-999,8,2,5]");
    selectionSort(sSort2);
    System.out.println("selectionSort 2: Should print [-999,2,5,8,10000]");
    System.out.println(toString(sSort2));

    System.out.println();

    int[] sSort3 = {};
    System.out.println("Original: []");
    selectionSort(sSort3);
    System.out.println("selectionSort 3: Should print [] ");
    System.out.println(toString(sSort3));

    System.out.println();

    int[] bSort = {5,1,12,-5,16};
    System.out.println("Original: [5,1,12,-5,16]");
    bubbleSort(bSort);
    System.out.println("bubbleSort 1: Should print [-5,1,5,12,16]");
    System.out.println(toString(bSort));

    System.out.println();

    int[] bSort2 = {30,5,2,0,-1,8};
    System.out.println("Original: [30,5,2,0,-1,8]");
    bubbleSort(bSort2);
    System.out.println("bubbleSort 2: Should print [-1,0,2,5,8,30]");
    System.out.println(toString(bSort2));

    System.out.println();

    int[] bSort3 = {};
    System.out.println("Original: []");
    bubbleSort(bSort3);
    System.out.println("bubbleSort 3: Should print []");
    System.out.println(toString(bSort3));

    System.out.println();

    int[] iSort = {4,3,2,10,12,1,5,6};
    System.out.println("Original: [4,3,2,10,12,1,5,6]");
    insertionSort(iSort);
    System.out.println("insertionSort 1: Should print [1,2,3,4,5,6,10,12]");
    System.out.println(toString(iSort));

    System.out.println();

    int[] iSort2 = {10,5,3,5,7,10,20,0};
    System.out.println("Original: [10,5,3,5,7,10,20,0]");
    insertionSort(iSort2);
    System.out.println("insertionSort 2: Should print [0,3,5,5,7,10,10,20]");
    System.out.println(toString(iSort2));

    System.out.println();

    int[] iSort3 = {};
    System.out.println("Original: []");
    insertionSort(iSort3);
    System.out.println("insertionSort 3: Should print []");
    System.out.println(toString(iSort3));
    }
}
