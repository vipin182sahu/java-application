import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public CreatorModel _creator;
	public String timezone;
	public String end_time;
	public String topic;
	public String start_time;
	public String background_image;
	public String code_of_conduct;
	public String privacy;
	public String organizer_description;
	public String organizer_name;
	public String name;
	public CopyrightModel _copyright;
	public int id;
	public String state;
	public String description;
	public String location_name;
	public String type;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public VersionModel _version;

	public RootModel(String schedule_published_on, CreatorModel creator, String timezone, String end_time, String topic, String start_time, String background_image, String code_of_conduct, String privacy, String organizer_description, String organizer_name, String name, CopyrightModel copyright, int id, String state, String description, String location_name, String type, String email, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String logo, VersionModel version) {

		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.timezone = timezone;
		this.end_time = end_time;
		this.topic = topic;
		this.start_time = start_time;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.name = name;
		this._copyright = copyright;
		this.id = id;
		this.state = state;
		this.description = description;
		this.location_name = location_name;
		this.type = type;
		this.email = email;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this._version = version;

	}

}