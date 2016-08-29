import java.util.ArrayList;

class RootModel {

	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String code_of_conduct;
	public String organizer_description;
	public String schedule_published_on;
	public String privacy;
	public int id;
	public String timezone;
	public String logo;
	public String state;
	public VersionModel _version;
	public String background_image;
	public String start_time;
	public String location_name;
	public String end_time;
	public String description;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String name;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String type;

	public RootModel(String topic, Call_for_papersModel call_for_papers, String organizer_name, String code_of_conduct, String organizer_description, String schedule_published_on, String privacy, int id, String timezone, String logo, String state, VersionModel version, String background_image, String start_time, String location_name, String end_time, String description, CopyrightModel copyright, CreatorModel creator, String name, String email, ArrayList<Social_linksModel> social_links, String type) {

		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.id = id;
		this.timezone = timezone;
		this.logo = logo;
		this.state = state;
		this._version = version;
		this.background_image = background_image;
		this.start_time = start_time;
		this.location_name = location_name;
		this.end_time = end_time;
		this.description = description;
		this._copyright = copyright;
		this._creator = creator;
		this.name = name;
		this.email = email;
		this.social_links = social_links;
		this.type = type;

	}

}