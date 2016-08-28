import java.util.ArrayList;

class RootModel {

	public String end_time;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String email;
	public String location_name;
	public String topic;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public int id;
	public String organizer_name;
	public String type;
	public String state;
	public String timezone;
	public String background_image;
	public String organizer_description;
	public String start_time;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public CopyrightModel _copyright;
	public String privacy;
	public String code_of_conduct;

	public RootModel(String end_time, CreatorModel creator, String schedule_published_on, String email, String location_name, String topic, String name, Call_for_papersModel call_for_papers, VersionModel version, int id, String organizer_name, String type, String state, String timezone, String background_image, String organizer_description, String start_time, String description, ArrayList<Social_linksModel> social_links, String logo, CopyrightModel copyright, String privacy, String code_of_conduct) {

		this.end_time = end_time;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.location_name = location_name;
		this.topic = topic;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.id = id;
		this.organizer_name = organizer_name;
		this.type = type;
		this.state = state;
		this.timezone = timezone;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.description = description;
		this.social_links = social_links;
		this.logo = logo;
		this._copyright = copyright;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;

	}

}