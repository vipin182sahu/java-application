import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String code_of_conduct;
	public int id;
	public String background_image;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String state;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String timezone;
	public String description;
	public String schedule_published_on;
	public String topic;
	public VersionModel _version;
	public String start_time;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String name;
	public String privacy;
	public String location_name;
	public String email;

	public RootModel(String end_time, String code_of_conduct, int id, String background_image, CreatorModel creator, Call_for_papersModel call_for_papers, String organizer_description, String state, String logo, ArrayList<Social_linksModel> social_links, String type, String timezone, String description, String schedule_published_on, String topic, VersionModel version, String start_time, String organizer_name, CopyrightModel copyright, String name, String privacy, String location_name, String email) {

		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.background_image = background_image;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.state = state;
		this.logo = logo;
		this.social_links = social_links;
		this.type = type;
		this.timezone = timezone;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this._version = version;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.name = name;
		this.privacy = privacy;
		this.location_name = location_name;
		this.email = email;

	}

}