import java.util.ArrayList;

class RootModel {

	public String email;
	public String type;
	public String location_name;
	public String organizer_name;
	public String logo;
	public String background_image;
	public String schedule_published_on;
	public int id;
	public VersionModel _version;
	public String code_of_conduct;
	public String topic;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String privacy;
	public String start_time;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String timezone;
	public String description;

	public RootModel(String email, String type, String location_name, String organizer_name, String logo, String background_image, String schedule_published_on, int id, VersionModel version, String code_of_conduct, String topic, String organizer_description, CopyrightModel copyright, String privacy, String start_time, String end_time, Call_for_papersModel call_for_papers, CreatorModel creator, String state, ArrayList<Social_linksModel> social_links, String name, String timezone, String description) {

		this.email = email;
		this.type = type;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.privacy = privacy;
		this.start_time = start_time;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.state = state;
		this.social_links = social_links;
		this.name = name;
		this.timezone = timezone;
		this.description = description;

	}

}