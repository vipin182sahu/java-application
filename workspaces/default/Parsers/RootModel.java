import java.util.ArrayList;

class RootModel {

	public String type;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String logo;
	public String end_time;
	public String state;
	public String organizer_description;
	public String code_of_conduct;
	public String background_image;
	public String timezone;
	public String organizer_name;
	public int id;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public CopyrightModel _copyright;
	public String description;
	public String start_time;
	public String topic;
	public String email;

	public RootModel(String type, CreatorModel creator, String schedule_published_on, String location_name, Call_for_papersModel call_for_papers, VersionModel version, String logo, String end_time, String state, String organizer_description, String code_of_conduct, String background_image, String timezone, String organizer_name, int id, String privacy, ArrayList<Social_linksModel> social_links, String name, CopyrightModel copyright, String description, String start_time, String topic, String email) {

		this.type = type;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.logo = logo;
		this.end_time = end_time;
		this.state = state;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.id = id;
		this.privacy = privacy;
		this.social_links = social_links;
		this.name = name;
		this._copyright = copyright;
		this.description = description;
		this.start_time = start_time;
		this.topic = topic;
		this.email = email;

	}

}