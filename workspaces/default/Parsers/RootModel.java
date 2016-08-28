import java.util.ArrayList;

class RootModel {

	public String topic;
	public CreatorModel _creator;
	public String type;
	public String name;
	public String start_time;
	public int id;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String email;
	public String privacy;
	public String logo;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String location_name;
	public String background_image;
	public String timezone;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String schedule_published_on;
	public String organizer_description;
	public VersionModel _version;

	public RootModel(String topic, CreatorModel creator, String type, String name, String start_time, int id, CopyrightModel copyright, String organizer_name, String email, String privacy, String logo, String state, Call_for_papersModel call_for_papers, String end_time, String location_name, String background_image, String timezone, String code_of_conduct, ArrayList<Social_linksModel> social_links, String description, String schedule_published_on, String organizer_description, VersionModel version) {

		this.topic = topic;
		this._creator = creator;
		this.type = type;
		this.name = name;
		this.start_time = start_time;
		this.id = id;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.email = email;
		this.privacy = privacy;
		this.logo = logo;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.location_name = location_name;
		this.background_image = background_image;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this._version = version;

	}

}