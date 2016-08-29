
class CopyrightModel {

	public String holder_url;
	public String holder;
	public int year;
	public String licence;
	public String licence_url;
	public String logo;

	public CopyrightModel(String holder_url, String holder, int year, String licence, String licence_url, String logo) {

		this.holder_url = holder_url;
		this.holder = holder;
		this.year = year;
		this.licence = licence;
		this.licence_url = licence_url;
		this.logo = logo;

	}

}