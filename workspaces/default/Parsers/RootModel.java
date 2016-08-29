import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String schedule_published_on;
	public String state;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String organizer_description;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String background_image;
	public String logo;
	public String privacy;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String name;
	public String end_time;
	public String topic;
	public String description;
	public String timezone;
	public String email;
	public VersionModel _version;

	public RootModel(String start_time, String schedule_published_on, String state, String location_name, Call_for_papersModel call_for_papers, String organizer_name, String organizer_description, CreatorModel creator, CopyrightModel copyright, String code_of_conduct, String background_image, String logo, String privacy, int id, ArrayList<Social_linksModel> social_links, String type, String name, String end_time, String topic, String description, String timezone, String email, VersionModel version) {

		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.logo = logo;
		this.privacy = privacy;
		this.id = id;
		this.social_links = social_links;
		this.type = type;
		this.name = name;
		this.end_time = end_time;
		this.topic = topic;
		this.description = description;
		this.timezone = timezone;
		this.email = email;
		this._version = version;

	}

}