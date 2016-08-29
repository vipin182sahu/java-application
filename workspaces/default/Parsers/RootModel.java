import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public VersionModel _version;
	public String topic;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String privacy;
	public String email;
	public String background_image;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String name;
	public int id;
	public String start_time;
	public String end_time;
	public String logo;
	public String state;
	public String schedule_published_on;
	public String type;
	public String organizer_description;

	public RootModel(String organizer_name, VersionModel version, String topic, String code_of_conduct, Call_for_papersModel call_for_papers, String location_name, String privacy, String email, String background_image, CopyrightModel copyright, CreatorModel creator, String description, ArrayList<Social_linksModel> social_links, String timezone, String name, int id, String start_time, String end_time, String logo, String state, String schedule_published_on, String type, String organizer_description) {

		this.organizer_name = organizer_name;
		this._version = version;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.privacy = privacy;
		this.email = email;
		this.background_image = background_image;
		this._copyright = copyright;
		this._creator = creator;
		this.description = description;
		this.social_links = social_links;
		this.timezone = timezone;
		this.name = name;
		this.id = id;
		this.start_time = start_time;
		this.end_time = end_time;
		this.logo = logo;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.organizer_description = organizer_description;

	}

}