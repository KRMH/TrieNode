/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trie.trienode;

/**
 *
 * @author kristel
 */
public class Main {
    public static void main (String [] args){
        Trie rootTrie = new Trie();
        rootTrie.insertWord("ask");
        rootTrie.insertWord( "a");
        rootTrie.insertWord("ash");
        rootTrie.insertWord("bow");
        rootTrie.insertWord("be");
        rootTrie.insertWord("been");
        rootTrie.insertWord("bees");
        System.out.println("Does a exist: " + rootTrie.queryWord("a"));
        System.out.println("Does as exist: " + rootTrie.queryWord("as"));
        System.out.println("Does been exist: " + rootTrie.queryWord("been"));
        System.out.println("Does beer exist: " + rootTrie.queryWord("beer"));
    }
}
