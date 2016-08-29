import java.util.ArrayList;

class RootModel {

	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String type;
	public int id;
	public CopyrightModel _copyright;
	public String state;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String description;
	public String timezone;
	public String background_image;
	public String end_time;
	public String privacy;
	public String name;
	public String organizer_name;
	public String organizer_description;
	public String schedule_published_on;
	public VersionModel _version;
	public String topic;

	public RootModel(String location_name, ArrayList<Social_linksModel> social_links, String email, String type, int id, CopyrightModel copyright, String state, String start_time, Call_for_papersModel call_for_papers, String logo, String code_of_conduct, CreatorModel creator, String description, String timezone, String background_image, String end_time, String privacy, String name, String organizer_name, String organizer_description, String schedule_published_on, VersionModel version, String topic) {

		this.location_name = location_name;
		this.social_links = social_links;
		this.email = email;
		this.type = type;
		this.id = id;
		this._copyright = copyright;
		this.state = state;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.description = description;
		this.timezone = timezone;
		this.background_image = background_image;
		this.end_time = end_time;
		this.privacy = privacy;
		this.name = name;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.topic = topic;

	}

}