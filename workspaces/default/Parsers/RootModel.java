import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String topic;
	public String logo;
	public String start_time;
	public String code_of_conduct;
	public String email;
	public String schedule_published_on;
	public String end_time;
	public String organizer_description;
	public String state;
	public String type;
	public String location_name;
	public String name;
	public String description;
	public VersionModel _version;
	public String privacy;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String organizer_name;

	public RootModel(String timezone, String topic, String logo, String start_time, String code_of_conduct, String email, String schedule_published_on, String end_time, String organizer_description, String state, String type, String location_name, String name, String description, VersionModel version, String privacy, CopyrightModel copyright, CreatorModel creator, int id, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String background_image, String organizer_name) {

		this.timezone = timezone;
		this.topic = topic;
		this.logo = logo;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.state = state;
		this.type = type;
		this.location_name = location_name;
		this.name = name;
		this.description = description;
		this._version = version;
		this.privacy = privacy;
		this._copyright = copyright;
		this._creator = creator;
		this.id = id;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.organizer_name = organizer_name;

	}

}