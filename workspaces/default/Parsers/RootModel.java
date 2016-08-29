import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String type;
	public String background_image;
	public String email;
	public String organizer_name;
	public String organizer_description;
	public String schedule_published_on;
	public String logo;
	public String topic;
	public String privacy;
	public String end_time;
	public String start_time;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String location_name;
	public CreatorModel _creator;
	public String state;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public int id;
	public String name;

	public RootModel(CopyrightModel copyright, String type, String background_image, String email, String organizer_name, String organizer_description, String schedule_published_on, String logo, String topic, String privacy, String end_time, String start_time, VersionModel version, Call_for_papersModel call_for_papers, String code_of_conduct, String location_name, CreatorModel creator, String state, String timezone, ArrayList<Social_linksModel> social_links, String description, int id, String name) {

		this._copyright = copyright;
		this.type = type;
		this.background_image = background_image;
		this.email = email;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.topic = topic;
		this.privacy = privacy;
		this.end_time = end_time;
		this.start_time = start_time;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this._creator = creator;
		this.state = state;
		this.timezone = timezone;
		this.social_links = social_links;
		this.description = description;
		this.id = id;
		this.name = name;

	}

}