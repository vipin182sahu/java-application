import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String logo;
	public String type;
	public String organizer_description;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String name;
	public String location_name;
	public String privacy;
	public String schedule_published_on;
	public String state;
	public CreatorModel _creator;
	public String start_time;
	public String code_of_conduct;
	public String description;
	public String end_time;
	public VersionModel _version;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String topic;
	public int id;

	public RootModel(String organizer_name, String logo, String type, String organizer_description, String timezone, Call_for_papersModel call_for_papers, String background_image, String name, String location_name, String privacy, String schedule_published_on, String state, CreatorModel creator, String start_time, String code_of_conduct, String description, String end_time, VersionModel version, String email, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String topic, int id) {

		this.organizer_name = organizer_name;
		this.logo = logo;
		this.type = type;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.name = name;
		this.location_name = location_name;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this._creator = creator;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.end_time = end_time;
		this._version = version;
		this.email = email;
		this.social_links = social_links;
		this._copyright = copyright;
		this.topic = topic;
		this.id = id;

	}

}