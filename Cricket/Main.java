#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
//Type your code here.
int curr_balls;
float total_balls, total_runs, curr_runs, no_overs;
float overs_fin, curr_rate, total_rate, over, dot_over;
cin >> total_balls >> total_runs >> curr_runs >> curr_balls;
no_overs = total_balls / 6;
//overs_fin = curr_balls / 6;
over = curr_balls / 6;
dot_over = (curr_balls % 6) * 0.1 ;
overs_fin = over + dot_over;
curr_rate = curr_runs / overs_fin;
total_rate = total_runs / no_overs;
cout << no_overs << endl;
printf("%.1f\n", overs_fin);
printf("%0.1f\n", curr_rate);
printf("%0.1f\n", total_rate);
if(curr_rate > total_rate) {
cout << "Eligible to Win" << endl;
}
else if(curr_rate < total_rate) {
cout << "Not Eligible to Win" << endl;
}
return 0;
}