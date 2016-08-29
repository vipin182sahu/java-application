
class CopyrightModel {

	public String licence_url;
	public int year;
	public String licence;
	public String logo;
	public String holder_url;
	public String holder;

	public CopyrightModel(String licence_url, int year, String licence, String logo, String holder_url, String holder) {

		this.licence_url = licence_url;
		this.year = year;
		this.licence = licence;
		this.logo = logo;
		this.holder_url = holder_url;
		this.holder = holder;

	}

}