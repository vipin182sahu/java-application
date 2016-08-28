import java.util.ArrayList;

class RootModel {

	public String topic;
	public String schedule_published_on;
	public String location_name;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String background_image;
	public String start_time;
	public String logo;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String state;
	public VersionModel _version;
	public String timezone;
	public String email;
	public int id;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String description;
	public String code_of_conduct;
	public String privacy;
	public String type;

	public RootModel(String topic, String schedule_published_on, String location_name, String name, Call_for_papersModel call_for_papers, String organizer_description, String background_image, String start_time, String logo, String end_time, ArrayList<Social_linksModel> social_links, String organizer_name, String state, VersionModel version, String timezone, String email, int id, CreatorModel creator, CopyrightModel copyright, String description, String code_of_conduct, String privacy, String type) {

		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.start_time = start_time;
		this.logo = logo;
		this.end_time = end_time;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.state = state;
		this._version = version;
		this.timezone = timezone;
		this.email = email;
		this.id = id;
		this._creator = creator;
		this._copyright = copyright;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.type = type;

	}

}