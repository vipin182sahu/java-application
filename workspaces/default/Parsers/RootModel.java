import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String logo;
	public String name;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String timezone;
	public String email;
	public String type;
	public String organizer_description;
	public String location_name;
	public VersionModel _version;
	public int id;
	public String background_image;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String start_time;
	public String description;
	public String topic;
	public CreatorModel _creator;
	public String code_of_conduct;

	public RootModel(String end_time, String logo, String name, String state, ArrayList<Social_linksModel> social_links, String schedule_published_on, Call_for_papersModel call_for_papers, String privacy, String timezone, String email, String type, String organizer_description, String location_name, VersionModel version, int id, String background_image, CopyrightModel copyright, String organizer_name, String start_time, String description, String topic, CreatorModel creator, String code_of_conduct) {

		this.end_time = end_time;
		this.logo = logo;
		this.name = name;
		this.state = state;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.timezone = timezone;
		this.email = email;
		this.type = type;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this._version = version;
		this.id = id;
		this.background_image = background_image;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.description = description;
		this.topic = topic;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;

	}

}