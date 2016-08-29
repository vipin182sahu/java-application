import java.util.ArrayList;

class RootModel {

	public String name;
	public String location_name;
	public String timezone;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String organizer_description;
	public int id;
	public String type;
	public String topic;
	public VersionModel _version;
	public String logo;
	public String background_image;
	public CopyrightModel _copyright;
	public String state;
	public String email;
	public String description;
	public String schedule_published_on;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public CreatorModel _creator;
	public String start_time;

	public RootModel(String name, String location_name, String timezone, String code_of_conduct, ArrayList<Social_linksModel> social_links, String end_time, String organizer_description, int id, String type, String topic, VersionModel version, String logo, String background_image, CopyrightModel copyright, String state, String email, String description, String schedule_published_on, String organizer_name, Call_for_papersModel call_for_papers, String privacy, CreatorModel creator, String start_time) {

		this.name = name;
		this.location_name = location_name;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.id = id;
		this.type = type;
		this.topic = topic;
		this._version = version;
		this.logo = logo;
		this.background_image = background_image;
		this._copyright = copyright;
		this.state = state;
		this.email = email;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this._creator = creator;
		this.start_time = start_time;

	}

}