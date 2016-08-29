
class CopyrightModel {

	public String licence_url;
	public int year;
	public String licence;
	public String holder_url;
	public String holder;
	public String logo;

	public CopyrightModel(String licence_url, int year, String licence, String holder_url, String holder, String logo) {

		this.licence_url = licence_url;
		this.year = year;
		this.licence = licence;
		this.holder_url = holder_url;
		this.holder = holder;
		this.logo = logo;

	}

}