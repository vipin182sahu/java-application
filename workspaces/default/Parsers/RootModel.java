import java.util.ArrayList;

class RootModel {

	public String name;
	public String logo;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String background_image;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String end_time;
	public String organizer_name;
	public int id;
	public String type;
	public String location_name;
	public CopyrightModel _copyright;
	public String start_time;
	public String privacy;
	public String timezone;
	public String email;
	public String code_of_conduct;
	public String state;
	public VersionModel _version;
	public String description;

	public RootModel(String name, String logo, String topic, ArrayList<Social_linksModel> social_links, CreatorModel creator, String background_image, String organizer_description, Call_for_papersModel call_for_papers, String schedule_published_on, String end_time, String organizer_name, int id, String type, String location_name, CopyrightModel copyright, String start_time, String privacy, String timezone, String email, String code_of_conduct, String state, VersionModel version, String description) {

		this.name = name;
		this.logo = logo;
		this.topic = topic;
		this.social_links = social_links;
		this._creator = creator;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.id = id;
		this.type = type;
		this.location_name = location_name;
		this._copyright = copyright;
		this.start_time = start_time;
		this.privacy = privacy;
		this.timezone = timezone;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._version = version;
		this.description = description;

	}

}