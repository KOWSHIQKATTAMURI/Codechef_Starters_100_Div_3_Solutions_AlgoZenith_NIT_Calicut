#include<bits/stdc++.h>
using namespace std;

//to check if odd index elements values are less than adjacent even index elements values
bool verify_one(vector<int> &arr, int n){
    for(int i = 1; i < n - 1; i++){
        if(i%2 == 1){
            if(arr[i - 1] >= arr[i] or arr[i] <= arr[i + 1]){
                return false;
            }
        }else{
            if(arr[i - 1] <= arr[i] or arr[i] >= arr[i + 1]){
                return false;
            }
        }
    }
    return true;
}

//to check if even index elements values are less than adjacent odd index elements values
bool verify_two(vector<int> &arr, int n){
    for(int i = 1; i < n - 1; i++){
        if(i%2 == 1){
            if(arr[i - 1] <= arr[i] or arr[i] >= arr[i + 1]){
                return false;
            }
        }else{
            if(arr[i - 1] >= arr[i] or arr[i] <= arr[i + 1]){
                return false;
            }
        }
    }
    return true;
}

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        vector<int> arr(n);
        for(int i = 0; i < n; i++){
            cin >> arr[i];
        }
        
        //we are not worried about the position/index of the elements
        //only the element has significance but not its position as we are given the freedom to swap any element with an another element
        sort(arr.begin(), arr.end());
        
        //choice_one is the vector in which odd index elements values are more than the adjacent even elements values.
        //choice_two is the vector in which even index elements values are more than the adjacent odd elements values.
        vector<int> choice_one(n), choice_two(n);
        //idx_one is for choice_one vector. 
        int idx_one = 0, idx_two = 1;
        for(int i = 0; i < n; i++){
            //once idx_one crosses or equals to value of n, then put it equal to 1 as we need to start filling the odd indices.
            if(idx_one >= n){
                idx_one = 1;
            }
            choice_one[idx_one] = arr[i];
            idx_one += 2;
        }
        //idx_two is for choice_two vector.
        for(int i = 0; i < n; i++){
            //once idx_two crosses or equals to value of n, then put it equal to 0 as we need to start filling the even indices.
            if(idx_two >= n){
                idx_two = 0;
            }
            choice_two[idx_two] = arr[i];
            idx_two += 2;
        }
        if(verify_one(choice_one, n)){
            for(int i = 0; i < n; i++){
                cout << choice_one[i] << " ";
            }
            cout << endl;
        }else if(verify_two(choice_two, n)){
            for(int i = 0; i < n; i++){
                cout << choice_two[i] << " ";
            }
            cout << endl;
        }else{
            cout << -1 << endl;
        }
    }
    return 0;
}
