import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String description;
	public CopyrightModel _copyright;
	public String background_image;
	public String end_time;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String privacy;
	public String timezone;
	public String type;
	public String schedule_published_on;
	public String state;
	public String topic;
	public int id;
	public String start_time;
	public String email;
	public String organizer_name;
	public String logo;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public VersionModel _version;

	public RootModel(String organizer_description, String description, CopyrightModel copyright, String background_image, String end_time, CreatorModel creator, Call_for_papersModel call_for_papers, String location_name, String privacy, String timezone, String type, String schedule_published_on, String state, String topic, int id, String start_time, String email, String organizer_name, String logo, String code_of_conduct, ArrayList<Social_linksModel> social_links, String name, VersionModel version) {

		this.organizer_description = organizer_description;
		this.description = description;
		this._copyright = copyright;
		this.background_image = background_image;
		this.end_time = end_time;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.privacy = privacy;
		this.timezone = timezone;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.topic = topic;
		this.id = id;
		this.start_time = start_time;
		this.email = email;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.name = name;
		this._version = version;

	}

}