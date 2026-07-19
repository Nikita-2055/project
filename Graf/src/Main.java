import java.util.Scanner;
public class Main {
    public static void main(String argv[]){
        String str[] = {"Ottawa","LosAngeles","NewYork","Chicago"};
        int arr[][] = {{0,0,1,1},{0,0,1,0},{1,1,0,1},{1,0,1,0}};
        for(int i = 0; i < arr.length; i++){
            System.out.print(str[i]+" harevan e = ");
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == 1){
                    System.out.print("  "+str[j]);
                }
            }
            System.out.println("\n");
        }

        String str2[] = {"Ottawa","LosAngeles","NewYork","Chicago"};
        int arr2[][] = {{0,0,14,25},{0,0,40,0},{14,40,0,70},{25,0,70,0}};
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[0].length; j++){
                if(arr2[i][j] > 0){
                    System.out.print(str2[i]+" haru e ");
                    System.out.print(str2[j]);
                    System.out.println("= "+arr2[i][j]);
                }
            }
        }












        System.out.print("input start = ");
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        System.out.print("imput destination = ");
        int dest = scanner.nextInt();
        int arr3[] ={10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000};//pahum enq gagatneri arjqenery
        PriorityQueueMap pq = new PriorityQueueMap();//stexcum enq priorityqueuemap y
        arr3[start]  = 0;//arajin elementy miangamic grum enq zangvaci mej starty 0 arjeqov
        //int arr4[][] = {{0,0,0,0,25,0,1,0,0},{19,2,0,0,0,0,0,1,0},{0,0,0,0,0,1,2,0,0},{2,1,30,0,0,0,0,0,0},{0,0,0,0,1,2,19,0,23},{1,0,0,2,0,0,0,25,0},{0,0,0,0,2,0,0,0,1},{23,0,2,1,0,0,0,0,0},{0,0,0,0,0,30,0,0,2}};//talis enq te amen mi gagat  miusic icnhqanov e heru
        //{23,0,2,1,0,0,0,0,0},{0,0,0,0,2,0,0,0,1},{19,2,0,0,0,0,0,1,0},{1,0,0,2,0,0,0,25,0},{0,0,0,0,25,0,1,0,0},{0,0,0,0,1,2,19,0,23},{2,1,30,0,0,0,0,0,0},{0,0,0,0,0,30,0,0,2},{0,0,0,0,0,1,2,0,0}
        int[][] arr4 = new int[9][9];
        for(int i = 0;i < arr4.length; i++){
            for(int j = 0; j < arr4[0].length; j++){
                arr4[i][j] = 0;
            }
        }
        /*arr4[0][4] = 1;
        arr4[0][5] = 2;
        arr4[0][6] = 19;
        arr4[0][8] = 23;
        arr4[1][5] = 1;
        arr4[1][6] = 2;
        arr4[2][5] = 30;
        arr4[2][8] = 2;
        arr4[3][4] = 2;
        arr4[3][8] = 1;
        arr4[4][0] = 1;
        arr4[4][3] = 2;
        arr4[4][7] = 25;
        arr4[5][0] = 2;
        arr4[5][1] = 1;
        arr4[5][2] = 30;
        arr4[6][0] = 19;
        arr4[6][1] = 2;
        arr4[6][7] = 1;
        arr4[7][4] = 25;
        arr4[7][6] = 1;
        arr4[8][0] = 23;
        arr4[8][2] = 2;
        arr4[8][3] = 1;
         */
        arr4[0][4] = 2;
        arr4[0][5] = 1;
        arr4[0][6] = 20;
        arr4[0][8] = 25;
        arr4[1][5] = 22;
        arr4[1][6] = 18;
        arr4[2][5] = 2;
        arr4[2][8] = 38;
        arr4[3][4] = 30;
        arr4[3][8] = 35;
        arr4[4][0] = 2;
        arr4[4][3] = 30;
        arr4[4][7] = 1;
        arr4[5][0] = 1;
        arr4[5][1] = 22;
        arr4[5][2] = 2;
        arr4[6][0] = 20;
        arr4[6][1] = 18;
        arr4[6][7] = 15;
        arr4[7][4] = 1;
        arr4[7][6] = 15;
        arr4[8][0] = 25;
        arr4[8][2] = 38;
        arr4[8][3] = 35;
        pq.push(start,0,start);//avelacnum enq priorityqueuemap um
        boolean[] cheak = new boolean[arr3.length];
        int[] gagat2 = new int[arr3.length];
        for(int i = 0; i < gagat2.length; i++){
            gagat2[i] = -1;
        }
        //gagatneri qasher  array
        //start dest popoxakanner, cin>>
        //sarqer pirority queue
        //mejn e push anel arajin elemente, starte ira value-ov
        while(!pq.isEmpty()){//stugum enq ete priorityqueuemap y datark chi sharunakum enq cikly
            Zuyg zuyg =  pq.pop();//stexcum enq zuyg anunov class vorpesi pop functiayi jamamanak hanenq gagatneri value ery
            int k = zuyg.key;//gagati indexnenq stanum
            cheak[k] = true;
            System.out.println("key = "+zuyg.key+" value = "+zuyg.value+" key2 = "+zuyg.key2);
            for(int j = 0;j < arr4[k].length; j++){//karj janapari gnelu cikly gagatneri minchev
                if(arr4[k][j] > 0 && !cheak[j]){
                    int aa = arr4[k][j] + arr3[k];
                    if(arr3[j] > aa){
                        arr3[j] = aa;

                        if(j!=dest) {// the enchi e absurd
                            pq.push(j, arr3[j],k);
                        }
                        gagat2[j] = k;
                    }
                }
                //chenq arel stugeli pahy erb sksum e stugel exel e hervan gagatnerum te che
                //texapevelu pahy chem arel mi gagatic mius gagat
            }
        }
        /*System.out.println("patasxan------------------");
        System.out.println(dest);
        System.out.println(gagat2[dest]);
        int x = gagat2[dest];
        System.out.println(gagat2[x]);
        int y = gagat2[x];
        System.out.println(gagat2[y]);
        for(int i = 0; i < arr3.length; i++){
            System.out.println(i+ ": " + arr3[i]+" "+gagat2[i]);
        }

         */
        int[] arr5 = new int[arr3.length];
        for(int i = 0; i < arr5.length; i++){
            arr5[i] = -1;
        }
        int t = 0;
        int count = 0;
        while (gagat2[dest] != -1){
            System.out.println(dest+":"+gagat2[dest]);
            arr5[t++] = dest;
            dest = gagat2[dest];
            count++;
        }
        System.out.println("********************************************************");
        String qaxaqneri_anunner[] = {"Paris","Sydney","Yerevan","NewYork","LosAngeles","Cairo","Chicago","Ottawa","Tokyo"};
        for(int i = count - 1; i>=0 && arr5[i] != -1; i--){
            System.out.println("i=" +i + " "+arr5[i]);
            int qaxaqi_index = arr5[i];
            System.out.println(qaxaqneri_anunner[qaxaqi_index]);
        }
















/*
        PriorityQueueMap n = new PriorityQueueMap();
        n.push(10, 25);
        n.push(5, 36.7);
        n.push(2, 74.1);
        n.push(13, 16.7);
        n.push(8, 52.3);
        n.push(7, 11.65);
        n.push(15, 3.7);
        n.push(17, 46.1);
        n.push(22, 27.7);
        n.push(35, 44.3);
        n.print();
        System.out.println("--------------");
        n.find(2,66.6);
        n.print();


 */


    }
}
