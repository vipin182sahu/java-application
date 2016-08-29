import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String topic;
	public String timezone;
	public String logo;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String location_name;
	public CopyrightModel _copyright;
	public String state;
	public String schedule_published_on;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String organizer_name;
	public String start_time;
	public String privacy;
	public String background_image;
	public int id;
	public String type;
	public CreatorModel _creator;
	public VersionModel _version;
	public String description;

	public RootModel(String code_of_conduct, String topic, String timezone, String logo, String end_time, ArrayList<Social_linksModel> social_links, String name, String location_name, CopyrightModel copyright, String state, String schedule_published_on, String organizer_description, Call_for_papersModel call_for_papers, String email, String organizer_name, String start_time, String privacy, String background_image, int id, String type, CreatorModel creator, VersionModel version, String description) {

		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.timezone = timezone;
		this.logo = logo;
		this.end_time = end_time;
		this.social_links = social_links;
		this.name = name;
		this.location_name = location_name;
		this._copyright = copyright;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.privacy = privacy;
		this.background_image = background_image;
		this.id = id;
		this.type = type;
		this._creator = creator;
		this._version = version;
		this.description = description;

	}

}