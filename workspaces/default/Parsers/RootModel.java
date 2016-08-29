import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String topic;
	public String state;
	public String type;
	public String name;
	public String end_time;
	public String logo;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String privacy;
	public String description;
	public CreatorModel _creator;
	public VersionModel _version;
	public int id;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String organizer_name;
	public String location_name;
	public String code_of_conduct;

	public RootModel(String background_image, String schedule_published_on, CopyrightModel copyright, String topic, String state, String type, String name, String end_time, String logo, String timezone, Call_for_papersModel call_for_papers, String organizer_description, String privacy, String description, CreatorModel creator, VersionModel version, int id, String start_time, ArrayList<Social_linksModel> social_links, String email, String organizer_name, String location_name, String code_of_conduct) {

		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.topic = topic;
		this.state = state;
		this.type = type;
		this.name = name;
		this.end_time = end_time;
		this.logo = logo;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.description = description;
		this._creator = creator;
		this._version = version;
		this.id = id;
		this.start_time = start_time;
		this.social_links = social_links;
		this.email = email;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;

	}

}