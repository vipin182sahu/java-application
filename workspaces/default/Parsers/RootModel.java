import java.util.ArrayList;

class RootModel {

	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String state;
	public CopyrightModel _copyright;
	public String description;
	public String name;
	public String start_time;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String organizer_description;
	public CreatorModel _creator;
	public String type;
	public String logo;
	public int id;
	public String code_of_conduct;
	public String organizer_name;
	public String topic;
	public String schedule_published_on;
	public String timezone;
	public String end_time;
	public VersionModel _version;

	public RootModel(String background_image, ArrayList<Social_linksModel> social_links, String email, String state, CopyrightModel copyright, String description, String name, String start_time, String location_name, Call_for_papersModel call_for_papers, String privacy, String organizer_description, CreatorModel creator, String type, String logo, int id, String code_of_conduct, String organizer_name, String topic, String schedule_published_on, String timezone, String end_time, VersionModel version) {

		this.background_image = background_image;
		this.social_links = social_links;
		this.email = email;
		this.state = state;
		this._copyright = copyright;
		this.description = description;
		this.name = name;
		this.start_time = start_time;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.type = type;
		this.logo = logo;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.end_time = end_time;
		this._version = version;

	}

}