import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String organizer_name;
	public String start_time;
	public String description;
	public String schedule_published_on;
	public String privacy;
	public String logo;
	public String background_image;
	public String state;
	public String name;
	public String type;
	public String code_of_conduct;
	public String topic;
	public String timezone;
	public String organizer_description;
	public CopyrightModel _copyright;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String location_name;
	public VersionModel _version;

	public RootModel(String end_time, String organizer_name, String start_time, String description, String schedule_published_on, String privacy, String logo, String background_image, String state, String name, String type, String code_of_conduct, String topic, String timezone, String organizer_description, CopyrightModel copyright, int id, ArrayList<Social_linksModel> social_links, String email, Call_for_papersModel call_for_papers, CreatorModel creator, String location_name, VersionModel version) {

		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.logo = logo;
		this.background_image = background_image;
		this.state = state;
		this.name = name;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.id = id;
		this.social_links = social_links;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.location_name = location_name;
		this._version = version;

	}

}