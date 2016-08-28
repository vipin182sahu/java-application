
class CopyrightModel {

	public String holder_url;
	public int year;
	public String licence_url;
	public String licence;
	public String logo;
	public String holder;

	public CopyrightModel(String holder_url, int year, String licence_url, String licence, String logo, String holder) {

		this.holder_url = holder_url;
		this.year = year;
		this.licence_url = licence_url;
		this.licence = licence;
		this.logo = logo;
		this.holder = holder;

	}

}