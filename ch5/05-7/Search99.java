class Search99{
  public static void main(String[] args){
    int i, j, r;

    for(i=0; i<10; i++){
      for(j=0; j<10; j++){
        if(11 * (i + j) == 99)
          System.out.println(i + " " + j);
      }
    }
  }
}
        
