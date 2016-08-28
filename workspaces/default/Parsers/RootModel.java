import java.util.ArrayList;

class RootModel {

	public String start_time;
	public VersionModel _version;
	public String schedule_published_on;
	public String background_image;
	public String name;
	public int id;
	public String topic;
	public String logo;
	public String state;
	public String end_time;
	public String privacy;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String organizer_description;
	public String email;
	public String description;
	public String timezone;
	public String organizer_name;
	public String location_name;
	public String type;
	public String code_of_conduct;

	public RootModel(String start_time, VersionModel version, String schedule_published_on, String background_image, String name, int id, String topic, String logo, String state, String end_time, String privacy, CopyrightModel copyright, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, CreatorModel creator, String organizer_description, String email, String description, String timezone, String organizer_name, String location_name, String type, String code_of_conduct) {

		this.start_time = start_time;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.name = name;
		this.id = id;
		this.topic = topic;
		this.logo = logo;
		this.state = state;
		this.end_time = end_time;
		this.privacy = privacy;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.email = email;
		this.description = description;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.type = type;
		this.code_of_conduct = code_of_conduct;

	}

}