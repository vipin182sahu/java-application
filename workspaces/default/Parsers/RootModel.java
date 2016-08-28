import java.util.ArrayList;

class RootModel {

	public String description;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String code_of_conduct;
	public String logo;
	public String email;
	public String start_time;
	public String organizer_description;
	public int id;
	public String type;
	public String name;
	public String end_time;
	public VersionModel _version;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String privacy;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String topic;
	public String location_name;

	public RootModel(String description, CreatorModel creator, String schedule_published_on, String code_of_conduct, String logo, String email, String start_time, String organizer_description, int id, String type, String name, String end_time, VersionModel version, String organizer_name, CopyrightModel copyright, String privacy, String timezone, Call_for_papersModel call_for_papers, String background_image, ArrayList<Social_linksModel> social_links, String state, String topic, String location_name) {

		this.description = description;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.email = email;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.id = id;
		this.type = type;
		this.name = name;
		this.end_time = end_time;
		this._version = version;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.privacy = privacy;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.social_links = social_links;
		this.state = state;
		this.topic = topic;
		this.location_name = location_name;

	}

}