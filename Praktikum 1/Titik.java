/**
 * File           : Titik.java		21/02/24
 * Nama penulis   : Rania
 * NIM            : 24060122120013
 * Deskripsi      : Kelas yang berisi main dari Titik
**/

class Titik
{
	//Atribut
	double absis, ordinat;
	static double counterTitik;

	//Konstruktor 
	Titik()
	{
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(double a, double o)
	{
		absis = a;
		ordinat = o;
		counterTitik++;
	}

	void setAbsis (double a)
	{
		absis = a;
	}
	
	void setOrdinat (double o)
	{
		ordinat = o;
	}
	
	double getAbsis()
	{
		return absis;
	}

	double getOrdinat()
	{
		return ordinat;
	}
	
	static double getCounterTitik()
	{
		return counterTitik;
	}
}