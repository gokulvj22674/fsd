package org.cts;

public class Drugs implements Musician, Sana {

	@Override
	public void Thenmozhi() {
		System.out.println("vibe for heart breaks");
		
	}

	@Override
	public void KadhalKanave() {
		System.out.println("vibe for firstsight");
		
	}

	@Override
	public void AsaiOruPulveli() {
		System.out.println("vibe for rains");
		
	}

	@Override
	public void Yuvan() {
		System.out.println("yuvan");
		
	}
	public static void main(String[] args) {
		Drugs d= new Drugs();
		d.Thenmozhi();
		d.AsaiOruPulveli();
		d.KadhalKanave();
		d.Yuvan();
	}

		
	}


