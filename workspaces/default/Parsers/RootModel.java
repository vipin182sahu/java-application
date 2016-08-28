import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String privacy;
	public String start_time;
	public String end_time;
	public String state;
	public String location_name;
	public VersionModel _version;
	public String schedule_published_on;
	public String background_image;
	public String email;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String name;
	public String topic;
	public String type;
	public String description;
	public int id;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;

	public RootModel(String organizer_description, String privacy, String start_time, String end_time, String state, String location_name, VersionModel version, String schedule_published_on, String background_image, String email, String timezone, Call_for_papersModel call_for_papers, CreatorModel creator, CopyrightModel copyright, String organizer_name, String name, String topic, String type, String description, int id, String logo, ArrayList<Social_linksModel> social_links, String code_of_conduct) {

		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.start_time = start_time;
		this.end_time = end_time;
		this.state = state;
		this.location_name = location_name;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.email = email;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.name = name;
		this.topic = topic;
		this.type = type;
		this.description = description;
		this.id = id;
		this.logo = logo;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;

	}

}