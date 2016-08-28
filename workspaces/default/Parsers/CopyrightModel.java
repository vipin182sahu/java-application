
class CopyrightModel {

	public String holder_url;
	public String holder;
	public String licence;
	public int year;
	public String licence_url;
	public String logo;

	public CopyrightModel(String holder_url, String holder, String licence, int year, String licence_url, String logo) {

		this.holder_url = holder_url;
		this.holder = holder;
		this.licence = licence;
		this.year = year;
		this.licence_url = licence_url;
		this.logo = logo;

	}

}