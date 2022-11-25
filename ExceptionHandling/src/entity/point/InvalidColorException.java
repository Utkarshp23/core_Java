package entity.point;

public class InvalidColorException extends Exception {
		String msg;

		public InvalidColorException() {
			super();
			this.msg = "Invalid color";
		}
		
		public String toString()
		{
			return this.getClass().getName()+":"+msg;
		}
		
}
