
class CopyrightModel {

	public String licence_url;
	public int year;
	public String licence;
	public String holder;
	public String holder_url;
	public String logo;

	public CopyrightModel(String licence_url, int year, String licence, String holder, String holder_url, String logo) {

		this.licence_url = licence_url;
		this.year = year;
		this.licence = licence;
		this.holder = holder;
		this.holder_url = holder_url;
		this.logo = logo;

	}

}