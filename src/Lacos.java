public class Lacos {


    //Laço for
    public void lacopara() {

      for(int i=0;i<5;i++){
        
          if (i == 1) {
              System.out.println("Esse número é 1");
              break;
          } else {
              System.out.println("Não é 1");
          }

        //System.out.println("Professor Bruno");
      }

    }

    //Laço while - enquanto
    public void enquanto(int n1) {

        int i = 0;

        while(i<n1) {

            if (i == 5) {
                System.out.println("Esse número é " + n1 + ":" + i);
                break;
            } else {
                System.out.println("Não é : " + n1 + ":" + i);
            }

            i++;
        }
    }

    //Do..while
    public void facaenquanto(int n1) {
         
        int i=0;

        do {
           // System.out.println("Olá");

            if (i == 5) {
                System.out.println("Achou o número" + n1 + ":" + i);
                break;
            } else {
                System.out.println("Não é : " + n1 + ":" + i);
            }

          i++;
        } while (i <= n1);

    }

    public void usecase(String fruta){

        switch (fruta) {
            case "banana": System.out.println("A fruta é: " + fruta);
                
                break;
            case "maçã": System.out.println("A fruta:é " + fruta);
                break;
        
            default: System.out.println("Nenhum desses");
                break;
        }

    }
    
}
