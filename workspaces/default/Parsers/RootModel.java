import java.util.ArrayList;

class RootModel {

	public int id;
	public String logo;
	public String background_image;
	public String code_of_conduct;
	public String location_name;
	public VersionModel _version;
	public String description;
	public String state;
	public String type;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String organizer_name;
	public CreatorModel _creator;
	public String email;
	public String start_time;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String organizer_description;
	public String end_time;
	public String name;

	public RootModel(int id, String logo, String background_image, String code_of_conduct, String location_name, VersionModel version, String description, String state, String type, String schedule_published_on, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String topic, String organizer_name, CreatorModel creator, String email, String start_time, String privacy, Call_for_papersModel call_for_papers, String timezone, String organizer_description, String end_time, String name) {

		this.id = id;
		this.logo = logo;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this._version = version;
		this.description = description;
		this.state = state;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.social_links = social_links;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.email = email;
		this.start_time = start_time;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.name = name;

	}

}