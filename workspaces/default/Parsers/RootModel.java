import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String start_time;
	public String type;
	public VersionModel _version;
	public String logo;
	public String name;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String schedule_published_on;
	public String topic;
	public String background_image;
	public int id;
	public String description;
	public String organizer_name;
	public String organizer_description;
	public String email;
	public String state;
	public String end_time;
	public CopyrightModel _copyright;
	public String privacy;
	public String timezone;

	public RootModel(ArrayList<Social_linksModel> social_links, String location_name, String start_time, String type, VersionModel version, String logo, String name, CreatorModel creator, Call_for_papersModel call_for_papers, String code_of_conduct, String schedule_published_on, String topic, String background_image, int id, String description, String organizer_name, String organizer_description, String email, String state, String end_time, CopyrightModel copyright, String privacy, String timezone) {

		this.social_links = social_links;
		this.location_name = location_name;
		this.start_time = start_time;
		this.type = type;
		this._version = version;
		this.logo = logo;
		this.name = name;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.background_image = background_image;
		this.id = id;
		this.description = description;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.email = email;
		this.state = state;
		this.end_time = end_time;
		this._copyright = copyright;
		this.privacy = privacy;
		this.timezone = timezone;

	}

}