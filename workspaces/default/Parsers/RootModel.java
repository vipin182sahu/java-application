import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String location_name;
	public String state;
	public String email;
	public String timezone;
	public String description;
	public CreatorModel _creator;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String end_time;
	public String organizer_description;
	public String topic;
	public String organizer_name;
	public String name;
	public String schedule_published_on;
	public String logo;
	public String privacy;
	public String background_image;
	public CopyrightModel _copyright;
	public String start_time;
	public String type;
	public Call_for_papersModel _call_for_papers;

	public RootModel(VersionModel version, String location_name, String state, String email, String timezone, String description, CreatorModel creator, String code_of_conduct, ArrayList<Social_linksModel> social_links, int id, String end_time, String organizer_description, String topic, String organizer_name, String name, String schedule_published_on, String logo, String privacy, String background_image, CopyrightModel copyright, String start_time, String type, Call_for_papersModel call_for_papers) {

		this._version = version;
		this.location_name = location_name;
		this.state = state;
		this.email = email;
		this.timezone = timezone;
		this.description = description;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.id = id;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.privacy = privacy;
		this.background_image = background_image;
		this._copyright = copyright;
		this.start_time = start_time;
		this.type = type;
		this._call_for_papers = call_for_papers;

	}

}