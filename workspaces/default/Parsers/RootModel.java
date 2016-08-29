import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String end_time;
	public CopyrightModel _copyright;
	public String privacy;
	public String code_of_conduct;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String organizer_description;
	public String type;
	public String name;
	public int id;
	public String organizer_name;
	public String location_name;
	public String topic;
	public String logo;
	public String start_time;
	public String description;

	public RootModel(String background_image, String end_time, CopyrightModel copyright, String privacy, String code_of_conduct, VersionModel version, Call_for_papersModel call_for_papers, String state, String schedule_published_on, CreatorModel creator, String email, ArrayList<Social_linksModel> social_links, String timezone, String organizer_description, String type, String name, int id, String organizer_name, String location_name, String topic, String logo, String start_time, String description) {

		this.background_image = background_image;
		this.end_time = end_time;
		this._copyright = copyright;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.email = email;
		this.social_links = social_links;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.type = type;
		this.name = name;
		this.id = id;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.topic = topic;
		this.logo = logo;
		this.start_time = start_time;
		this.description = description;

	}

}