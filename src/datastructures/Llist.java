package datastructures;

class link {
	
	public int data;
	public link next;
}	
public class Llist {
	
	private link first;
	public Llist(){
		first = null;
	}
	public void insert(int i){
		link lk = new link();
		lk.data = i;
		lk.next = first;
		first = lk;
	}

	public boolean isEmty(){
		return first==null;
	}
	
	public void printList() {
        link currentLink = first;
        System.out.print("List: ");
        while(currentLink != null) {
            System.out.println(currentLink.data);
        }
        System.out.println("");
    }
public static void main(String... args){
		
		Llist list = new Llist();
		for(int i=0;i<10;i++){
			list.insert(i);
		}
		list.printList();
		System.out.println("done");
	}
}


	

