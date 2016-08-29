import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String background_image;
	public CreatorModel _creator;
	public String organizer_description;
	public String privacy;
	public String type;
	public String timezone;
	public String organizer_name;
	public String end_time;
	public String name;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String schedule_published_on;
	public String start_time;
	public CopyrightModel _copyright;
	public String location_name;
	public String topic;
	public String email;
	public String state;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;

	public RootModel(String code_of_conduct, String background_image, CreatorModel creator, String organizer_description, String privacy, String type, String timezone, String organizer_name, String end_time, String name, int id, ArrayList<Social_linksModel> social_links, String logo, String schedule_published_on, String start_time, CopyrightModel copyright, String location_name, String topic, String email, String state, String description, Call_for_papersModel call_for_papers, VersionModel version) {

		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.type = type;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.name = name;
		this.id = id;
		this.social_links = social_links;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this._copyright = copyright;
		this.location_name = location_name;
		this.topic = topic;
		this.email = email;
		this.state = state;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this._version = version;

	}

}