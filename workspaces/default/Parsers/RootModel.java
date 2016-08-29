import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String type;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String logo;
	public String name;
	public String state;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String end_time;
	public String topic;
	public String description;
	public int id;
	public String email;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String start_time;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String timezone;
	public String organizer_description;

	public RootModel(String background_image, String type, VersionModel version, Call_for_papersModel call_for_papers, String privacy, String logo, String name, String state, CreatorModel creator, String schedule_published_on, String end_time, String topic, String description, int id, String email, CopyrightModel copyright, String code_of_conduct, String start_time, String organizer_name, ArrayList<Social_linksModel> social_links, String location_name, String timezone, String organizer_description) {

		this.background_image = background_image;
		this.type = type;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.logo = logo;
		this.name = name;
		this.state = state;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.topic = topic;
		this.description = description;
		this.id = id;
		this.email = email;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.location_name = location_name;
		this.timezone = timezone;
		this.organizer_description = organizer_description;

	}

}