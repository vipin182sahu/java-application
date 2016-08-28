import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String schedule_published_on;
	public String timezone;
	public String privacy;
	public CopyrightModel _copyright;
	public String state;
	public String description;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String organizer_name;
	public String logo;
	public int id;
	public String start_time;
	public String organizer_description;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String background_image;
	public String location_name;
	public CreatorModel _creator;
	public String email;
	public VersionModel _version;

	public RootModel(String code_of_conduct, String schedule_published_on, String timezone, String privacy, CopyrightModel copyright, String state, String description, String type, ArrayList<Social_linksModel> social_links, String end_time, String organizer_name, String logo, int id, String start_time, String organizer_description, String name, Call_for_papersModel call_for_papers, String topic, String background_image, String location_name, CreatorModel creator, String email, VersionModel version) {

		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.privacy = privacy;
		this._copyright = copyright;
		this.state = state;
		this.description = description;
		this.type = type;
		this.social_links = social_links;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.id = id;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.background_image = background_image;
		this.location_name = location_name;
		this._creator = creator;
		this.email = email;
		this._version = version;

	}

}