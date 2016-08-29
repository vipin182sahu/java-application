import java.util.ArrayList;

class RootModel {

	public String logo;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String background_image;
	public VersionModel _version;
	public String name;
	public String start_time;
	public String timezone;
	public String topic;
	public String state;
	public String privacy;
	public String schedule_published_on;
	public String location_name;
	public String organizer_description;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String end_time;
	public String organizer_name;
	public String email;

	public RootModel(String logo, CopyrightModel copyright, String code_of_conduct, String background_image, VersionModel version, String name, String start_time, String timezone, String topic, String state, String privacy, String schedule_published_on, String location_name, String organizer_description, CreatorModel creator, Call_for_papersModel call_for_papers, String description, String type, ArrayList<Social_linksModel> social_links, int id, String end_time, String organizer_name, String email) {

		this.logo = logo;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._version = version;
		this.name = name;
		this.start_time = start_time;
		this.timezone = timezone;
		this.topic = topic;
		this.state = state;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.type = type;
		this.social_links = social_links;
		this.id = id;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.email = email;

	}

}