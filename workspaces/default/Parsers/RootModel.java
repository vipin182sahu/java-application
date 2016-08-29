import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String description;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String location_name;
	public String email;
	public String background_image;
	public CreatorModel _creator;
	public String timezone;
	public String logo;
	public String start_time;
	public String organizer_description;
	public String state;
	public String organizer_name;
	public String privacy;
	public String type;
	public String topic;
	public String code_of_conduct;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public int id;

	public RootModel(String schedule_published_on, CopyrightModel copyright, String description, String name, Call_for_papersModel call_for_papers, VersionModel version, String location_name, String email, String background_image, CreatorModel creator, String timezone, String logo, String start_time, String organizer_description, String state, String organizer_name, String privacy, String type, String topic, String code_of_conduct, String end_time, ArrayList<Social_linksModel> social_links, int id) {

		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.description = description;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.location_name = location_name;
		this.email = email;
		this.background_image = background_image;
		this._creator = creator;
		this.timezone = timezone;
		this.logo = logo;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.state = state;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.type = type;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.social_links = social_links;
		this.id = id;

	}

}