class Best {

	public static void main(String[] args) {
		if (args.length > 1) {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			String exclamation = "";
			for (int i=0; i<y; i++) {
				exclamation = exclamation + "!";
			}
			for (int i=0; i<x; i++) {
				System.out.println("YOU'RE THE BEST!" + exclamation );
			}
		}  else {
			int x = Integer.parseInt(args[0]);
			for (int i=0; i<x; i++) {
				System.out.println("YOU'RE THE BEST!");
			}
		}	
	}

}