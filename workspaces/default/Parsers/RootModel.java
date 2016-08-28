import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public VersionModel _version;
	public String email;
	public CreatorModel _creator;
	public String background_image;
	public String type;
	public String description;
	public int id;
	public CopyrightModel _copyright;
	public String state;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String code_of_conduct;
	public String name;
	public String location_name;
	public String organizer_name;
	public String logo;
	public String timezone;
	public String end_time;

	public RootModel(String schedule_published_on, String organizer_description, ArrayList<Social_linksModel> social_links, String privacy, VersionModel version, String email, CreatorModel creator, String background_image, String type, String description, int id, CopyrightModel copyright, String state, String start_time, Call_for_papersModel call_for_papers, String topic, String code_of_conduct, String name, String location_name, String organizer_name, String logo, String timezone, String end_time) {

		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.privacy = privacy;
		this._version = version;
		this.email = email;
		this._creator = creator;
		this.background_image = background_image;
		this.type = type;
		this.description = description;
		this.id = id;
		this._copyright = copyright;
		this.state = state;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.timezone = timezone;
		this.end_time = end_time;

	}

}