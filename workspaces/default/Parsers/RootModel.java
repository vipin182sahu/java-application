import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String organizer_name;
	public String privacy;
	public String logo;
	public String schedule_published_on;
	public String background_image;
	public String code_of_conduct;
	public String topic;
	public String timezone;
	public String start_time;
	public String name;
	public String end_time;
	public String location_name;
	public CreatorModel _creator;
	public String description;
	public CopyrightModel _copyright;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String email;

	public RootModel(String organizer_description, String type, ArrayList<Social_linksModel> social_links, VersionModel version, String organizer_name, String privacy, String logo, String schedule_published_on, String background_image, String code_of_conduct, String topic, String timezone, String start_time, String name, String end_time, String location_name, CreatorModel creator, String description, CopyrightModel copyright, String state, Call_for_papersModel call_for_papers, int id, String email) {

		this.organizer_description = organizer_description;
		this.type = type;
		this.social_links = social_links;
		this._version = version;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.timezone = timezone;
		this.start_time = start_time;
		this.name = name;
		this.end_time = end_time;
		this.location_name = location_name;
		this._creator = creator;
		this.description = description;
		this._copyright = copyright;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.email = email;

	}

}