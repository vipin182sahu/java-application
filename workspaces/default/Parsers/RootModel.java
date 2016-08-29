import java.util.ArrayList;

class RootModel {

	public String background_image;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String end_time;
	public String topic;
	public String state;
	public String logo;
	public String organizer_description;
	public VersionModel _version;
	public String name;
	public String code_of_conduct;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public int id;
	public String location_name;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String type;
	public String description;

	public RootModel(String background_image, CopyrightModel copyright, String organizer_name, String schedule_published_on, CreatorModel creator, String end_time, String topic, String state, String logo, String organizer_description, VersionModel version, String name, String code_of_conduct, String privacy, ArrayList<Social_linksModel> social_links, String email, int id, String location_name, String start_time, Call_for_papersModel call_for_papers, String timezone, String type, String description) {

		this.background_image = background_image;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.end_time = end_time;
		this.topic = topic;
		this.state = state;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this._version = version;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.social_links = social_links;
		this.email = email;
		this.id = id;
		this.location_name = location_name;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.type = type;
		this.description = description;

	}

}