import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String location_name;
	public int id;
	public CreatorModel _creator;
	public String background_image;
	public String state;
	public String code_of_conduct;
	public String logo;
	public String topic;
	public String type;
	public VersionModel _version;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String description;
	public String timezone;
	public String start_time;
	public String organizer_name;
	public String privacy;
	public String organizer_description;
	public String email;

	public RootModel(String end_time, String location_name, int id, CreatorModel creator, String background_image, String state, String code_of_conduct, String logo, String topic, String type, VersionModel version, String schedule_published_on, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, Call_for_papersModel call_for_papers, String name, String description, String timezone, String start_time, String organizer_name, String privacy, String organizer_description, String email) {

		this.end_time = end_time;
		this.location_name = location_name;
		this.id = id;
		this._creator = creator;
		this.background_image = background_image;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.topic = topic;
		this.type = type;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.description = description;
		this.timezone = timezone;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.email = email;

	}

}