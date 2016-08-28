import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String organizer_description;
	public String timezone;
	public CreatorModel _creator;
	public String start_time;
	public String email;
	public VersionModel _version;
	public String organizer_name;
	public String logo;
	public String schedule_published_on;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String end_time;
	public String background_image;
	public String state;
	public String location_name;
	public String name;
	public String description;
	public CopyrightModel _copyright;
	public String type;

	public RootModel(String privacy, String organizer_description, String timezone, CreatorModel creator, String start_time, String email, VersionModel version, String organizer_name, String logo, String schedule_published_on, String code_of_conduct, ArrayList<Social_linksModel> social_links, int id, Call_for_papersModel call_for_papers, String topic, String end_time, String background_image, String state, String location_name, String name, String description, CopyrightModel copyright, String type) {

		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this._creator = creator;
		this.start_time = start_time;
		this.email = email;
		this._version = version;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.end_time = end_time;
		this.background_image = background_image;
		this.state = state;
		this.location_name = location_name;
		this.name = name;
		this.description = description;
		this._copyright = copyright;
		this.type = type;

	}

}