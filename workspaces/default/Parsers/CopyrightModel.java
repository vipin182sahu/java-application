
class CopyrightModel {

	public String licence_url;
	public String licence;
	public int year;
	public String logo;
	public String holder;
	public String holder_url;

	public CopyrightModel(String licence_url, String licence, int year, String logo, String holder, String holder_url) {

		this.licence_url = licence_url;
		this.licence = licence;
		this.year = year;
		this.logo = logo;
		this.holder = holder;
		this.holder_url = holder_url;

	}

}