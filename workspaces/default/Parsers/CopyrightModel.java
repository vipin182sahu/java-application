
class CopyrightModel {

	public String holder_url;
	public String holder;
	public String logo;
	public String licence_url;
	public String licence;
	public int year;

	public CopyrightModel(String holder_url, String holder, String logo, String licence_url, String licence, int year) {

		this.holder_url = holder_url;
		this.holder = holder;
		this.logo = logo;
		this.licence_url = licence_url;
		this.licence = licence;
		this.year = year;

	}

}