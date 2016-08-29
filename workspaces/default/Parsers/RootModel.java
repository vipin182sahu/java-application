import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public int id;
	public String timezone;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public VersionModel _version;
	public CreatorModel _creator;
	public String background_image;
	public String type;
	public String state;
	public String email;
	public String logo;
	public String location_name;
	public String privacy;
	public String organizer_description;
	public String topic;
	public String description;
	public String end_time;
	public String code_of_conduct;
	public String name;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String organizer_name, int id, String timezone, String schedule_published_on, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String start_time, VersionModel version, CreatorModel creator, String background_image, String type, String state, String email, String logo, String location_name, String privacy, String organizer_description, String topic, String description, String end_time, String code_of_conduct, String name, Call_for_papersModel call_for_papers) {

		this.organizer_name = organizer_name;
		this.id = id;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.social_links = social_links;
		this.start_time = start_time;
		this._version = version;
		this._creator = creator;
		this.background_image = background_image;
		this.type = type;
		this.state = state;
		this.email = email;
		this.logo = logo;
		this.location_name = location_name;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.description = description;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._call_for_papers = call_for_papers;

	}

}