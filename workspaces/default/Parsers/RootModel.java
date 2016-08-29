import java.util.ArrayList;

class RootModel {

	public String start_time;
	public int id;
	public String schedule_published_on;
	public String type;
	public CopyrightModel _copyright;
	public String name;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String state;
	public String logo;
	public VersionModel _version;
	public String description;
	public CreatorModel _creator;
	public String topic;
	public String location_name;
	public String end_time;
	public String timezone;
	public String email;
	public String privacy;
	public String organizer_name;
	public String organizer_description;

	public RootModel(String start_time, int id, String schedule_published_on, String type, CopyrightModel copyright, String name, String background_image, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String code_of_conduct, String state, String logo, VersionModel version, String description, CreatorModel creator, String topic, String location_name, String end_time, String timezone, String email, String privacy, String organizer_name, String organizer_description) {

		this.start_time = start_time;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this._copyright = copyright;
		this.name = name;
		this.background_image = background_image;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.logo = logo;
		this._version = version;
		this.description = description;
		this._creator = creator;
		this.topic = topic;
		this.location_name = location_name;
		this.end_time = end_time;
		this.timezone = timezone;
		this.email = email;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;

	}

}