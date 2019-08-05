class PartialByTimes{
  public static void main(String[] args){
    int i, j;

    for(i=2; i<9; i+=2){
      for(j=1; j<=i; j++){
        System.out.print(i*j + " ");
      }
      System.out.println();
    }
  }
}
