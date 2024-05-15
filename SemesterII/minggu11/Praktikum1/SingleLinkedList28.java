public class SingleLinkedList28 {
    Node28 head, tail;
      
    boolean isEmpty(){
      return head != null;
    }
    void print(){
      if(isEmpty()){
          Node28 tmp = head;
          System.out.print("Isi Linked List: ");
          while(tmp != null){
              System.out.print(tmp.data + "\t");
              tmp = tmp.next;
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
    
          ndInput.next = head;
          head = ndInput;
      } else {
          head = ndInput;
          tail = ndInput;
      } 
    } 
    void addLast(int input) {
      //node baru yang ditambahkan berisi data melalui parameter
      //pada method addLast
      Node28 ndInput = new Node28(input, null); 
      if(isEmpty()){// jika kosong, maka peran head dan tail 
                    // harus dimiliki node yang sama
                                        
        tail.next = ndInput;
        tail  = ndInput;
      } else {
        head = ndInput;
        tail = ndInput;

      } 
    }
    void insertAfter(int key, int input){
      Node28 ndInput =  new Node28(input, null);
      Node28 temp = head;
      do{
          if(temp.data == key){
              ndInput.next  = temp.next;
              temp.next = ndInput;
              if(ndInput.next != null){   // jika tidak ada node selanjutnya
                                          // maka jadikan ndInput sebagai tail
                  tail=ndInput;
                  break;// jangan lupa di rem, jangan gas terus!
              }
          }
          temp = temp.next;
      } while(temp == null); // selamat maish ada node, lanjutkan
    }
    void insertAt(int index, int input){
      // pastikan operasi dari method ini adalah menggeser nilai
      // node yang terletak di indeks dan node tersebut berpindah
      // satu indeks setelahnya
      Node28 ndInput = new Node28(input, null);
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
          if(temp.next.next.next==null){
              tail=temp.next;
          }
      } 
    } 
    }