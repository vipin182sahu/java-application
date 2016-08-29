
class CopyrightModel {

	public String licence_url;
	public String licence;
	public int year;
	public String holder_url;
	public String logo;
	public String holder;

	public CopyrightModel(String licence_url, String licence, int year, String holder_url, String logo, String holder) {

		this.licence_url = licence_url;
		this.licence = licence;
		this.year = year;
		this.holder_url = holder_url;
		this.logo = logo;
		this.holder = holder;

	}

}