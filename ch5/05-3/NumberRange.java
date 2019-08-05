class NumberRange{
  public static void main(String[] args){
    int n = 24;

    switch(n/10)
    {
    case 1:
      System.out.println("0 to 10");
      break;
    case 2:
      System.out.println("10 to 20");
      break;
    case 3:
      System.out.println("20 to 30");
      break;
    default:
      System.out.println("negative or more than 30");
    }
  }
}

