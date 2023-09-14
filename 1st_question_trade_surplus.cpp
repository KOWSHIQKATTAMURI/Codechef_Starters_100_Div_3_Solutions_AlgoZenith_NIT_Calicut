#include <iostream>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int A_exports, A_imports, B_exports, B_imports;
        cin >> A_exports >> A_imports >> B_exports >> B_imports;
        
        //calculate total exports and total imports
        int total_exports = A_exports + B_exports;
        int total_imports = A_imports + B_imports;
        
        //C will be surplus only if total exports is greater than total imports. Total exports is actually equal to exports made by C. 
        if(total_imports > total_exports){
            cout << "YES" << endl;
        }else{
            cout << "NO" << endl;
        }
    }
    return 0;
}
