import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String background_image;
	public String organizer_description;
	public String type;
	public String code_of_conduct;
	public String location_name;
	public String topic;
	public String start_time;
	public String timezone;
	public String schedule_published_on;
	public String privacy;
	public String state;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String email;
	public CreatorModel _creator;
	public VersionModel _version;
	public String organizer_name;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String name;

	public RootModel(String end_time, String background_image, String organizer_description, String type, String code_of_conduct, String location_name, String topic, String start_time, String timezone, String schedule_published_on, String privacy, String state, String logo, Call_for_papersModel call_for_papers, String description, String email, CreatorModel creator, VersionModel version, String organizer_name, int id, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String name) {

		this.end_time = end_time;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.topic = topic;
		this.start_time = start_time;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.state = state;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.email = email;
		this._creator = creator;
		this._version = version;
		this.organizer_name = organizer_name;
		this.id = id;
		this.social_links = social_links;
		this._copyright = copyright;
		this.name = name;

	}

}