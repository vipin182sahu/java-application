import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String end_time;
	public String timezone;
	public String description;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public CopyrightModel _copyright;
	public String privacy;
	public String state;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String logo;
	public String name;
	public VersionModel _version;
	public int id;
	public String organizer_description;
	public String email;
	public String organizer_name;
	public String schedule_published_on;
	public String topic;
	public String type;

	public RootModel(String background_image, String end_time, String timezone, String description, String location_name, ArrayList<Social_linksModel> social_links, String start_time, CopyrightModel copyright, String privacy, String state, CreatorModel creator, Call_for_papersModel call_for_papers, String code_of_conduct, String logo, String name, VersionModel version, int id, String organizer_description, String email, String organizer_name, String schedule_published_on, String topic, String type) {

		this.background_image = background_image;
		this.end_time = end_time;
		this.timezone = timezone;
		this.description = description;
		this.location_name = location_name;
		this.social_links = social_links;
		this.start_time = start_time;
		this._copyright = copyright;
		this.privacy = privacy;
		this.state = state;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.name = name;
		this._version = version;
		this.id = id;
		this.organizer_description = organizer_description;
		this.email = email;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.type = type;

	}

}