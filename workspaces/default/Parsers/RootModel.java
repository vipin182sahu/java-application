import java.util.ArrayList;

class RootModel {

	public String type;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String background_image;
	public String timezone;
	public int id;
	public String schedule_published_on;
	public String state;
	public String location_name;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String topic;
	public String logo;
	public String description;
	public VersionModel _version;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String privacy;
	public String organizer_name;
	public String end_time;
	public String code_of_conduct;

	public RootModel(String type, String name, ArrayList<Social_linksModel> social_links, String email, String background_image, String timezone, int id, String schedule_published_on, String state, String location_name, CreatorModel creator, CopyrightModel copyright, String topic, String logo, String description, VersionModel version, String start_time, Call_for_papersModel call_for_papers, String organizer_description, String privacy, String organizer_name, String end_time, String code_of_conduct) {

		this.type = type;
		this.name = name;
		this.social_links = social_links;
		this.email = email;
		this.background_image = background_image;
		this.timezone = timezone;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.location_name = location_name;
		this._creator = creator;
		this._copyright = copyright;
		this.topic = topic;
		this.logo = logo;
		this.description = description;
		this._version = version;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;

	}

}