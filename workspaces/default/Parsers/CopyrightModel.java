
class CopyrightModel {

	public String licence_url;
	public int year;
	public String holder_url;
	public String holder;
	public String licence;
	public String logo;

	public CopyrightModel(String licence_url, int year, String holder_url, String holder, String licence, String logo) {

		this.licence_url = licence_url;
		this.year = year;
		this.holder_url = holder_url;
		this.holder = holder;
		this.licence = licence;
		this.logo = logo;

	}

}