import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String location_name;
	public String privacy;
	public CopyrightModel _copyright;
	public String background_image;
	public String description;
	public String code_of_conduct;
	public String organizer_name;
	public String topic;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public CreatorModel _creator;
	public String organizer_description;
	public String schedule_published_on;
	public VersionModel _version;
	public String logo;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public int id;
	public String type;
	public String start_time;

	public RootModel(String timezone, String location_name, String privacy, CopyrightModel copyright, String background_image, String description, String code_of_conduct, String organizer_name, String topic, String end_time, ArrayList<Social_linksModel> social_links, String state, CreatorModel creator, String organizer_description, String schedule_published_on, VersionModel version, String logo, String name, Call_for_papersModel call_for_papers, String email, int id, String type, String start_time) {

		this.timezone = timezone;
		this.location_name = location_name;
		this.privacy = privacy;
		this._copyright = copyright;
		this.background_image = background_image;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.end_time = end_time;
		this.social_links = social_links;
		this.state = state;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.logo = logo;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.id = id;
		this.type = type;
		this.start_time = start_time;

	}

}