package os2hc;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;

public class Oremix {
	
	@CsvCustomBindByName(column = "Ore Name", required = false, converter = Veinrenamer.class)
	private String OreName;
	@CsvCustomBindByName(column = "Primary", required = false, converter = MaterialRenamer.class)
	private String Primary = "";
	@CsvCustomBindByName(column = "Secondary", required = false, converter = MaterialRenamer.class)
	private String Secondary = "";
	@CsvCustomBindByName(column = "Inbetween", required = false, converter = MaterialRenamer.class)
	private String Inbetween = "";
	@CsvCustomBindByName(column = "Around", required = false, converter = MaterialRenamer.class)
	private String Around = "";
	@CsvBindByName(column = "ID	", required = false)
	private String ID = "";
	@CsvBindByName(column = "Tier", required = false)
	private String Tier = "";
	@CsvBindByName(column = "Height", required = false)
	private String Height = "";
	@CsvBindByName(column = "Density", required = false)
	private int Density;
	@CsvBindByName(column = "Size", required = false)
	private int Size;
	@CsvBindByName(column = "Weight", required = false)
	private int Weight;
	@CsvCustomBindByName(column = "Overworld", required = false, converter = XtoBool.class)
	private boolean Overworld;
	@CsvCustomBindByName(column = "Nether", required = false, converter = XtoBool.class)
	private boolean Nether;
	@CsvCustomBindByName(column = "End", required = false, converter = XtoBool.class)
	private boolean End;
	@CsvCustomBindByName(column = "Moon", required = false, converter = XtoBool.class)
	public boolean Moon;
	@CsvCustomBindByName(column = "End Asteroids", required = false, converter = XtoBool.class)
	public boolean EA;
	@CsvCustomBindByName(column = "AsteroidBelt", required = false, converter = XtoBool.class)
	public boolean Astroids;
	@CsvCustomBindByName(column = "Barnard C", required = false, converter = XtoBool.class)
	public boolean BC;
	@CsvCustomBindByName(column = "Barnard E", required = false, converter = XtoBool.class)
	public boolean BE;
	@CsvCustomBindByName(column = "Barnard F", required = false, converter = XtoBool.class)
	public boolean BF;
	@CsvCustomBindByName(column = "Mars", required = false, converter = XtoBool.class)
	public boolean Mars;
	@CsvCustomBindByName(column = "Callisto", required = false, converter = XtoBool.class)
	public boolean Callisto;
	@CsvCustomBindByName(column = "Centauri Bb", required = false, converter = XtoBool.class)
	public boolean Centauri;
	@CsvCustomBindByName(column = "Ceres", required = false, converter = XtoBool.class)
	public boolean Ceres;
	@CsvCustomBindByName(column = "Twilight Forest", required = false, converter = XtoBool.class)
	public boolean TF;
	@CsvCustomBindByName(column = "Deep Dark", required = false, converter = XtoBool.class)
	public boolean DD;
	@CsvCustomBindByName(column = "Phobos", required = false, converter = XtoBool.class)
	public boolean Phobos;
	@CsvCustomBindByName(column = "Deimos", required = false, converter = XtoBool.class)
	public boolean Deimos;
	@CsvCustomBindByName(column = "Europa", required = false, converter = XtoBool.class)
	public boolean Europa;
	@CsvCustomBindByName(column = "Ganymede", required = false, converter = XtoBool.class)
	public boolean Ganymede;
	@CsvCustomBindByName(column = "Io", required = false, converter = XtoBool.class)
	public boolean Io;
	@CsvCustomBindByName(column = "Venus", required = false, converter = XtoBool.class)
	public boolean Venus;
	@CsvCustomBindByName(column = "Mercury", required = false, converter = XtoBool.class)
	public boolean Mercury;
	@CsvCustomBindByName(column = "Enceladus", required = false, converter = XtoBool.class)
	public boolean Enceladus;
	@CsvCustomBindByName(column = "Titan", required = false, converter = XtoBool.class)
	public boolean Titan;
	@CsvCustomBindByName(column = "Miranda", required = false, converter = XtoBool.class)
	public boolean Miranda;
	@CsvCustomBindByName(column = "Oberon", required = false, converter = XtoBool.class)
	public boolean Oberon;
	@CsvCustomBindByName(column = "Triton", required = false, converter = XtoBool.class)
	public boolean Triton;
	@CsvCustomBindByName(column = "Proteus", required = false, converter = XtoBool.class)
	public boolean Proteus;
	@CsvCustomBindByName(column = "Pluto", required = false, converter = XtoBool.class)
	public boolean Pluto;
	@CsvCustomBindByName(column = "Kuiper Belt", required = false, converter = XtoBool.class)
	public boolean KB;
	@CsvCustomBindByName(column = "Haumea", required = false, converter = XtoBool.class)
	public boolean Haumea;
	@CsvCustomBindByName(column = "Makemake", required = false, converter = XtoBool.class)
	public boolean Makemake;
	@CsvCustomBindByName(column = "Vega B", required = false, converter = XtoBool.class)
	public boolean VB;
	@CsvCustomBindByName(column = "T Ceti E", required = false, converter = XtoBool.class)
	public boolean TcetiE;


	
	
	public Oremix() {
	}
	
	public void setOreName(String s) {
		this.OreName = s;
	}
	public void setPrimary(String s) {
		this.Primary = s;
	}
	public void setSecondary(String s) {
		this.Secondary = s;
	}
	public void setInbetween(String s) {
		this.Inbetween = s;
	}
	public void setAround(String s) {
		this.Around = s;
	}
	public void setID(String s) {
		this.ID = s;
	}
	public void setTier(String s) {
		this.Tier = s;
	}
	public void setHeight(String s) {
		this.Height = s;
	}
	public void setDensity(int i) {
		this.Density = i;
	}
	public void setSize(int i) {
		this.Size = i;
	}
	public void setWeight(int i) {
		this.Weight = i;
	}
	public void setOverworld(boolean s) {
		this.Overworld = s;
	}
	public void setNether(boolean s) {
		this.Nether = s;
	}
	public void setEnd(boolean s) {
		this.End = s;
	}
	
	public String getOreName() {
		return this.OreName;
	}
	
	public String getPrimary() {
		return this.Primary;
	}
	public String getSecondary() {
		return this.Secondary;
	}
	public String getInbetween() {
		return this.Inbetween;
	}
	public String getAround() {
		return this.Around;
	}
	public String getID() {
		return this.ID;
	}
	public String getTier() {
		return this.Tier;
	}
	public String getHeight() {
		return this.Height;
	}
	public int getDensity() {
		return this.Density;
	}
	public int getSize() {
		return this.Size;
	}
	public int getWeight() {
		return this.Weight;
	}
	public int getMinY() {
		calculateminmax();
		return this.miny;
	}
	public int getMaxY() {
		calculateminmax();
		return this.maxy;
	}
	public boolean getOverworld() {
		return this.Overworld;
	}
	public boolean getNether() {
		return this.Nether;
	}
	public boolean getEnd() {
		return this.End;
	}
	
	private int miny,maxy;
	
	private void calculateminmax() {
		this.miny=Integer.parseInt(this.Height.split("-")[0]);
		this.maxy=Integer.parseInt(this.Height.split("-")[1]);
	}
	
	public void setMinY(int i) {
		this.miny=i;
	}
	public void setMaxY(int i) {
		this.maxy=i;
	}
	
	public String getHeightcalced() {
		return new String (this.miny+"-"+this.maxy);
	}
	
}
