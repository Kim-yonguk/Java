package kruskal;

public class A implements Comparable<A>{
	int s;
	int e;
	int v;
	
	public A(int s,int e,int v) {
		super();
		this.s=s;
		this.e=e;
		this.v=v;
	}

	@Override
	public int compareTo(A o) {
		// TODO Auto-generated method stub
		return o.v >= this.v ? -1 : 1;
	}

	
}
