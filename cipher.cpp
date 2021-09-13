#include <iostream>
using namespace std;

string additive_encrypt(string text, int s)
{
	string result = "";
	for (int i=0;i<text.length();i++)
	{
		if (isupper(text[i]))
			result += char(int(text[i]+s-65)%26 +65);

    	else
	    	result += char(int(text[i]+s-97)%26 +97);
	}
	return result;
}



string additive_decrypt(string text, int s)
{
	string result = "";
    s = 26 - s;
	for (int i=0;i<text.length();i++)
	{
		if (isupper(text[i]))
			result += char(int(text[i]+s-65)%26 +65);

	    else
		    result += char(int(text[i]+s-97)%26 +97);
	}
	return result;
}




string multiplicative_encrypt(string text, int a)
{
	string result = "";
	for (int i = 0; i < text.length(); i++)
	{
		if(text[i]!=' ')
			result = result +
						(char) (((a * (text[i]-'A') )  % 26) + 'A');
		else
			result += text[i];	
	}
	return result;
}

string multiplicative_decrypt(string text, int a)
{
	string result = "";
	int a_inv = 0;
	int flag = 0;
	
	for (int i = 0; i < 26; i++)
	{
		flag = (a * i) % 26;
		if (flag == 1)
		{
			a_inv = i;
		}
	}
	for (int i = 0; i < text.length(); i++)
	{
		if(text[i]!=' ')
			result = result +
					(char) (((a_inv * (text[i]+'A') % 26)) + 'A');
		else
			result += text[i];
	}

	return result;
}




string affine_encrypt(string text, int a, int b)
{
	
	string result = "";
	for (int i = 0; i < text.length(); i++)
	{
		if(text[i]!=' ')
			result = result +
						(char) ((((a * (text[i]-'A') ) + b) % 26) + 'A');
		else
			result += text[i];	
	}
	return result;
}

string affine_decrypt(string text, int a, int b)
{
	string result = "";
	int a_inv = 0;
	int flag = 0;
	
	for (int i = 0; i < 26; i++)
	{
		flag = (a * i) % 26;
		if (flag == 1)
		{
			a_inv = i;
		}
	}
	for (int i = 0; i < text.length(); i++)
	{
		if(text[i]!=' ')
			result = result +
					(char) (((a_inv * ((text[i]+'A' - b)) % 26)) + 'A');
		else
			result += text[i];
	}

	return result;
}



int main()
{
	string text;
	cout<<"Enter text message to be encrypted or decrypted: ";
	getline(cin,text);
	int s, m;
	cout << "Enter Additive Key: ";
	cin >> s;
	cout << "Enter Multiplicative Key: ";
	cin >> m;

	cout << "\nEntered Text: " << text << endl;
    string additive_encrypted = additive_encrypt(text, s);
	cout << "\nAdditive Caesar Cipher Encrypted Text: " << additive_encrypted << endl;

    string additive_decrypted = additive_decrypt(additive_encrypted, s);
    cout << "Additive Caesar Cipher Decrypted Text: " << additive_decrypted <<endl;

	string multiplicative_encrypted = multiplicative_encrypt(text, m);
	cout << "\nMultiplicative Caesar Cipher Encrypted Text: " << multiplicative_encrypted << endl;

    string multiplicative_decrypted = multiplicative_decrypt(multiplicative_encrypted, m);
	cout << "Multiplicative Caesar Cipher Decrypted Text: " << multiplicative_decrypted << endl;

	string affine_encrypted = affine_encrypt(text, m, s);

	cout << "\nAffine Caesar Cipher Encrypted Text: " << affine_encrypted << endl;

    string affine_decrypted = affine_decrypt(affine_encrypted, m, s);
    cout << "Affine Caesar Cipher Decrypted Text: " << affine_decrypted <<"\n"<<endl;
	return 0;
}