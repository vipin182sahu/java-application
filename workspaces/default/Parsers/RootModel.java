import java.util.ArrayList;

class RootModel {

	public int id;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String name;
	public String organizer_description;
	public String state;
	public String code_of_conduct;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String email;
	public String timezone;
	public String start_time;
	public String organizer_name;
	public String logo;
	public String description;
	public String background_image;
	public String type;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String location_name;

	public RootModel(int id, CopyrightModel copyright, VersionModel version, Call_for_papersModel call_for_papers, String privacy, String name, String organizer_description, String state, String code_of_conduct, String schedule_published_on, CreatorModel creator, String email, String timezone, String start_time, String organizer_name, String logo, String description, String background_image, String type, String end_time, ArrayList<Social_linksModel> social_links, String topic, String location_name) {

		this.id = id;
		this._copyright = copyright;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.name = name;
		this.organizer_description = organizer_description;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.email = email;
		this.timezone = timezone;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.description = description;
		this.background_image = background_image;
		this.type = type;
		this.end_time = end_time;
		this.social_links = social_links;
		this.topic = topic;
		this.location_name = location_name;

	}

}