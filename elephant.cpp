#include <bits/stdc++.h>
using namespace std;

int main(){
    int x;
    cin >> x;
    if(x <= 5){
        cout << "1";
    }
    else{
        int res;
        res = x/5;
        if(x%5 != 0){
            res++;
            cout << res;
        }
        else{
            cout << res;
        }
    }
    
}
