package interviewQ;

public class SecondLongSubSeq {
	public static void main(String[] args) {
        int[] a ={1,1,1,1,4,4,4,4,4,4,4,4,4,4,5,5,5,3,3,2,2,6};
        int max = 0;
        int secMax = 0;
        int maxNum = a[0];
        int secMaxNum = -1;
        int ct = 0;
        for (int i = 0; i < a.length-1; i++) {
			if (a[i]==a[i+1]) {
				ct++;
			} else {
				if (ct>max) {
					secMax = max;
					secMaxNum = maxNum;
					
					max = ct ;
					maxNum = a[i];
				}
				else if (ct>secMax && a[i]!=maxNum) {
					secMax = ct;
					secMaxNum = a[i];
				}
				ct = 0;
			}
		}
        if (ct>max) {
			max = ct;
			maxNum = a[a.length-1];
		}
        if (max>0)
        {
            System.out.println(maxNum+" Is Repeated "+(max+1)+" Times");
            System.out.println(secMaxNum==-1?"There Is No Second Longest SubSequence":(secMaxNum+" Is Repeated "+(secMax+1)+" Times"));

        }
        else
        {
            System.out.println("Element Is Not Repeated !");
        }
	}
}
