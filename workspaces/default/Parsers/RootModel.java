import java.util.ArrayList;

class RootModel {

	public int id;
	public VersionModel _version;
	public String organizer_description;
	public String email;
	public String location_name;
	public String background_image;
	public String type;
	public String description;
	public String start_time;
	public String code_of_conduct;
	public String schedule_published_on;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String organizer_name;
	public String state;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String logo;
	public String timezone;

	public RootModel(int id, VersionModel version, String organizer_description, String email, String location_name, String background_image, String type, String description, String start_time, String code_of_conduct, String schedule_published_on, String topic, ArrayList<Social_linksModel> social_links, String privacy, String organizer_name, String state, CreatorModel creator, CopyrightModel copyright, String end_time, Call_for_papersModel call_for_papers, String name, String logo, String timezone) {

		this.id = id;
		this._version = version;
		this.organizer_description = organizer_description;
		this.email = email;
		this.location_name = location_name;
		this.background_image = background_image;
		this.type = type;
		this.description = description;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.social_links = social_links;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.state = state;
		this._creator = creator;
		this._copyright = copyright;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.logo = logo;
		this.timezone = timezone;

	}

}