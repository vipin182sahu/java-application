import java.util.ArrayList;

class RootModel {

	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String timezone;
	public String topic;
	public VersionModel _version;
	public String location_name;
	public CopyrightModel _copyright;
	public String privacy;
	public String schedule_published_on;
	public int id;
	public String code_of_conduct;
	public String start_time;
	public String end_time;
	public String description;
	public String organizer_name;
	public String logo;
	public String background_image;
	public String name;
	public String state;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String type;

	public RootModel(String email, ArrayList<Social_linksModel> social_links, String organizer_description, String timezone, String topic, VersionModel version, String location_name, CopyrightModel copyright, String privacy, String schedule_published_on, int id, String code_of_conduct, String start_time, String end_time, String description, String organizer_name, String logo, String background_image, String name, String state, CreatorModel creator, Call_for_papersModel call_for_papers, String type) {

		this.email = email;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.topic = topic;
		this._version = version;
		this.location_name = location_name;
		this._copyright = copyright;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.end_time = end_time;
		this.description = description;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.background_image = background_image;
		this.name = name;
		this.state = state;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.type = type;

	}

}