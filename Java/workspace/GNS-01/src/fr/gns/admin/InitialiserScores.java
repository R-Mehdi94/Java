package fr.gns.admin;

	public class InitialiserScores {
	
		private int test1;
		private int test2;
		
		public int getTest1() {
			return test1;
		}

		public void setTest1(int test1) {
			this.test1 = test1;
		}

		public int getTest2() {
			return test2;
		}

		public void setTest2(int test2) {
			this.test2 = test2;
		}

		@Override
		public String toString() {
			return "InitialiserScores [test1=" + test1 + ", test2=" + test2 + "]";
		}

		public InitialiserScores(int test1, int test2) {
			this.test1 = test1;
			this.test2 = test2;
		}
		
		
		
		
}
