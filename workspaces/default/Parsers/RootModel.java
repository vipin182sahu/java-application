import java.util.ArrayList;

class RootModel {

	public String description;
	public String topic;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public int id;
	public String start_time;
	public String state;
	public String code_of_conduct;
	public String background_image;
	public VersionModel _version;
	public String type;
	public String end_time;
	public String timezone;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String name;
	public String organizer_description;
	public String email;

	public RootModel(String description, String topic, String privacy, ArrayList<Social_linksModel> social_links, String location_name, CreatorModel creator, Call_for_papersModel call_for_papers, String logo, int id, String start_time, String state, String code_of_conduct, String background_image, VersionModel version, String type, String end_time, String timezone, String organizer_name, CopyrightModel copyright, String schedule_published_on, String name, String organizer_description, String email) {

		this.description = description;
		this.topic = topic;
		this.privacy = privacy;
		this.social_links = social_links;
		this.location_name = location_name;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.id = id;
		this.start_time = start_time;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._version = version;
		this.type = type;
		this.end_time = end_time;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.organizer_description = organizer_description;
		this.email = email;

	}

}