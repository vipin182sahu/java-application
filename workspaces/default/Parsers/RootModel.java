import java.util.ArrayList;

class RootModel {

	public String logo;
	public String privacy;
	public String organizer_description;
	public String email;
	public String type;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public CopyrightModel _copyright;
	public String name;
	public String code_of_conduct;
	public String start_time;
	public String state;
	public int id;
	public String description;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String timezone;
	public VersionModel _version;
	public String end_time;

	public RootModel(String logo, String privacy, String organizer_description, String email, String type, String schedule_published_on, CreatorModel creator, String background_image, Call_for_papersModel call_for_papers, String location_name, CopyrightModel copyright, String name, String code_of_conduct, String start_time, String state, int id, String description, String organizer_name, ArrayList<Social_linksModel> social_links, String topic, String timezone, VersionModel version, String end_time) {

		this.logo = logo;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.email = email;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this._copyright = copyright;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.state = state;
		this.id = id;
		this.description = description;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.topic = topic;
		this.timezone = timezone;
		this._version = version;
		this.end_time = end_time;

	}

}