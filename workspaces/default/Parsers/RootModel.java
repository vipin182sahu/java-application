import java.util.ArrayList;

class RootModel {

	public String privacy;
	public int id;
	public String organizer_description;
	public String name;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String type;
	public String state;
	public VersionModel _version;
	public String location_name;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String organizer_name;
	public String background_image;
	public String end_time;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String email;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String start_time;

	public RootModel(String privacy, int id, String organizer_description, String name, String logo, Call_for_papersModel call_for_papers, String topic, String type, String state, VersionModel version, String location_name, String schedule_published_on, CreatorModel creator, String organizer_name, String background_image, String end_time, CopyrightModel copyright, String code_of_conduct, String email, String description, ArrayList<Social_linksModel> social_links, String timezone, String start_time) {

		this.privacy = privacy;
		this.id = id;
		this.organizer_description = organizer_description;
		this.name = name;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.type = type;
		this.state = state;
		this._version = version;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.end_time = end_time;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.description = description;
		this.social_links = social_links;
		this.timezone = timezone;
		this.start_time = start_time;

	}

}