import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public VersionModel _version;
	public String schedule_published_on;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String organizer_name;
	public String organizer_description;
	public CreatorModel _creator;
	public String name;
	public int id;
	public String background_image;
	public String location_name;
	public String logo;
	public String description;
	public String timezone;
	public String start_time;
	public String end_time;
	public String email;
	public String type;
	public String privacy;
	public String state;
	public Call_for_papersModel _call_for_papers;

	public RootModel(CopyrightModel copyright, VersionModel version, String schedule_published_on, String topic, ArrayList<Social_linksModel> social_links, String code_of_conduct, String organizer_name, String organizer_description, CreatorModel creator, String name, int id, String background_image, String location_name, String logo, String description, String timezone, String start_time, String end_time, String email, String type, String privacy, String state, Call_for_papersModel call_for_papers) {

		this._copyright = copyright;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.name = name;
		this.id = id;
		this.background_image = background_image;
		this.location_name = location_name;
		this.logo = logo;
		this.description = description;
		this.timezone = timezone;
		this.start_time = start_time;
		this.end_time = end_time;
		this.email = email;
		this.type = type;
		this.privacy = privacy;
		this.state = state;
		this._call_for_papers = call_for_papers;

	}

}