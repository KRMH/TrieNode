/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trie.trienode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kristel
 */


class TrieNode {
    Map<Character, TrieNode> children;
    boolean isWord;

    TrieNode() {
        children = new HashMap<>();
        isWord = false;
    }
}

public class Trie {
    //private Trie [] children = new Trie[26];
    //private boolean isWord = false;
    private TrieNode root;

    public Trie (){
        root = new TrieNode();
    }
    /**
    * insert words in root
    * @param word
    */
    public void insertWord (String word){
        TrieNode trav = root; 
        for (char alphabet : word.toCharArray()){
            System.out.println("alphabet: " + alphabet);
            if (!trav.children.containsKey(alphabet)){
                trav.children.put(alphabet, new TrieNode());
            }

            trav = trav.children.get(alphabet);
            System.out.println("trav: " + trav);
            
        }
        trav.isWord = true;
    }
    /**
    * find a given word in the inserts 
    * @param word
     * @return 
    */
    public boolean queryWord (String word){
        TrieNode trav = root; 
        for (char alphabet : word.toCharArray()){
            if (trav.children.containsKey(alphabet)){
                trav = trav.children.get(alphabet);
            }else{
                return false;
            }
        }
        return trav != null && trav.isWord;  
    }

    /**
     * Search for the words that might be autocompleted with
     * @param root
     * @param letters
     * @return 
    */
//    public List<String> autoSearch(Trie root, String letters){
//        List <String> autoCompleteWords = new ArrayList<>();
//        
//        for (char alphabet : letters.toCharArray()){
//            Trie currentNode = root.children[alphabet - 'a'];
//            
//            if (currentNode == null){
//                return autoCompleteWords;
//            }
//        }
//        return autoCompleteWords;
//    }
    /**
     * @param currentNode
     * @param autoCompleteWords
     * @param letters
    */
//    public void searchWords(Trie currentNode, List<String> autoCompleteWords, String letters){
//        if (currentNode == null) return;
//        if (currentNode.isWord) {
//            autoCompleteWords.add(letters);
//        }
//        for (int letter : currentNode){
//System.out.println();
//        }
//    }
}
