
class CopyrightModel {

	public String licence_url;
	public String holder_url;
	public String holder;
	public int year;
	public String logo;
	public String licence;

	public CopyrightModel(String licence_url, String holder_url, String holder, int year, String logo, String licence) {

		this.licence_url = licence_url;
		this.holder_url = holder_url;
		this.holder = holder;
		this.year = year;
		this.logo = logo;
		this.licence = licence;

	}

}