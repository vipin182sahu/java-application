import java.util.ArrayList;

class RootModel {

	public String end_time;
	public CreatorModel _creator;
	public String timezone;
	public String start_time;
	public String email;
	public String organizer_name;
	public String schedule_published_on;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String code_of_conduct;
	public String type;
	public String logo;
	public String organizer_description;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String description;
	public String location_name;
	public String name;
	public String background_image;
	public String privacy;
	public String state;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String end_time, CreatorModel creator, String timezone, String start_time, String email, String organizer_name, String schedule_published_on, String topic, ArrayList<Social_linksModel> social_links, int id, String code_of_conduct, String type, String logo, String organizer_description, CopyrightModel copyright, VersionModel version, String description, String location_name, String name, String background_image, String privacy, String state, Call_for_papersModel call_for_papers) {

		this.end_time = end_time;
		this._creator = creator;
		this.timezone = timezone;
		this.start_time = start_time;
		this.email = email;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.social_links = social_links;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this._version = version;
		this.description = description;
		this.location_name = location_name;
		this.name = name;
		this.background_image = background_image;
		this.privacy = privacy;
		this.state = state;
		this._call_for_papers = call_for_papers;

	}

}