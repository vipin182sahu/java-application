import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String state;
	public String email;
	public String timezone;
	public String privacy;
	public String end_time;
	public int id;
	public String logo;
	public CopyrightModel _copyright;
	public String description;
	public String location_name;
	public String topic;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public VersionModel _version;
	public String type;
	public String organizer_name;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String code_of_conduct;
	public String name;

	public RootModel(String organizer_description, String state, String email, String timezone, String privacy, String end_time, int id, String logo, CopyrightModel copyright, String description, String location_name, String topic, String schedule_published_on, Call_for_papersModel call_for_papers, String start_time, VersionModel version, String type, String organizer_name, CreatorModel creator, ArrayList<Social_linksModel> social_links, String background_image, String code_of_conduct, String name) {

		this.organizer_description = organizer_description;
		this.state = state;
		this.email = email;
		this.timezone = timezone;
		this.privacy = privacy;
		this.end_time = end_time;
		this.id = id;
		this.logo = logo;
		this._copyright = copyright;
		this.description = description;
		this.location_name = location_name;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this._version = version;
		this.type = type;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.social_links = social_links;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.name = name;

	}

}