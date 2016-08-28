import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String email;
	public String location_name;
	public int id;
	public String end_time;
	public String type;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String name;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String timezone;
	public String logo;
	public String background_image;
	public String start_time;
	public String description;
	public String privacy;
	public String state;
	public String topic;
	public String code_of_conduct;
	public String organizer_name;

	public RootModel(CopyrightModel copyright, String email, String location_name, int id, String end_time, String type, String schedule_published_on, ArrayList<Social_linksModel> social_links, CreatorModel creator, String name, VersionModel version, Call_for_papersModel call_for_papers, String organizer_description, String timezone, String logo, String background_image, String start_time, String description, String privacy, String state, String topic, String code_of_conduct, String organizer_name) {

		this._copyright = copyright;
		this.email = email;
		this.location_name = location_name;
		this.id = id;
		this.end_time = end_time;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this._creator = creator;
		this.name = name;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.logo = logo;
		this.background_image = background_image;
		this.start_time = start_time;
		this.description = description;
		this.privacy = privacy;
		this.state = state;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;

	}

}