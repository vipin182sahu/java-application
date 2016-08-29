import java.util.ArrayList;

class RootModel {

	public String name;
	public String state;
	public String background_image;
	public String topic;
	public String logo;
	public String privacy;
	public String email;
	public String organizer_description;
	public String timezone;
	public String start_time;
	public VersionModel _version;
	public String end_time;
	public String organizer_name;
	public String code_of_conduct;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public int id;
	public String type;

	public RootModel(String name, String state, String background_image, String topic, String logo, String privacy, String email, String organizer_description, String timezone, String start_time, VersionModel version, String end_time, String organizer_name, String code_of_conduct, String description, ArrayList<Social_linksModel> social_links, String schedule_published_on, CopyrightModel copyright, String location_name, Call_for_papersModel call_for_papers, CreatorModel creator, int id, String type) {

		this.name = name;
		this.state = state;
		this.background_image = background_image;
		this.topic = topic;
		this.logo = logo;
		this.privacy = privacy;
		this.email = email;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.start_time = start_time;
		this._version = version;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.id = id;
		this.type = type;

	}

}