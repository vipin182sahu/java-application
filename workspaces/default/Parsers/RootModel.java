import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String logo;
	public String name;
	public String privacy;
	public String topic;
	public String type;
	public CreatorModel _creator;
	public String organizer_description;
	public String organizer_name;
	public String end_time;
	public int id;
	public String background_image;
	public String email;
	public VersionModel _version;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String start_time;
	public String state;
	public String timezone;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String location_name, String logo, String name, String privacy, String topic, String type, CreatorModel creator, String organizer_description, String organizer_name, String end_time, int id, String background_image, String email, VersionModel version, String code_of_conduct, ArrayList<Social_linksModel> social_links, String description, String start_time, String state, String timezone, CopyrightModel copyright, String schedule_published_on, Call_for_papersModel call_for_papers) {

		this.location_name = location_name;
		this.logo = logo;
		this.name = name;
		this.privacy = privacy;
		this.topic = topic;
		this.type = type;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.id = id;
		this.background_image = background_image;
		this.email = email;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.description = description;
		this.start_time = start_time;
		this.state = state;
		this.timezone = timezone;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;

	}

}