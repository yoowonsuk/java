class ContinueBasic{
  public static void main(String[] args){
    int c = 0;

    for(int n = 1; n <= 100; n++){
      if( n%5 != 0 || n%7 != 0 )
        continue;
      c++;
      System.out.println(n);
    }
    System.out.println("count: " + c);
  }
}
