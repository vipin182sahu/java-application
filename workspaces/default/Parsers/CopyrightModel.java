
class CopyrightModel {

	public String licence_url;
	public String licence;
	public String holder_url;
	public String logo;
	public int year;
	public String holder;

	public CopyrightModel(String licence_url, String licence, String holder_url, String logo, int year, String holder) {

		this.licence_url = licence_url;
		this.licence = licence;
		this.holder_url = holder_url;
		this.logo = logo;
		this.year = year;
		this.holder = holder;

	}

}