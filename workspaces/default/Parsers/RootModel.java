import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public VersionModel _version;
	public String type;
	public String organizer_name;
	public String name;
	public String schedule_published_on;
	public String state;
	public String start_time;
	public String background_image;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String organizer_description;
	public String code_of_conduct;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String email;
	public String timezone;
	public int id;
	public String logo;
	public CreatorModel _creator;
	public String end_time;

	public RootModel(CopyrightModel copyright, VersionModel version, String type, String organizer_name, String name, String schedule_published_on, String state, String start_time, String background_image, String topic, ArrayList<Social_linksModel> social_links, String privacy, String organizer_description, String code_of_conduct, String location_name, Call_for_papersModel call_for_papers, String description, String email, String timezone, int id, String logo, CreatorModel creator, String end_time) {

		this._copyright = copyright;
		this._version = version;
		this.type = type;
		this.organizer_name = organizer_name;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.start_time = start_time;
		this.background_image = background_image;
		this.topic = topic;
		this.social_links = social_links;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.email = email;
		this.timezone = timezone;
		this.id = id;
		this.logo = logo;
		this._creator = creator;
		this.end_time = end_time;

	}

}