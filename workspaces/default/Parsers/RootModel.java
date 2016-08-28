import java.util.ArrayList;

class RootModel {

	public String description;
	public String location_name;
	public String code_of_conduct;
	public String end_time;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public CreatorModel _creator;
	public String logo;
	public CopyrightModel _copyright;
	public String privacy;
	public String schedule_published_on;
	public String topic;
	public String organizer_name;
	public String start_time;
	public String email;
	public String state;
	public int id;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String name;
	public VersionModel _version;

	public RootModel(String description, String location_name, String code_of_conduct, String end_time, String organizer_description, Call_for_papersModel call_for_papers, String timezone, CreatorModel creator, String logo, CopyrightModel copyright, String privacy, String schedule_published_on, String topic, String organizer_name, String start_time, String email, String state, int id, String type, ArrayList<Social_linksModel> social_links, String background_image, String name, VersionModel version) {

		this.description = description;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this._creator = creator;
		this.logo = logo;
		this._copyright = copyright;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.email = email;
		this.state = state;
		this.id = id;
		this.type = type;
		this.social_links = social_links;
		this.background_image = background_image;
		this.name = name;
		this._version = version;

	}

}