package com.jagdeep.ds.tree;

import java.util.ArrayList;

public class NTNode {
    int key;
    ArrayList<NTNode> children;

    public NTNode(int key) {
        this.key = key;
        children = new ArrayList<>();
    }
}
