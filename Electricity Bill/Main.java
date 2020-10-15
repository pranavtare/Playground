#include<iostream>
int main()
{
  int unit, total_amt;
  float amt, sur_charge;
  std::cin>>unit;
  if(unit <= 200)
  {
    amt = unit * 0.50;
  }else if(unit <= 400)
  {
    amt = 100 + ((unit-50) * 0.65);
  }else if(unit <= 600)
  {   
    amt = 200 + ((unit-150) * 0.80);
  }else
   { amt = 425 + ((unit-250) * 1.25);
  }
  //sur_charge = amt * 0.20;
  //total_amt  = amt + sur_charge;
   total_amt = amt ;
  std::cout<<"Rs."<<total_amt;
  
  return 0;

}
 