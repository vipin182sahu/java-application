import java.util.ArrayList;

class RootModel {

	public String topic;
	public String organizer_description;
	public String schedule_published_on;
	public String description;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String background_image;
	public String name;
	public String end_time;
	public String privacy;
	public String timezone;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public int id;
	public String state;
	public VersionModel _version;
	public String logo;
	public String code_of_conduct;
	public String start_time;
	public String organizer_name;
	public String email;

	public RootModel(String topic, String organizer_description, String schedule_published_on, String description, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String type, String background_image, String name, String end_time, String privacy, String timezone, CreatorModel creator, Call_for_papersModel call_for_papers, String location_name, int id, String state, VersionModel version, String logo, String code_of_conduct, String start_time, String organizer_name, String email) {

		this.topic = topic;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this._copyright = copyright;
		this.social_links = social_links;
		this.type = type;
		this.background_image = background_image;
		this.name = name;
		this.end_time = end_time;
		this.privacy = privacy;
		this.timezone = timezone;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.id = id;
		this.state = state;
		this._version = version;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.email = email;

	}

}