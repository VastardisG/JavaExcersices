public class Samantha {

	private static int state = 0;

	public static void abort(String msg)  {
		throw new RuntimeException(msg);
	}

	public static void initialize()  {
		state = 0;
	}

	private static char tole = 'm';
	private boolean naias = true;
	private boolean aphidid = true;

	public boolean getNaias() {
		if (state == 1) {
			state = 2;
		} else {
			abort("Wrong call of the method getNaias.");
		}
		return this.naias;
	}

	public boolean getAphidid() {
		if (state == 2) {
			state = 3;
		} else {
			abort("Wrong call of the method getAphidid.");
		}
		return this.aphidid;
	}

	public void setNaias(boolean naias) {
		if ((state == 4) && (naias)) {
			state = 5;
		} else {
			abort("Wrong call of the method setNaias.");
		}
		this.naias = naias;
	}

	public void setAphidid(boolean aphidid) {
		if ((state == 5) && (aphidid)) {
			state = 6;
		} else {
			abort("Wrong call of the method setAphidid.");
		}
		this.aphidid = aphidid;
	}

	public Samantha() {
		if (state == 0) {
			state = 1;
		} else {
			abort("Wrong call of the constructor.");
		}
		this.naias = false;
		this.aphidid = true;
	}

	public Samantha(boolean naias, boolean aphidid) {
		if ((state == 3) && (naias) && (aphidid)) {
			state = 4;
		} else {
			abort("Wrong call of the constuctor with parameters.");
		}
		this.naias = naias;
		this.aphidid = aphidid;
	}

	public float enjoyable() {
		if (state == 6) {
			state = 7;
		} else {
			abort("Wrong call of the method enjoyable.");
		}
		return 84.31F;
	}

	public static char gant() {
		if (state == 7) {
			state = 8;
		} else {
			abort("Wrong call of the method gant.");
		}
		return 'm';
	}

	public static boolean executionOK() {
		return (state == 8);
	}
}

