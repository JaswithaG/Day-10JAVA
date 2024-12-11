class factorialinreccurssion{
    int a(int n){
        if(n==0)
        return 1;
        else
        return 
        n*a(n-1);
    }
    public static void main(String []args){
        factorialinreccurssion ob=new factorialinreccurssion();
        int res=ob.a(10);
        System.out.println(res);
    }
}