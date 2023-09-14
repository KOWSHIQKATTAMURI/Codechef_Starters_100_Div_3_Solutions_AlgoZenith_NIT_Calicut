#include <iostream>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        
        //there are only 3 jars
        //so if two of them have one chocolate each, then all the conditions will be satisfied
        //so the remaining jar can have the rest of the chocolates
        cout << 1 << " " << 1 << " " << n - 2 << endl;
    }
    return 0;
}
