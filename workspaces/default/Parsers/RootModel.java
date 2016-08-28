import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String location_name;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String organizer_description;
	public String end_time;
	public String privacy;
	public String name;
	public String type;
	public String schedule_published_on;
	public String logo;
	public int id;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String start_time;
	public String background_image;
	public String description;
	public VersionModel _version;
	public String code_of_conduct;
	public String organizer_name;
	public String topic;

	public RootModel(CopyrightModel copyright, String location_name, CreatorModel creator, Call_for_papersModel call_for_papers, String email, String organizer_description, String end_time, String privacy, String name, String type, String schedule_published_on, String logo, int id, String timezone, ArrayList<Social_linksModel> social_links, String state, String start_time, String background_image, String description, VersionModel version, String code_of_conduct, String organizer_name, String topic) {

		this._copyright = copyright;
		this.location_name = location_name;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.privacy = privacy;
		this.name = name;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.id = id;
		this.timezone = timezone;
		this.social_links = social_links;
		this.state = state;
		this.start_time = start_time;
		this.background_image = background_image;
		this.description = description;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.topic = topic;

	}

}