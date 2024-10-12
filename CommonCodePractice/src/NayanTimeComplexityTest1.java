
class NayanTimeComplexityTest1 {
	


    public static void main(String[] args) {

        int n = 150000;

        method1(n);
       method2(n);

    }
    public static void method1(int n){

        Integer count = 0;

        for (int i=1; i<n;i++){
            //System.out.println("method 1");
            count = count+1;
        }
        for (int i=1; i<n;i++){
           // System.out.println("method 1");
            count = count+1;
        }
        for (int i=1; i<n;i++){
            //System.out.println("method 1");
            count = count+1;
        }
        for (int i=1; i<n;i++){
            //System.out.println("method 1");
            count = count+1;
        }
        for (int i=1; i<n;i++){
            //System.out.println("method 1");
            count = count+1;
        }
        for (int i=1; i<n;i++){
            //System.out.println("method 1");
            count = count+1;
        }
        for (int i=1; i<n;i++){
            //System.out.println("method 1");
            count = count+1;
        }
        for (int i=1; i<n;i++){
            //System.out.println("method 1");
            count = count+1;
        }
        for (int i=1; i<n;i++){
            //System.out.println("method 1");
            count = count+1;
        }
        for (int i=1; i<n;i++){
            //System.out.println("method 1");
            count = count+1;
        }

        System.out.println("Total Execution Count in Method1=" +count);
    }




    public static  void method2(int n){
        Integer count = 0;

        for (int i=1; i<n;i++) {
            for (int j = 1; j < n; j++) {
                //System.out.println("method 1");
                count = count + 1;
            }
        }
        System.out.println("Total Execution Count in Method2=" +count);
    }
	
}