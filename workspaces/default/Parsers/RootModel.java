import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String organizer_description;
	public String start_time;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String description;
	public VersionModel _version;
	public String topic;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String background_image;
	public String organizer_name;
	public String name;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String schedule_published_on;
	public String state;
	public String logo;
	public String email;
	public String timezone;
	public String type;

	public RootModel(String end_time, String organizer_description, String start_time, String code_of_conduct, CreatorModel creator, String description, VersionModel version, String topic, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String location_name, String background_image, String organizer_name, String name, String privacy, Call_for_papersModel call_for_papers, int id, String schedule_published_on, String state, String logo, String email, String timezone, String type) {

		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.description = description;
		this._version = version;
		this.topic = topic;
		this._copyright = copyright;
		this.social_links = social_links;
		this.location_name = location_name;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.name = name;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.logo = logo;
		this.email = email;
		this.timezone = timezone;
		this.type = type;

	}

}