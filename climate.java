package lab121;
importjava.util.Scanner;
publicclasslab12 {
  publicstaticvoidmain(String[] args) 
  {
    Scanner sc= newScanner(System.in);
    doublemat[][][] = newdouble[3][4][2];
    doubleavg_temp=0;
    doubleavg_hum=0 ;
    for(inti=0;i<3;i++)
    {
      for(intj=0;j<4;j++)
      {
        System.out.println("Enter the temperature of "+((j+1)*6)+"th hour of day "+(i+1));
        mat[i][j][0]=sc.nextDouble();
        System.out.println("Enter the humidity of "+((j+1)*6)+"th hour of day "+(i+1));
        mat[i][j][1]=sc.nextDouble();
        avg_temp+=mat[i][j][0];
        avg_hum+=mat[i][j][1];
      }
    }
    avg_temp/=12;avg_hum/=12;
    System.out.println("Average temperature is "+avg_temp+" degree celcius and humidity is "+avg_hum+" %");
  }
}
