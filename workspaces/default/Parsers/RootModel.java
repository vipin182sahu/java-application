import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String code_of_conduct;
	public String description;
	public String end_time;
	public String name;
	public String location_name;
	public String timezone;
	public String logo;
	public String topic;
	public VersionModel _version;
	public String schedule_published_on;
	public String type;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public int id;
	public String organizer_name;
	public String email;
	public CreatorModel _creator;
	public String state;
	public String start_time;

	public RootModel(String organizer_description, Call_for_papersModel call_for_papers, String background_image, String code_of_conduct, String description, String end_time, String name, String location_name, String timezone, String logo, String topic, VersionModel version, String schedule_published_on, String type, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String privacy, int id, String organizer_name, String email, CreatorModel creator, String state, String start_time) {

		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.end_time = end_time;
		this.name = name;
		this.location_name = location_name;
		this.timezone = timezone;
		this.logo = logo;
		this.topic = topic;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this._copyright = copyright;
		this.social_links = social_links;
		this.privacy = privacy;
		this.id = id;
		this.organizer_name = organizer_name;
		this.email = email;
		this._creator = creator;
		this.state = state;
		this.start_time = start_time;

	}

}