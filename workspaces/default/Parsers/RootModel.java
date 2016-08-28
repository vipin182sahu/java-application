import java.util.ArrayList;

class RootModel {

	public String description;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String organizer_name;
	public String name;
	public String state;
	public int id;
	public String end_time;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String background_image;
	public CreatorModel _creator;
	public String organizer_description;
	public VersionModel _version;
	public String location_name;
	public String logo;
	public String schedule_published_on;
	public String timezone;
	public String topic;
	public String privacy;
	public String type;

	public RootModel(String description, String code_of_conduct, Call_for_papersModel call_for_papers, String email, String organizer_name, String name, String state, int id, String end_time, String start_time, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String background_image, CreatorModel creator, String organizer_description, VersionModel version, String location_name, String logo, String schedule_published_on, String timezone, String topic, String privacy, String type) {

		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.organizer_name = organizer_name;
		this.name = name;
		this.state = state;
		this.id = id;
		this.end_time = end_time;
		this.start_time = start_time;
		this.social_links = social_links;
		this._copyright = copyright;
		this.background_image = background_image;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this._version = version;
		this.location_name = location_name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.topic = topic;
		this.privacy = privacy;
		this.type = type;

	}

}