import java.util.ArrayList;

class RootModel {

	public String name;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String timezone;
	public String background_image;
	public String location_name;
	public String organizer_name;
	public String organizer_description;
	public String type;
	public String description;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String topic;
	public String schedule_published_on;
	public String end_time;
	public CreatorModel _creator;
	public VersionModel _version;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public int id;
	public String start_time;

	public RootModel(String name, String code_of_conduct, CopyrightModel copyright, String timezone, String background_image, String location_name, String organizer_name, String organizer_description, String type, String description, String state, Call_for_papersModel call_for_papers, String logo, String topic, String schedule_published_on, String end_time, CreatorModel creator, VersionModel version, String privacy, ArrayList<Social_linksModel> social_links, String email, int id, String start_time) {

		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.timezone = timezone;
		this.background_image = background_image;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.type = type;
		this.description = description;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this._creator = creator;
		this._version = version;
		this.privacy = privacy;
		this.social_links = social_links;
		this.email = email;
		this.id = id;
		this.start_time = start_time;

	}

}