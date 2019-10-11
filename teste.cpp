http://mirror.ufscar.br/ubuntu-releases/xenial/

#include <stdio.h>
#include <string.h>
#include <iostream>

using namespace std;

void busca(char frase[], char vetor[],char vetor2[]){
    int j, i;
    for(j=0;j<strlen(frase);j++){
        for(i=0;i<strlen(vetor);i++){
            if(frase[j] == vetor[i] && toupper(frase[j]){
                frase[i] = vetor2[i];
            }else if(frase[j] == vetor2[i]){
                frase[i] = vetor2[i];
            }
        }
    }
}

int main(){

    short int c, n;

    while(scanf("%hd%hd",&c, &n) != EOF){

        char t1[c+1], t2[c+1];
        char frases[n][1001];
        cin >> t1 >> t2;
        int i;
        for(i=0;i<n;i++){
            setbuf(stdin, NULL);
            scanf("%[^\n]s", frases[i]);
        }
        int j, b;
        for(i=0;i<n;i++){
            busca(frases[i], t1, t2);
        }
        for(i=0;i<n;i++)
            cout << frases[i] << endl;
    }




return 0;
}
