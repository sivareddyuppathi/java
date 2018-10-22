package diceGame1;



class DiceConditions extends Thread{
	Player lock;
	
	int num[]=new int[2];
	
	
	public DiceConditions(Player lock) {
		
		this.lock = lock;
	}


public int rollDice()
{
	int total=0;
	
	int facevalue1=(int)(Math.random()*6+1);	
    return facevalue1;
	}

	public void run() {
		int sum=0;
		for(int i=0;i<=50;i++) {
			
			
			if(num[0]>=50||num[1]>=50)
			{
				if(num[0]>num[1])
				System.out.println(Thread.currentThread().getName()+""+num[0]);	
				else
					System.out.println(Thread.currentThread().getName()+""+num[1]);
				
				
				i=50;
		         break;
			}
			else {
			
			synchronized (lock) 
		    {
				
				
				
				if(Thread.currentThread().getName().equalsIgnoreCase("t1"))
				{
//					System.out.println("   if()  Thread..Player.."+Thread.currentThread().getName());
					
					
					if(i%2==0)
					{
						
						num[0]=num[0]+rollDice();
						System.out.println("playing Game..."+Thread.currentThread().getName()+"  with score.."+num[0]);	
						try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					
					else {
						
						lock.notify();
						
					}
					
				}
				else {
					
					if(i%2==1)
					{
						
						num[1]=num[1]+rollDice();
						
						System.out.println("playing Game..."+Thread.currentThread().getName()+"  with score.."+num[1]);
						try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					else {
						
						lock.notify();
						
						
					}
				}
				
		
				
				
			
		}
		
	}
		}
		
	}
	
}
