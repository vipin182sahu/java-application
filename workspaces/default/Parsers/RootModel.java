import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String type;
	public String background_image;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String organizer_name;
	public String topic;
	public String email;
	public String code_of_conduct;
	public String location_name;
	public String description;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public int id;
	public String start_time;
	public String timezone;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String logo;
	public CopyrightModel _copyright;
	public String organizer_description;

	public RootModel(String end_time, String type, String background_image, VersionModel version, Call_for_papersModel call_for_papers, String name, String organizer_name, String topic, String email, String code_of_conduct, String location_name, String description, String privacy, ArrayList<Social_linksModel> social_links, String state, int id, String start_time, String timezone, String schedule_published_on, CreatorModel creator, String logo, CopyrightModel copyright, String organizer_description) {

		this.end_time = end_time;
		this.type = type;
		this.background_image = background_image;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.description = description;
		this.privacy = privacy;
		this.social_links = social_links;
		this.state = state;
		this.id = id;
		this.start_time = start_time;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.logo = logo;
		this._copyright = copyright;
		this.organizer_description = organizer_description;

	}

}