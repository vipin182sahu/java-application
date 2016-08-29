import java.util.ArrayList;

class RootModel {

	public String logo;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public CopyrightModel _copyright;
	public String location_name;
	public String organizer_name;
	public String code_of_conduct;
	public String end_time;
	public String privacy;
	public CreatorModel _creator;
	public String background_image;
	public VersionModel _version;
	public String description;
	public String email;
	public String organizer_description;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String type;
	public String state;
	public String schedule_published_on;
	public String name;

	public RootModel(String logo, String timezone, Call_for_papersModel call_for_papers, String topic, CopyrightModel copyright, String location_name, String organizer_name, String code_of_conduct, String end_time, String privacy, CreatorModel creator, String background_image, VersionModel version, String description, String email, String organizer_description, int id, ArrayList<Social_linksModel> social_links, String start_time, String type, String state, String schedule_published_on, String name) {

		this.logo = logo;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this._copyright = copyright;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.privacy = privacy;
		this._creator = creator;
		this.background_image = background_image;
		this._version = version;
		this.description = description;
		this.email = email;
		this.organizer_description = organizer_description;
		this.id = id;
		this.social_links = social_links;
		this.start_time = start_time;
		this.type = type;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.name = name;

	}

}