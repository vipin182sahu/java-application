import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String end_time;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String type;
	public String background_image;
	public int id;
	public String privacy;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String email;
	public String state;
	public String name;
	public String location_name;
	public String organizer_description;
	public String start_time;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String topic;
	public String organizer_name;
	public String timezone;

	public RootModel(VersionModel version, String end_time, CreatorModel creator, CopyrightModel copyright, String type, String background_image, int id, String privacy, String schedule_published_on, Call_for_papersModel call_for_papers, String logo, String email, String state, String name, String location_name, String organizer_description, String start_time, String description, ArrayList<Social_linksModel> social_links, String code_of_conduct, String topic, String organizer_name, String timezone) {

		this._version = version;
		this.end_time = end_time;
		this._creator = creator;
		this._copyright = copyright;
		this.type = type;
		this.background_image = background_image;
		this.id = id;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.email = email;
		this.state = state;
		this.name = name;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.description = description;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.timezone = timezone;

	}

}