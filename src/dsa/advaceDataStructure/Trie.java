/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.advaceDataStructure;

import java.util.HashMap;

/**
 *
 * @author yokukuma
 */
public class Trie {
    private TrieNode root;
    public Trie(){
        root = new TrieNode((char)0);
    }
    
    public void insert(String str){
        int len = str.length();
        TrieNode crawl = root;
        for (int i = 0; i < len; i++) {
            HashMap<Character, TrieNode> child = crawl.getChildren();
            char  ch = str.charAt(i);
            
            // if charactort already exist take node of that charcater for further crawling
            if(child.containsKey(ch)){
                crawl = child.get(ch);
            }else{
                TrieNode temp= new TrieNode(ch);
                child.put(ch, temp);
                crawl = temp;
            }
        }
        crawl.setIsEnd(true);
    }
    
    public String getMatchingPrefix(String str){
        String result = "";
        int len = str.length();
        
        TrieNode crawl = root;
        int prevMatch=0;
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            HashMap<Character, TrieNode> child = crawl.getChildren();
            
            if(child.containsKey(ch)){
                result = result+ch;
                crawl = child.get(ch);
                if(crawl.isEnd()){
                    prevMatch = i+1;
                }
            }else{
                break;
            }
        }
        if(!crawl.isEnd()){
            return result.substring(0, prevMatch);
        }
        
        return result;
    }
    
}

class TrieNode {

    private char value;
    private boolean bIsEnd;
    private final HashMap<Character, TrieNode> children;

    public TrieNode(char ch) {
        value = ch;
        children = new HashMap<>();
        bIsEnd = false;
    }

    public HashMap<Character, TrieNode> getChildren() {
        return children;
    }

    public char getValue() {
        return value;
    }

    public void setIsEnd(boolean val) {
        bIsEnd = val;
    }

    public boolean isEnd() {
        return bIsEnd;
    }

}
