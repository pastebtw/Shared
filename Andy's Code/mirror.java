package example;
import java.io.*;
class mirror  {
	static int nextdir;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int length = Integer.parseInt(br.readLine());
		int width = Integer.parseInt(br.readLine());

		int [] [] room = new int [width+1] [length+1];
    //System.out.print(room);
		for (int i = 0; i<length; i++){
			String temps = Integer.toBinaryString(Integer.parseInt(br.readLine()));
			int tempss= Integer.parseInt(temps, 2);
			String [] temp = String.valueOf(tempss).split("");
			
			//System.out.println(temp.length);
			for (int s = 0; s<width; s++){
				if (s<temp.length) {
					room[s][i] = Integer.parseInt(temp[s]);
				}
				else if (i == length-1&&width == s-1) {
					room[s][i]=1;
				}
				else {
					room[s][i]= 0;
				}
				//System.out.print(temp[s]);
      }
    }
	String []temp2= solve(width-1,length-1,1,room,1,width, length,width,length).split(" ");
	
	System.out.println(Integer.parseInt(temp2[0])+" "+Integer.parseInt(temp2[1]));
    //System.out.println(room);
  }
	public static String solve(int swidth,int slength, int direction, int[][] room, int walltype,int lwwidth, int lwlength,int width, int length) {
		
			 // of current wall type is mirror or hole
		if (walltype == 1) { // if wall, what direction is the light going
			lwlength = slength; //latest mirror becomes the current
			lwwidth = swidth; // latest becomes the current
			if (direction == -1) { //if the light came in from the left and is a mirror
				direction = 1; //change direction to right 
				swidth = swidth+1; //head right
				slength = slength -1; // head up
					
					
					
			}
			else if (direction == 1) { // if light came in from the right 
				direction = -1;//direction becomes left
				swidth = swidth-1;// light head 1 left 
				slength = slength -1; // light heads one up
			}
			if (swidth >= width || slength >=length||slength<0||swidth<0) { // if the next space the light is going to is going to be outside the room 
					return lwwidth+" "+lwlength;
				}
			walltype = room [swidth][slength]; // wall type for next wall
		}
		else if (walltype == 0) { //if it is a hole 
			if (direction == -1) { // if direction is left
				swidth = swidth -1; //moves left one
				slength = slength - 1; //move up one
				
			}
			else if (direction == 1) { // if direction is right
				swidth = swidth +1; // move right 
				slength = slength - 1; // move up
				
			}
			if (swidth >= width || slength >=length||slength<0||swidth<0) { // if the next space the light is going to is going to be outside the room 
				return lwwidth+" "+lwlength;
			}
			walltype = room[swidth][slength];// next wall type becomes current
		}
		//System.out.println(swidth+" "+slength );
		//System.out.println("ran");
		//System.out.println(swidth);
		//System.out.println(slength);
			
		return solve(swidth,slength,direction,room,walltype,lwwidth, lwlength,width,length); // run function again for next mirror
				}
		
	}
	
  
  
