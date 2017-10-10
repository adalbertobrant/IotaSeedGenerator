#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include<string.h>

int main(void){

    char nome_do_arquivo[255],biblioteca[28]={"ABCDEFGHIJKLMNOPQRSTUVXYWZ9"},seed[81];
    int i,tamanho;

    srand(time(NULL));

    printf("ATENCAO A SEED SERA GERADA SEGUINDO ESSAS LETRAS E NUMERO 9 \n\n%s\n===========================================\n",biblioteca);
    printf("\n\n\nATENCAO O TAMANHO DEVE SER ENTRE 30 A 81\n\n ");
    do{scanf("%d",&tamanho);
    if (tamanho<30||tamanho>81)printf("Digite um numero entre 30 e 81\n");}
    while(tamanho<30||tamanho>81);

    gets(stdin);/* tira o \n do buffer */


    FILE *arq;
    printf("\n\n\nDigite o nome do Arquivo a ser criado\n\n");
    gets(nome_do_arquivo);

    arq=fopen(nome_do_arquivo,"w+a+");

    if(arq==NULL){
        printf("ERRO na ABERTURA\n");
        fclose(arq);
    }

    printf("Gerando SEED\n\n\n");
    for(i=0;i<tamanho;i++){
        seed[i] = biblioteca[rand()%27];
        }
        printf("SEED = %d\n",strlen(seed));


    printf("Seed Gerada com Sucesso\n\n %s \n",seed);

    fprintf(arq,"SEED CARTEIRA IOTA \n\n\n    %s",seed);

    fclose(arq);


    return 0;

    }
