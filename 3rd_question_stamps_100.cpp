#include<bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
	    int n;
	    cin >> n;
	    string s;
	    cin >> s;
	    
	    //to count the one that is appearing first
	    int count_one = 0;
	    
	    //should only check till (n - 2)th position
	    //ones in the last two positions cannot be updated untill and unless we find a one in the first (n - 3) positions
	    for(int i = 0; i < n - 2; i++){
	        //if one is there in the present index of the string and previously we found a one, then we will update the present index value to 0
	        if(s[i] == '1' and count_one > 0){
	            s[i] = '0';
	        }else if(s[i] == '1'){
	            count_one++;
	        }
	    }
	    
	    //if we found a one, then even the values on the last three positions of the string will also be updated to zero
	    if(count_one > 0){
	        for(int i = n - 2; i < n; i++){
	            s[i] = '0';
	        }
	    }
	    cout << s << endl;
	}
	return 0;
}
