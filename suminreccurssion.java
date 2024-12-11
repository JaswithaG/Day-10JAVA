class suminreccurssion{
    int sum(int n){
        if(n==0)
        return 0;
        else
        return 
        n+sum(n-1);
    }
    public static void main(String []args){
        suminreccurssion ob=new suminreccurssion();
        int res=ob.sum(10);
        System.out.println(res);
    }
}