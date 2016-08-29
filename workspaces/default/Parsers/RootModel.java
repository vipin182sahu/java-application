import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String logo;
	public String schedule_published_on;
	public String code_of_conduct;
	public String end_time;
	public String name;
	public String topic;
	public String state;
	public int id;
	public String background_image;
	public CopyrightModel _copyright;
	public String description;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String organizer_name;
	public String start_time;
	public CreatorModel _creator;
	public String type;
	public String organizer_description;
	public String privacy;
	public String location_name;

	public RootModel(ArrayList<Social_linksModel> social_links, VersionModel version, String logo, String schedule_published_on, String code_of_conduct, String end_time, String name, String topic, String state, int id, String background_image, CopyrightModel copyright, String description, String timezone, Call_for_papersModel call_for_papers, String email, String organizer_name, String start_time, CreatorModel creator, String type, String organizer_description, String privacy, String location_name) {

		this.social_links = social_links;
		this._version = version;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.name = name;
		this.topic = topic;
		this.state = state;
		this.id = id;
		this.background_image = background_image;
		this._copyright = copyright;
		this.description = description;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this._creator = creator;
		this.type = type;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.location_name = location_name;

	}

}