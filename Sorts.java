public class Sorts {
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

  public static String toString(int[] ary) {
    String ret = "";
    for (int i = 0; i < ary.length; i++) {
      ret = ret + ary[i] + ",";
    }
    ret = ret.substring(0,ret.length()-1); //to eliminate the last comma
    ret = "[" + ret + "]"; //to make it into array format
    return ret;
  }
  public static void main(String[] args) {
    int[] ary = {-2,-4,0,5,3,1};
    selectionSort(ary);
    System.out.println("Should print -4,2,0,1,3,5");
    System.out.println(toString(ary));
  }
}
