class MultipleOneToTen{
  public static void main(String[] args){
    int result = 2;

    for(int i = 3; i <= 10; i++)
      result *= i;
    System.out.println(result);
  }
}
