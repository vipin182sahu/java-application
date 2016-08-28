import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String name;
	public VersionModel _version;
	public String privacy;
	public String location_name;
	public String end_time;
	public int id;
	public String email;
	public String state;
	public String start_time;
	public String code_of_conduct;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String timezone;
	public String organizer_description;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String description;

	public RootModel(String background_image, String topic, Call_for_papersModel call_for_papers, String organizer_name, String name, VersionModel version, String privacy, String location_name, String end_time, int id, String email, String state, String start_time, String code_of_conduct, String logo, ArrayList<Social_linksModel> social_links, String type, String timezone, String organizer_description, String schedule_published_on, CopyrightModel copyright, CreatorModel creator, String description) {

		this.background_image = background_image;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.name = name;
		this._version = version;
		this.privacy = privacy;
		this.location_name = location_name;
		this.end_time = end_time;
		this.id = id;
		this.email = email;
		this.state = state;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.social_links = social_links;
		this.type = type;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this._creator = creator;
		this.description = description;

	}

}