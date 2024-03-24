package Tugas6;

public class HotelService28 {
    Hotel28 listMhs[] = new Hotel28[5];
    int idx;

    void tambah(Hotel28 m) {
        if(idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }      
        }
        void tampil(){
            for(Hotel28 m : listMhs){
                m.tampil();
                System.out.println("-----------------------------");
            }
        }
        void bubbleSort(){
            for(int i=0; i<listMhs.length-1; i++){
                for(int j=1; j<listMhs.length-i; j++){
                    if(listMhs[j].harga > listMhs[j-1].harga){

                        Hotel28 tmp = listMhs[j];
                        listMhs[j] = listMhs[j-1];
                        listMhs[j-1] = tmp;
                    }
                }      
            }
        }  
        void selectionSort() {
            for(int i = 0; i<listMhs.length-1; i++){
                int idxMin = i;
                for(int j=i+1; j<listMhs.length; j++) {
                    if(listMhs[j].harga < listMhs[idxMin].harga){
                        idxMin = j;
                    }

                }
                Hotel28 tmp  =  listMhs[idxMin];
                listMhs[idxMin] = listMhs[i];
                listMhs[i] = tmp;
                }
            }      
        }