static int solve(int n){
    //CODE HERE 
    int fact=1;
    for(int i=n;i>0;i--)
    {
        fact=fact*i;
    }
    return fact;
    }