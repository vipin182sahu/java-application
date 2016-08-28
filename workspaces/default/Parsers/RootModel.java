import java.util.ArrayList;

class RootModel {

	public int id;
	public String location_name;
	public VersionModel _version;
	public String email;
	public String privacy;
	public String schedule_published_on;
	public String name;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String start_time;
	public CopyrightModel _copyright;
	public String background_image;
	public String end_time;
	public String description;
	public CreatorModel _creator;
	public String organizer_description;
	public String code_of_conduct;
	public String state;
	public String timezone;
	public String logo;
	public String type;
	public Call_for_papersModel _call_for_papers;

	public RootModel(int id, String location_name, VersionModel version, String email, String privacy, String schedule_published_on, String name, String topic, ArrayList<Social_linksModel> social_links, String organizer_name, String start_time, CopyrightModel copyright, String background_image, String end_time, String description, CreatorModel creator, String organizer_description, String code_of_conduct, String state, String timezone, String logo, String type, Call_for_papersModel call_for_papers) {

		this.id = id;
		this.location_name = location_name;
		this._version = version;
		this.email = email;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.topic = topic;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this._copyright = copyright;
		this.background_image = background_image;
		this.end_time = end_time;
		this.description = description;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.timezone = timezone;
		this.logo = logo;
		this.type = type;
		this._call_for_papers = call_for_papers;

	}

}