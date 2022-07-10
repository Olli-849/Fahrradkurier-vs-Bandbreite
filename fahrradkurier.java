package kurier;

import javax.swing.JOptionPane;

public class Fahrradkurier2
{
	public static void main(String[] args)
	{
		String s_f_kurier_spd = JOptionPane.showInputDialog("Bitte durchschnittliche Geschwindigkeit des Fahrradkuriers in km/h eingeben:");  // Geschwindigkeit des Fahrradkuriers (km/h)
		int f_kurier_spd = Integer.parseInt(s_f_kurier_spd);
		
		String s_dat_stor_cnt = JOptionPane.showInputDialog("Bitte Anzahl der Datenträger eingeben:");  // Tragfähigkeit als Anzahl Datenträger
		int dat_stor_cnt = Integer.parseInt(s_dat_stor_cnt);
		
		String s_dat_stor_sz = JOptionPane.showInputDialog("Bitte Speichergröße der Datenträger in GB eingeben:");  // Speichergröße je Datenträger (Gigabyte)
		double dat_stor_sz = Double.parseDouble(s_dat_stor_sz);
		
		String s_bndw = JOptionPane.showInputDialog("Bitte Bandbreite in Megabit/s eingeben:");  // Bandbreite der Leitung in Megabit/s
		double bndw = Double.parseDouble(s_bndw); 
		
		double dat_sz = dat_stor_sz * dat_stor_cnt;  // Größe der maximalen Speichermenge, die der Kurier transportieren kann (Gigabyte)
		double bndw_conv = bndw / (1000*8);  // Umwandlung Megabit zu Gigabyte
		double dat_time = dat_sz / bndw_conv;  // Zeitdauer (in Sekunden) um dieselbe Datenmenge zu übertragen
		double f_kurier_dist = f_kurier_spd * (dat_time / 3600);  // Gswdgk. * Zeitdauer der Übertragung = Strecke, die der Kurier bis dahin schafft (dat-Time in Stunden)
		
		System.out.println("Speichermenge: " + dat_sz + " GB (bei " + dat_stor_cnt + "x " + dat_stor_sz + " GB)");
		System.out.println("Dauer der Übertragung bei " + (int) bndw + " Mbit/s: " + (int) dat_time + " Sekunden");
		System.out.println("Strecke, die der Kurier mit " + f_kurier_spd + " km/h bis dahin zurückgelegt hat: " + f_kurier_dist + " km");
	}
}
