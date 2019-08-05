class SumTo100{
  public static void main(String[] args){
    int num = 1, sum = 0;

    while(num < 100)
      sum += num++;
    System.out.println(sum);
  }
}
