import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String type;
	public CreatorModel _creator;
	public String name;
	public int id;
	public String description;
	public String email;
	public String organizer_description;
	public String code_of_conduct;
	public String organizer_name;
	public String topic;
	public String timezone;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String start_time;
	public String logo;
	public String location_name;
	public String privacy;
	public VersionModel _version;
	public String state;
	public String end_time;

	public RootModel(String background_image, String type, CreatorModel creator, String name, int id, String description, String email, String organizer_description, String code_of_conduct, String organizer_name, String topic, String timezone, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String schedule_published_on, String start_time, String logo, String location_name, String privacy, VersionModel version, String state, String end_time) {

		this.background_image = background_image;
		this.type = type;
		this._creator = creator;
		this.name = name;
		this.id = id;
		this.description = description;
		this.email = email;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.timezone = timezone;
		this._copyright = copyright;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.logo = logo;
		this.location_name = location_name;
		this.privacy = privacy;
		this._version = version;
		this.state = state;
		this.end_time = end_time;

	}

}