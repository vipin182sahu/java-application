import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public int id;
	public String logo;
	public String organizer_description;
	public String start_time;
	public String topic;
	public String background_image;
	public String description;
	public String name;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String timezone;
	public String state;
	public String location_name;
	public String privacy;
	public String end_time;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String type;

	public RootModel(String schedule_published_on, int id, String logo, String organizer_description, String start_time, String topic, String background_image, String description, String name, String email, Call_for_papersModel call_for_papers, String organizer_name, String timezone, String state, String location_name, String privacy, String end_time, CopyrightModel copyright, CreatorModel creator, String code_of_conduct, ArrayList<Social_linksModel> social_links, VersionModel version, String type) {

		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.topic = topic;
		this.background_image = background_image;
		this.description = description;
		this.name = name;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.state = state;
		this.location_name = location_name;
		this.privacy = privacy;
		this.end_time = end_time;
		this._copyright = copyright;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this._version = version;
		this.type = type;

	}

}