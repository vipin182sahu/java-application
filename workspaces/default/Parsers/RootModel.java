import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String end_time;
	public String description;
	public CopyrightModel _copyright;
	public String email;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String background_image;
	public String logo;
	public String schedule_published_on;
	public String topic;
	public String name;
	public String code_of_conduct;
	public String timezone;
	public String organizer_description;
	public String start_time;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String location_name;
	public CreatorModel _creator;
	public VersionModel _version;

	public RootModel(String organizer_name, String end_time, String description, CopyrightModel copyright, String email, int id, ArrayList<Social_linksModel> social_links, String type, String background_image, String logo, String schedule_published_on, String topic, String name, String code_of_conduct, String timezone, String organizer_description, String start_time, String state, Call_for_papersModel call_for_papers, String privacy, String location_name, CreatorModel creator, VersionModel version) {

		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.description = description;
		this._copyright = copyright;
		this.email = email;
		this.id = id;
		this.social_links = social_links;
		this.type = type;
		this.background_image = background_image;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.location_name = location_name;
		this._creator = creator;
		this._version = version;

	}

}