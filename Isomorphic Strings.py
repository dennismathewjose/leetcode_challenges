/*Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Input: s = "egg", t = "add"
Output: true

Input: s = "foo", t = "bar"
Output: false

Input: s = "paper", t = "title"
Output: true
*/
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(set(s)) == len(set(t)) == len(set(zip(s,t))):
            return True
        else:
            return False