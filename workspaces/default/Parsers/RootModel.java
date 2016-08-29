import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String timezone;
	public String type;
	public String start_time;
	public String privacy;
	public String email;
	public int id;
	public VersionModel _version;
	public String organizer_name;
	public CreatorModel _creator;
	public String state;
	public String location_name;
	public String topic;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String organizer_description;
	public String end_time;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String name;

	public RootModel(String code_of_conduct, String timezone, String type, String start_time, String privacy, String email, int id, VersionModel version, String organizer_name, CreatorModel creator, String state, String location_name, String topic, CopyrightModel copyright, String schedule_published_on, String organizer_description, String end_time, String logo, ArrayList<Social_linksModel> social_links, String background_image, Call_for_papersModel call_for_papers, String description, String name) {

		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.type = type;
		this.start_time = start_time;
		this.privacy = privacy;
		this.email = email;
		this.id = id;
		this._version = version;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.state = state;
		this.location_name = location_name;
		this.topic = topic;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.logo = logo;
		this.social_links = social_links;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.name = name;

	}

}