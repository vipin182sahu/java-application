import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String topic;
	public String organizer_name;
	public CreatorModel _creator;
	public String location_name;
	public String timezone;
	public String name;
	public String organizer_description;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public int id;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String logo;
	public String state;
	public String start_time;
	public String schedule_published_on;
	public String email;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String type;

	public RootModel(String privacy, String topic, String organizer_name, CreatorModel creator, String location_name, String timezone, String name, String organizer_description, VersionModel version, CopyrightModel copyright, int id, String background_image, ArrayList<Social_linksModel> social_links, String end_time, String logo, String state, String start_time, String schedule_published_on, String email, String code_of_conduct, Call_for_papersModel call_for_papers, String description, String type) {

		this.privacy = privacy;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.location_name = location_name;
		this.timezone = timezone;
		this.name = name;
		this.organizer_description = organizer_description;
		this._version = version;
		this._copyright = copyright;
		this.id = id;
		this.background_image = background_image;
		this.social_links = social_links;
		this.end_time = end_time;
		this.logo = logo;
		this.state = state;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.type = type;

	}

}