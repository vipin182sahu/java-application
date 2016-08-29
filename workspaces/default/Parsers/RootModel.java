import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String schedule_published_on;
	public VersionModel _version;
	public String start_time;
	public String end_time;
	public String background_image;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String organizer_name;
	public String topic;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public int id;
	public String name;
	public String location_name;
	public CreatorModel _creator;
	public String description;
	public String state;
	public String email;

	public RootModel(String privacy, String schedule_published_on, VersionModel version, String start_time, String end_time, String background_image, CopyrightModel copyright, String code_of_conduct, String organizer_name, String topic, String timezone, Call_for_papersModel call_for_papers, String type, String logo, ArrayList<Social_linksModel> social_links, String organizer_description, int id, String name, String location_name, CreatorModel creator, String description, String state, String email) {

		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.start_time = start_time;
		this.end_time = end_time;
		this.background_image = background_image;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.logo = logo;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.id = id;
		this.name = name;
		this.location_name = location_name;
		this._creator = creator;
		this.description = description;
		this.state = state;
		this.email = email;

	}

}