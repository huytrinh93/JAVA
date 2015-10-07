
public class manipulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 64;
		String a = getBits(x);
		System.out.println(a);
		x >>= 1;
		a = getBits(x);
		System.out.println(a);
	}
	private static String getBits( int value )
	   {
	      int displayMask = 1 << 31;
	      StringBuffer buf = new StringBuffer( 35 );

	      for ( int c = 1; c <= 32; c++ ) {
	         buf.append(
	            ( value & displayMask ) == 0 ? '0' : '1' );
	         value <<= 1;

	         if ( c % 8 == 0 )
	            buf.append( ' ' );
	      }

	      return buf.toString();
	   }

}
