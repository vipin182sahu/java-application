import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String code_of_conduct;
	public String name;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String end_time;
	public String organizer_name;
	public String state;
	public String organizer_description;
	public String background_image;
	public String email;
	public String timezone;
	public String topic;
	public String schedule_published_on;
	public String privacy;
	public int id;
	public String description;
	public String type;
	public String location_name;
	public CreatorModel _creator;

	public RootModel(String start_time, String code_of_conduct, String name, VersionModel version, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String logo, String end_time, String organizer_name, String state, String organizer_description, String background_image, String email, String timezone, String topic, String schedule_published_on, String privacy, int id, String description, String type, String location_name, CreatorModel creator) {

		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._version = version;
		this._copyright = copyright;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.state = state;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.email = email;
		this.timezone = timezone;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.id = id;
		this.description = description;
		this.type = type;
		this.location_name = location_name;
		this._creator = creator;

	}

}