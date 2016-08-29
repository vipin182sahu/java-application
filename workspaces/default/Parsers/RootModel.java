import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String name;
	public String location_name;
	public String state;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String organizer_description;
	public int id;
	public String privacy;
	public String topic;
	public String email;
	public String type;
	public VersionModel _version;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String timezone;
	public String start_time;
	public String description;
	public String end_time;
	public CreatorModel _creator;

	public RootModel(String schedule_published_on, ArrayList<Social_linksModel> social_links, String background_image, String name, String location_name, String state, CopyrightModel copyright, String code_of_conduct, String organizer_description, int id, String privacy, String topic, String email, String type, VersionModel version, String logo, Call_for_papersModel call_for_papers, String organizer_name, String timezone, String start_time, String description, String end_time, CreatorModel creator) {

		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.background_image = background_image;
		this.name = name;
		this.location_name = location_name;
		this.state = state;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.id = id;
		this.privacy = privacy;
		this.topic = topic;
		this.email = email;
		this.type = type;
		this._version = version;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.start_time = start_time;
		this.description = description;
		this.end_time = end_time;
		this._creator = creator;

	}

}