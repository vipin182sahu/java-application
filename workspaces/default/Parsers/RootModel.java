import java.util.ArrayList;

class RootModel {

	public String logo;
	public CopyrightModel _copyright;
	public String end_time;
	public String topic;
	public String background_image;
	public String organizer_name;
	public int id;
	public String timezone;
	public VersionModel _version;
	public String code_of_conduct;
	public String state;
	public String schedule_published_on;
	public String type;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String start_time;
	public String name;
	public String privacy;
	public String description;
	public String email;

	public RootModel(String logo, CopyrightModel copyright, String end_time, String topic, String background_image, String organizer_name, int id, String timezone, VersionModel version, String code_of_conduct, String state, String schedule_published_on, String type, CreatorModel creator, Call_for_papersModel call_for_papers, String location_name, ArrayList<Social_linksModel> social_links, String organizer_description, String start_time, String name, String privacy, String description, String email) {

		this.logo = logo;
		this._copyright = copyright;
		this.end_time = end_time;
		this.topic = topic;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.id = id;
		this.timezone = timezone;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.name = name;
		this.privacy = privacy;
		this.description = description;
		this.email = email;

	}

}