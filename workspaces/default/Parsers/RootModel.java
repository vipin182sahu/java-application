import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String end_time;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String privacy;
	public String email;
	public String background_image;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String logo;
	public String state;
	public String topic;
	public String location_name;
	public String organizer_description;
	public String schedule_published_on;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String start_time;
	public String organizer_name;
	public String name;
	public String timezone;

	public RootModel(VersionModel version, String end_time, int id, ArrayList<Social_linksModel> social_links, String type, String privacy, String email, String background_image, CopyrightModel copyright, Call_for_papersModel call_for_papers, String description, String logo, String state, String topic, String location_name, String organizer_description, String schedule_published_on, String code_of_conduct, CreatorModel creator, String start_time, String organizer_name, String name, String timezone) {

		this._version = version;
		this.end_time = end_time;
		this.id = id;
		this.social_links = social_links;
		this.type = type;
		this.privacy = privacy;
		this.email = email;
		this.background_image = background_image;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.logo = logo;
		this.state = state;
		this.topic = topic;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.name = name;
		this.timezone = timezone;

	}

}