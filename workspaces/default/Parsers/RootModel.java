import java.util.ArrayList;

class RootModel {

	public String logo;
	public String end_time;
	public String organizer_description;
	public String location_name;
	public String timezone;
	public String description;
	public int id;
	public String state;
	public String type;
	public String email;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String topic;
	public VersionModel _version;
	public String code_of_conduct;
	public String organizer_name;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String start_time;

	public RootModel(String logo, String end_time, String organizer_description, String location_name, String timezone, String description, int id, String state, String type, String email, String schedule_published_on, ArrayList<Social_linksModel> social_links, String background_image, CreatorModel creator, CopyrightModel copyright, String topic, VersionModel version, String code_of_conduct, String organizer_name, String name, Call_for_papersModel call_for_papers, String privacy, String start_time) {

		this.logo = logo;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.timezone = timezone;
		this.description = description;
		this.id = id;
		this.state = state;
		this.type = type;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.background_image = background_image;
		this._creator = creator;
		this._copyright = copyright;
		this.topic = topic;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.start_time = start_time;

	}

}