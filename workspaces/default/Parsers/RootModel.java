import java.util.ArrayList;

class RootModel {

	public String logo;
	public CopyrightModel _copyright;
	public String end_time;
	public String state;
	public String schedule_published_on;
	public String location_name;
	public String organizer_name;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String background_image;
	public String description;
	public CreatorModel _creator;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public int id;
	public String email;
	public String code_of_conduct;
	public String topic;
	public String timezone;
	public String privacy;
	public VersionModel _version;

	public RootModel(String logo, CopyrightModel copyright, String end_time, String state, String schedule_published_on, String location_name, String organizer_name, String name, Call_for_papersModel call_for_papers, String start_time, String background_image, String description, CreatorModel creator, String type, ArrayList<Social_linksModel> social_links, String organizer_description, int id, String email, String code_of_conduct, String topic, String timezone, String privacy, VersionModel version) {

		this.logo = logo;
		this._copyright = copyright;
		this.end_time = end_time;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.background_image = background_image;
		this.description = description;
		this._creator = creator;
		this.type = type;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.id = id;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.timezone = timezone;
		this.privacy = privacy;
		this._version = version;

	}

}