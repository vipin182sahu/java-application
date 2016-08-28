import java.util.ArrayList;

class RootModel {

	public String timezone;
	public int id;
	public VersionModel _version;
	public String type;
	public String schedule_published_on;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String privacy;
	public String organizer_name;
	public String description;
	public String topic;
	public String email;
	public String logo;
	public String background_image;
	public String start_time;
	public String location_name;
	public CopyrightModel _copyright;
	public String end_time;

	public RootModel(String timezone, int id, VersionModel version, String type, String schedule_published_on, String name, ArrayList<Social_linksModel> social_links, String code_of_conduct, CreatorModel creator, String organizer_description, Call_for_papersModel call_for_papers, String state, String privacy, String organizer_name, String description, String topic, String email, String logo, String background_image, String start_time, String location_name, CopyrightModel copyright, String end_time) {

		this.timezone = timezone;
		this.id = id;
		this._version = version;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.description = description;
		this.topic = topic;
		this.email = email;
		this.logo = logo;
		this.background_image = background_image;
		this.start_time = start_time;
		this.location_name = location_name;
		this._copyright = copyright;
		this.end_time = end_time;

	}

}