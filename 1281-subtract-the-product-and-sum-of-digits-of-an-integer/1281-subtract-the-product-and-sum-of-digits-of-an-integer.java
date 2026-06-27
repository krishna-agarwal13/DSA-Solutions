class Solution {
    public int subtractProductAndSum(int n) {
        int num=n;
        int sum=0, prd=1;
        while(n!=0){
            int a=n%10;
            sum+=a;
            prd*=a;
            n/=10;
        }
        return prd-sum;
    }
}