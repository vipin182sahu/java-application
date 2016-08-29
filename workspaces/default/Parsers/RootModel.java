import java.util.ArrayList;

class RootModel {

	public String timezone;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String organizer_description;
	public String end_time;
	public VersionModel _version;
	public String location_name;
	public String privacy;
	public String type;
	public int id;
	public String logo;
	public String description;
	public String organizer_name;
	public CreatorModel _creator;
	public String background_image;
	public String state;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String email;
	public String name;
	public String start_time;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String timezone, CopyrightModel copyright, String schedule_published_on, String organizer_description, String end_time, VersionModel version, String location_name, String privacy, String type, int id, String logo, String description, String organizer_name, CreatorModel creator, String background_image, String state, String topic, ArrayList<Social_linksModel> social_links, String code_of_conduct, String email, String name, String start_time, Call_for_papersModel call_for_papers) {

		this.timezone = timezone;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this._version = version;
		this.location_name = location_name;
		this.privacy = privacy;
		this.type = type;
		this.id = id;
		this.logo = logo;
		this.description = description;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.background_image = background_image;
		this.state = state;
		this.topic = topic;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.name = name;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;

	}

}