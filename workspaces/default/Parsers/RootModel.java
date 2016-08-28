import java.util.ArrayList;

class RootModel {

	public String state;
	public String timezone;
	public String location_name;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String background_image;
	public String start_time;
	public String end_time;
	public String name;
	public String topic;
	public String description;
	public String logo;
	public String privacy;
	public int id;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String type;
	public CreatorModel _creator;
	public String organizer_name;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String email;

	public RootModel(String state, String timezone, String location_name, String organizer_description, Call_for_papersModel call_for_papers, String code_of_conduct, String background_image, String start_time, String end_time, String name, String topic, String description, String logo, String privacy, int id, VersionModel version, CopyrightModel copyright, String type, CreatorModel creator, String organizer_name, String schedule_published_on, ArrayList<Social_linksModel> social_links, String email) {

		this.state = state;
		this.timezone = timezone;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.start_time = start_time;
		this.end_time = end_time;
		this.name = name;
		this.topic = topic;
		this.description = description;
		this.logo = logo;
		this.privacy = privacy;
		this.id = id;
		this._version = version;
		this._copyright = copyright;
		this.type = type;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.email = email;

	}

}