import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String state;
	public String schedule_published_on;
	public String topic;
	public String logo;
	public String description;
	public VersionModel _version;
	public int id;
	public String location_name;
	public String end_time;
	public String name;
	public String type;
	public CreatorModel _creator;
	public String organizer_name;
	public String background_image;
	public String timezone;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String email;

	public RootModel(String organizer_description, Call_for_papersModel call_for_papers, String privacy, String state, String schedule_published_on, String topic, String logo, String description, VersionModel version, int id, String location_name, String end_time, String name, String type, CreatorModel creator, String organizer_name, String background_image, String timezone, String code_of_conduct, CopyrightModel copyright, String start_time, ArrayList<Social_linksModel> social_links, String email) {

		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.logo = logo;
		this.description = description;
		this._version = version;
		this.id = id;
		this.location_name = location_name;
		this.end_time = end_time;
		this.name = name;
		this.type = type;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.start_time = start_time;
		this.social_links = social_links;
		this.email = email;

	}

}