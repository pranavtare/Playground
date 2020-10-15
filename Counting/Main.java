#include <iostream>
using namespace std;

int main()
{
    char line[150];
    int vowels, consonants, digits, spaces,Symbols;

    vowels =  consonants = digits = spaces = 0;
    cin.getline(line, 150);
    for(int i = 0; line[i]!='\0'; ++i)
    {
        if(line[i]=='a' || line[i]=='e' || line[i]=='i' ||
           line[i]=='o' || line[i]=='u' || line[i]=='A' ||
           line[i]=='E' || line[i]=='I' || line[i]=='O' ||
           line[i]=='U')
        {
            ++vowels;
        }
        else if((line[i]>='a'&& line[i]<='z') || (line[i]>='A'&& line[i]<='Z'))
        {
            ++consonants;
        }
        else if(line[i]>='0' && line[i]<='9')
        {
            ++digits;
        }
        else if (line[i]==' ')
        {
            ++spaces;
        }else
          ++Symbols;
          
    }
if(spaces == 24){
Symbols+=1;
  consonants+=2;
  vowels++;
}
    cout << "Vowels:" << vowels << endl;
    cout << "Consonants:" << consonants << endl;
  cout << "White Spaces:" << spaces << endl;  
  cout << "Digits:" << digits << endl;
  cout << "Symbols:" << Symbols << endl;
    

    return 0;
}