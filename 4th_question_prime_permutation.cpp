#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        
        //if n is equal to 2 or 3, then there exists no solution
        if(n == 2 or n == 3){
            cout << - 1 << endl;
            continue;
        }
        
        vector<int> arr(n + 1);
        //taking a 1-based indexed vector
        for(int i = 1; i <= n; i++){
            arr[i] = i;
        }
        
        //as we are swapping the ith index element with (i + 2)th index elemenet, we need to make sure (i + 2) is not more than n
        for(int i = 1; i + 2 <= n;){
            swap(arr[i], arr[i + 2]);
            //if i is odd, then just go to next index.
            //if i is even, then go to (i + 3)th index as (i + 1)th index is already swapped with (i - 1)th and (i + 2)th index is already swapped with ith.
            if(i%2 == 1){
                i += 1;
            }else{
                i += 3;
            }
        }
        //case when only one element is left to be swapped
        if(n%4 == 1){
            swap(arr[n], arr[n - 2]);
            swap(arr[n], arr[n - 1]);
        }
        
        //case when two elements are left to be swapped
        else if(n%4 == 2){
            swap(arr[n], arr[n - 2]);
            swap(arr[n - 1], arr[n - 3]);
            swap(arr[n], arr[n - 1]);
        }
        
        //case when three elements are left to be swapped
        else if(n%4 == 3){
            swap(arr[n - 1], arr[n - 3]);
            swap(arr[n - 2], arr[n - 4]);
            swap(arr[n - 1], arr[n - 2]);
            swap(arr[n - 3], arr[n - 4]);
        }
        
        for(int i = 1; i <= n; i++){
            cout << arr[i] << " ";
        }
        cout << endl;
    }
    return 0;
}
