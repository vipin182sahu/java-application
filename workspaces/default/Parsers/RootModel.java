import java.util.ArrayList;

class RootModel {

	public String topic;
	public String code_of_conduct;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String logo;
	public String background_image;
	public int id;
	public String organizer_description;
	public CreatorModel _creator;
	public String state;
	public String schedule_published_on;
	public String description;
	public String location_name;
	public String type;
	public String name;
	public String privacy;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String email;

	public RootModel(String topic, String code_of_conduct, String start_time, ArrayList<Social_linksModel> social_links, String end_time, String logo, String background_image, int id, String organizer_description, CreatorModel creator, String state, String schedule_published_on, String description, String location_name, String type, String name, String privacy, VersionModel version, CopyrightModel copyright, String organizer_name, Call_for_papersModel call_for_papers, String timezone, String email) {

		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.social_links = social_links;
		this.end_time = end_time;
		this.logo = logo;
		this.background_image = background_image;
		this.id = id;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.location_name = location_name;
		this.type = type;
		this.name = name;
		this.privacy = privacy;
		this._version = version;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.email = email;

	}

}