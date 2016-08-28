import java.util.ArrayList;

class RootModel {

	public String type;
	public String email;
	public String logo;
	public String code_of_conduct;
	public String end_time;
	public String description;
	public VersionModel _version;
	public String location_name;
	public String organizer_description;
	public CreatorModel _creator;
	public String schedule_published_on;
	public int id;
	public String timezone;
	public String name;
	public String organizer_name;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public CopyrightModel _copyright;
	public String privacy;
	public String topic;

	public RootModel(String type, String email, String logo, String code_of_conduct, String end_time, String description, VersionModel version, String location_name, String organizer_description, CreatorModel creator, String schedule_published_on, int id, String timezone, String name, String organizer_name, String background_image, ArrayList<Social_linksModel> social_links, String start_time, Call_for_papersModel call_for_papers, String state, CopyrightModel copyright, String privacy, String topic) {

		this.type = type;
		this.email = email;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.description = description;
		this._version = version;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.timezone = timezone;
		this.name = name;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.social_links = social_links;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this._copyright = copyright;
		this.privacy = privacy;
		this.topic = topic;

	}

}