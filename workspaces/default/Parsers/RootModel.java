import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String timezone;
	public int id;
	public String location_name;
	public String code_of_conduct;
	public String email;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String name;
	public CreatorModel _creator;
	public String privacy;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String start_time;
	public String description;
	public String type;
	public String logo;
	public CopyrightModel _copyright;
	public String topic;
	public String state;
	public String organizer_description;

	public RootModel(String background_image, String timezone, int id, String location_name, String code_of_conduct, String email, String end_time, ArrayList<Social_linksModel> social_links, String schedule_published_on, String name, CreatorModel creator, String privacy, VersionModel version, Call_for_papersModel call_for_papers, String organizer_name, String start_time, String description, String type, String logo, CopyrightModel copyright, String topic, String state, String organizer_description) {

		this.background_image = background_image;
		this.timezone = timezone;
		this.id = id;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.end_time = end_time;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this._creator = creator;
		this.privacy = privacy;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.description = description;
		this.type = type;
		this.logo = logo;
		this._copyright = copyright;
		this.topic = topic;
		this.state = state;
		this.organizer_description = organizer_description;

	}

}