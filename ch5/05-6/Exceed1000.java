class Exceed1000{
  public static void main(String[] args){
    int n = 3;
    int s = 1;

    while(s < 1000){
      s += n;
      n += 2;
    }

    System.out.println(s);
  }
}
