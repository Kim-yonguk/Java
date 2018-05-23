package Prim;

import java.util.Comparator;

class Comp implements Comparator<Node>{ //비용에 대한 Min Heap을 만들기 위한 우선순위 큐의 Comparator
    @Override
    public int compare(Node arg0, Node arg1) {
    	return arg0.v > arg1.v ? 1 : -1;
    }
     
}