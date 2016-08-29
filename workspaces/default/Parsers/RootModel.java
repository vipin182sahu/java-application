import java.util.ArrayList;

class RootModel {

	public String state;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String schedule_published_on;
	public String background_image;
	public int id;
	public VersionModel _version;
	public String email;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String organizer_name;
	public String start_time;
	public String location_name;
	public String logo;
	public String topic;
	public String name;
	public String description;
	public String timezone;
	public String privacy;
	public String organizer_description;

	public RootModel(String state, CopyrightModel copyright, CreatorModel creator, String code_of_conduct, String schedule_published_on, String background_image, int id, VersionModel version, String email, String type, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String end_time, String organizer_name, String start_time, String location_name, String logo, String topic, String name, String description, String timezone, String privacy, String organizer_description) {

		this.state = state;
		this._copyright = copyright;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.id = id;
		this._version = version;
		this.email = email;
		this.type = type;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.location_name = location_name;
		this.logo = logo;
		this.topic = topic;
		this.name = name;
		this.description = description;
		this.timezone = timezone;
		this.privacy = privacy;
		this.organizer_description = organizer_description;

	}

}