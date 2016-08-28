import java.util.ArrayList;

class RootModel {

	public String name;
	public String timezone;
	public CopyrightModel _copyright;
	public String type;
	public String organizer_name;
	public String end_time;
	public String location_name;
	public String start_time;
	public String state;
	public String schedule_published_on;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String background_image;
	public VersionModel _version;
	public String logo;
	public String email;
	public String description;
	public String privacy;
	public String organizer_description;

	public RootModel(String name, String timezone, CopyrightModel copyright, String type, String organizer_name, String end_time, String location_name, String start_time, String state, String schedule_published_on, String code_of_conduct, ArrayList<Social_linksModel> social_links, int id, String topic, Call_for_papersModel call_for_papers, CreatorModel creator, String background_image, VersionModel version, String logo, String email, String description, String privacy, String organizer_description) {

		this.name = name;
		this.timezone = timezone;
		this._copyright = copyright;
		this.type = type;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.location_name = location_name;
		this.start_time = start_time;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.id = id;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.background_image = background_image;
		this._version = version;
		this.logo = logo;
		this.email = email;
		this.description = description;
		this.privacy = privacy;
		this.organizer_description = organizer_description;

	}

}