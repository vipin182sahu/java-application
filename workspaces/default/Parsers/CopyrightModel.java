
class CopyrightModel {

	public String licence_url;
	public String licence;
	public String holder;
	public String logo;
	public String holder_url;
	public int year;

	public CopyrightModel(String licence_url, String licence, String holder, String logo, String holder_url, int year) {

		this.licence_url = licence_url;
		this.licence = licence;
		this.holder = holder;
		this.logo = logo;
		this.holder_url = holder_url;
		this.year = year;

	}

}