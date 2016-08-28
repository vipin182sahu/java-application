import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String location_name;
	public String description;
	public String topic;
	public String background_image;
	public String privacy;
	public String logo;
	public String code_of_conduct;
	public String type;
	public String start_time;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String timezone;
	public String organizer_name;
	public String name;
	public CopyrightModel _copyright;
	public String organizer_description;
	public VersionModel _version;

	public RootModel(String end_time, String location_name, String description, String topic, String background_image, String privacy, String logo, String code_of_conduct, String type, String start_time, String email, Call_for_papersModel call_for_papers, String state, ArrayList<Social_linksModel> social_links, int id, String schedule_published_on, CreatorModel creator, String timezone, String organizer_name, String name, CopyrightModel copyright, String organizer_description, VersionModel version) {

		this.end_time = end_time;
		this.location_name = location_name;
		this.description = description;
		this.topic = topic;
		this.background_image = background_image;
		this.privacy = privacy;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.start_time = start_time;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.social_links = social_links;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.name = name;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this._version = version;

	}

}