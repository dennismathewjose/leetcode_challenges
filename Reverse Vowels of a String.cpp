/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.

Input: s = "hello"
Output: "holle"

Input: s = "leetcode"
Output: "leotcede"
*/

class Solution {
public:
    string reverseVowels(string s) {
        int i ,j;
        char temp;
        for (i = 0, j = s.size()-1; i<=j;){
    if (s[i]=='a'||s[i]=='e'|| s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U'){
             if (s[j] == 'a' || s[j] == 'e' || s[j] == 'i'|| s[j] == 'o' || s[j] == 'u'||s[j] == 'A' || s[j] == 'E' || s[j] == 'I'|| s[j] == 'O' || s[j] == 'U'){
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                    i++;
                    j--;
                }
                else
                    j--;
            }
            else
                i++;
        }
        return s;
        
        
    }
};