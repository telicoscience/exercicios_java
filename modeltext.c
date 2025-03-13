#include <stdio.h> 
#include <stdlib.h> 

void linha(){
	int j; 
	for(j = 1; j <=20; j++)
		printf("\xDB");
}

int main(){
	linha(); 
	printf("\n\xDBUM PROGRAMA EM C \xDB\n");
	linha();
	return 0; 
}

