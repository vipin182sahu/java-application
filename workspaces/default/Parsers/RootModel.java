import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String logo;
	public String description;
	public String name;
	public String organizer_description;
	public String type;
	public String schedule_published_on;
	public String organizer_name;
	public String topic;
	public String state;
	public String location_name;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String timezone;
	public CreatorModel _creator;
	public String start_time;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public int id;

	public RootModel(String end_time, String logo, String description, String name, String organizer_description, String type, String schedule_published_on, String organizer_name, String topic, String state, String location_name, String background_image, ArrayList<Social_linksModel> social_links, VersionModel version, String code_of_conduct, CopyrightModel copyright, String timezone, CreatorModel creator, String start_time, String privacy, Call_for_papersModel call_for_papers, String email, int id) {

		this.end_time = end_time;
		this.logo = logo;
		this.description = description;
		this.name = name;
		this.organizer_description = organizer_description;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.state = state;
		this.location_name = location_name;
		this.background_image = background_image;
		this.social_links = social_links;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.timezone = timezone;
		this._creator = creator;
		this.start_time = start_time;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.id = id;

	}

}