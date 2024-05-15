package Praktikum2;
public class SingleLinkedList28 {
    Node28 head, tail;
      
    boolean isEmpty(){
      return head == null;
    }
    void print(){
      if(!isEmpty()){
          Node28 temp = head;
          System.out.print("Isi Linked List: \t");
          while(temp != null){
              System.out.print(temp.data + "\t");
              temp = temp.next;
          }
          System.out.println("");
      } else {
          System.out.println("Linked List kosong ");
      }
    }
    void addFirst(int input){
      // node baru yang di tambahkan berisi data melalui parameter
      // pada method addLast
      Node28 ndInput = new Node28(input, null);
      if(isEmpty()){  // jika kosong, maka peran  head dana tail
                      // harus dimiliki node yang sama
        head = ndInput;
        tail = ndInput;
      } else {
          ndInput.next = head;
          head = ndInput;
      } 
    } 
    void addLast(int input) {
      //node baru yang ditambahkan berisi data melalui parameter
      //pada method addLast
      Node28 ndInput = new Node28(input, null); 
      if(isEmpty()){// jika kosong, maka peran head dan tail 
                    // harus dimiliki node yang sama                
        head = ndInput;
        tail = ndInput;
      } else {
        tail.next = ndInput;
        tail  = ndInput;
      } 
    }
    void insertAfter(int key, int input){
      Node28 ndInput =  new Node28(input, null);
      Node28 temp = head;
      do{
          if(temp.data == key){
              ndInput.next  = temp.next;
              temp.next = ndInput;
              if(ndInput.next == null){   // jika tidak ada node selanjutnya
                                          // maka jadikan ndInput sebagai tail
                  tail=ndInput;
                  break;// jangan lupa di rem, jangan gas terus!
              }
          }
          temp = temp.next;
      } while(temp != null); // selamat maish ada node, lanjutkan
    }
    void insertAt(int index, int input){
      // pastikan operasi dari method ini adalah menggeser nilai
      // node yang terletak di indeks dan node tersebut berpindah
      // satu indeks setelahnya
      if(index < 0) {
          System.out.println("perbaiki logikanya!" 
                  + " kalau indeksnya -1 bagaimana???");
      }else if(index == 0){
          addFirst(input);
      } else {
          Node28 temp = head;
          for(int i = 0; i < index -1 ; i++){
              temp = temp.next;
          }
          temp.next= new Node28(input, temp.next);
          if(temp.next.next==null){
              tail=temp.next;
          }
      } 
    }
    int getData(int index){
        Node28 temp = head;
        for(int i =0; i < index - 1; i++){
            temp = temp.next;
        }
        return temp.next.data;
    }
    int indexOf(int key) {
        Node28 temp = head;
        int index = 0;
        while(temp != null && temp.data != key){
            temp = temp.next;
            index++;
        }
        if(temp != null) {
            return index;
        } else{
            return -1;
        }
    }
    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong,"
                    + "tidak dapat dihapus");
            }else if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
        }
    void removeLast(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong"
                    + "tidak dapat dihapus");
        } else if(head == tail){
            head = tail = null;
        } else {
            Node28 temp = head;
            while(temp.next != tail){
                temp= temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    void remove(int key) {
        if(isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else {
            Node28 temp = head;
            if(head.data == key) {
                removeFirst();
            } else {
                while(temp.next != null) {
                    if(temp.next.data == key) {
                        temp.next = temp.next.next;
                        if(temp.next == null) {
                            tail = temp;
                        }
                        break;
                    }
                    temp = temp.next;
                }
            }
        }
    }
    
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node28 temp = head;
            for (int i = 0; i < index -1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
            tail = temp;
            } 
        }
    } 
}