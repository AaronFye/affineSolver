static​​ char ​​af(char​​ txt,int ​​a,​​int b)​​{
	int​​ num​​ = ​​txt-'a';
	num​​ =​​ (num*a)+b;
	num =​​ num%26;
	return​​(char)​​(num+'a');
}