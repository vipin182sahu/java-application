import java.util.ArrayList;

class RootModel {

	public String description;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String timezone;
	public String schedule_published_on;
	public String organizer_name;
	public String end_time;
	public String topic;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public VersionModel _version;
	public String background_image;
	public CopyrightModel _copyright;
	public String location_name;
	public String start_time;
	public CreatorModel _creator;
	public String logo;
	public String code_of_conduct;
	public String organizer_description;
	public String name;
	public String email;
	public int id;

	public RootModel(String description, Call_for_papersModel call_for_papers, String type, String timezone, String schedule_published_on, String organizer_name, String end_time, String topic, String state, ArrayList<Social_linksModel> social_links, String privacy, VersionModel version, String background_image, CopyrightModel copyright, String location_name, String start_time, CreatorModel creator, String logo, String code_of_conduct, String organizer_description, String name, String email, int id) {

		this.description = description;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.topic = topic;
		this.state = state;
		this.social_links = social_links;
		this.privacy = privacy;
		this._version = version;
		this.background_image = background_image;
		this._copyright = copyright;
		this.location_name = location_name;
		this.start_time = start_time;
		this._creator = creator;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.name = name;
		this.email = email;
		this.id = id;

	}

}