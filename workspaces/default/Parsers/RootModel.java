import java.util.ArrayList;

class RootModel {

	public String state;
	public String name;
	public String code_of_conduct;
	public String location_name;
	public String timezone;
	public int id;
	public String schedule_published_on;
	public String start_time;
	public String organizer_name;
	public String privacy;
	public String logo;
	public CreatorModel _creator;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String end_time;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String description;
	public String background_image;
	public String type;
	public String topic;

	public RootModel(String state, String name, String code_of_conduct, String location_name, String timezone, int id, String schedule_published_on, String start_time, String organizer_name, String privacy, String logo, CreatorModel creator, String organizer_description, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String end_time, VersionModel version, Call_for_papersModel call_for_papers, String email, String description, String background_image, String type, String topic) {

		this.state = state;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.timezone = timezone;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.logo = logo;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this._copyright = copyright;
		this.end_time = end_time;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.description = description;
		this.background_image = background_image;
		this.type = type;
		this.topic = topic;

	}

}