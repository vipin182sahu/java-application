import java.util.ArrayList;

class RootModel {

	public String type;
	public String description;
	public CreatorModel _creator;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String state;
	public String end_time;
	public String timezone;
	public VersionModel _version;
	public String email;
	public String organizer_description;
	public String background_image;
	public String topic;
	public String name;
	public String start_time;
	public String location_name;
	public String schedule_published_on;
	public String organizer_name;

	public RootModel(String type, String description, CreatorModel creator, int id, ArrayList<Social_linksModel> social_links, String logo, String code_of_conduct, CopyrightModel copyright, Call_for_papersModel call_for_papers, String privacy, String state, String end_time, String timezone, VersionModel version, String email, String organizer_description, String background_image, String topic, String name, String start_time, String location_name, String schedule_published_on, String organizer_name) {

		this.type = type;
		this.description = description;
		this._creator = creator;
		this.id = id;
		this.social_links = social_links;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.state = state;
		this.end_time = end_time;
		this.timezone = timezone;
		this._version = version;
		this.email = email;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.topic = topic;
		this.name = name;
		this.start_time = start_time;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;

	}

}