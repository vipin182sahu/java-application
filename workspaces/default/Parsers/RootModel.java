import java.util.ArrayList;

class RootModel {

	public String logo;
	public String description;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String timezone;
	public String organizer_description;
	public String end_time;
	public String privacy;
	public CopyrightModel _copyright;
	public String type;
	public String topic;
	public String name;
	public String background_image;
	public int id;
	public String code_of_conduct;
	public String state;
	public String organizer_name;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public VersionModel _version;
	public String start_time;

	public RootModel(String logo, String description, String email, ArrayList<Social_linksModel> social_links, CreatorModel creator, String timezone, String organizer_description, String end_time, String privacy, CopyrightModel copyright, String type, String topic, String name, String background_image, int id, String code_of_conduct, String state, String organizer_name, String schedule_published_on, Call_for_papersModel call_for_papers, String location_name, VersionModel version, String start_time) {

		this.logo = logo;
		this.description = description;
		this.email = email;
		this.social_links = social_links;
		this._creator = creator;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.privacy = privacy;
		this._copyright = copyright;
		this.type = type;
		this.topic = topic;
		this.name = name;
		this.background_image = background_image;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this._version = version;
		this.start_time = start_time;

	}

}