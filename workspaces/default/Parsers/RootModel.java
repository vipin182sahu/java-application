import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public CopyrightModel _copyright;
	public String logo;
	public CreatorModel _creator;
	public String end_time;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String state;
	public String name;
	public String topic;
	public String background_image;
	public String description;
	public String timezone;
	public String privacy;
	public String location_name;
	public String type;
	public VersionModel _version;
	public String email;
	public String organizer_name;
	public String start_time;

	public RootModel(String organizer_description, CopyrightModel copyright, String logo, CreatorModel creator, String end_time, int id, ArrayList<Social_linksModel> social_links, String schedule_published_on, Call_for_papersModel call_for_papers, String code_of_conduct, String state, String name, String topic, String background_image, String description, String timezone, String privacy, String location_name, String type, VersionModel version, String email, String organizer_name, String start_time) {

		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.logo = logo;
		this._creator = creator;
		this.end_time = end_time;
		this.id = id;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.name = name;
		this.topic = topic;
		this.background_image = background_image;
		this.description = description;
		this.timezone = timezone;
		this.privacy = privacy;
		this.location_name = location_name;
		this.type = type;
		this._version = version;
		this.email = email;
		this.organizer_name = organizer_name;
		this.start_time = start_time;

	}

}