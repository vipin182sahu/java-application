
class CopyrightModel {

	public String holder_url;
	public String licence_url;
	public String holder;
	public String logo;
	public String licence;
	public int year;

	public CopyrightModel(String holder_url, String licence_url, String holder, String logo, String licence, int year) {

		this.holder_url = holder_url;
		this.licence_url = licence_url;
		this.holder = holder;
		this.logo = logo;
		this.licence = licence;
		this.year = year;

	}

}