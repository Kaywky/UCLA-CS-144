import java.security.*;
import java.nio.file.*;


public class ComputeSHA {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Path path = Paths.get(args[0]);
		byte[] olddata = Files.readAllBytes(path);
		
		MessageDigest md = MessageDigest.getInstance("SHA-1");
		byte[] data =  md.digest(olddata);
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<data.length; i++){
			sb.append(Integer.toString((data[i] & 0xff)+0x100, 16).substring(1));
		}
		
		System.out.println(sb.toString());

	}

}
