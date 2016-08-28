import java.util.ArrayList;

class RootModel {

	public String description;
	public String start_time;
	public String background_image;
	public VersionModel _version;
	public String end_time;
	public String name;
	public CreatorModel _creator;
	public String organizer_name;
	public String email;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String topic;
	public String logo;
	public int id;
	public String organizer_description;
	public String state;
	public String timezone;
	public String code_of_conduct;
	public String type;
	public CopyrightModel _copyright;
	public String location_name;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String description, String start_time, String background_image, VersionModel version, String end_time, String name, CreatorModel creator, String organizer_name, String email, String privacy, ArrayList<Social_linksModel> social_links, String schedule_published_on, String topic, String logo, int id, String organizer_description, String state, String timezone, String code_of_conduct, String type, CopyrightModel copyright, String location_name, Call_for_papersModel call_for_papers) {

		this.description = description;
		this.start_time = start_time;
		this.background_image = background_image;
		this._version = version;
		this.end_time = end_time;
		this.name = name;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.email = email;
		this.privacy = privacy;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.logo = logo;
		this.id = id;
		this.organizer_description = organizer_description;
		this.state = state;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._copyright = copyright;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;

	}

}