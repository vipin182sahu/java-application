
class CopyrightModel {

	public String licence_url;
	public String logo;
	public String holder;
	public String holder_url;
	public int year;
	public String licence;

	public CopyrightModel(String licence_url, String logo, String holder, String holder_url, int year, String licence) {

		this.licence_url = licence_url;
		this.logo = logo;
		this.holder = holder;
		this.holder_url = holder_url;
		this.year = year;
		this.licence = licence;

	}

}