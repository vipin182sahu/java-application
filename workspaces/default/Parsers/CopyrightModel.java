
class CopyrightModel {

	public String holder_url;
	public int year;
	public String holder;
	public String licence_url;
	public String logo;
	public String licence;

	public CopyrightModel(String holder_url, int year, String holder, String licence_url, String logo, String licence) {

		this.holder_url = holder_url;
		this.year = year;
		this.holder = holder;
		this.licence_url = licence_url;
		this.logo = logo;
		this.licence = licence;

	}

}