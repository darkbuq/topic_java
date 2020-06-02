package Mud_2;

class InsertRow {
	InsertRow () {}
	
	double[][] test (double[][] m, int r, double[] data) {
		double[][] out = new double[m.length + 1][];
	    for (int i = 0; i < r; i++) {
	        out[i] = m[i];
	    }
	    out[r] = data;
	    for (int i = r + 1; i < out.length; i++) {
	        out[i] = m[i - 1];
	    }
	    return out;
	}
	
	String[][] str_arr_insert (String[][] m, int r, String[] data) {
		String[][] out = new String[m.length + 1][];
	    for (int i = 0; i < r; i++) {
	        out[i] = m[i];
	    }
	    out[r] = data;
	    for (int i = r + 1; i < out.length; i++) {
	        out[i] = m[i - 1];
	    }
	    return out;
	}
}
