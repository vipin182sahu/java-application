import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String logo;
	public String privacy;
	public String name;
	public String state;
	public String description;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String email;
	public int id;
	public String organizer_description;
	public String topic;
	public VersionModel _version;
	public String timezone;
	public String organizer_name;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String background_image;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public CreatorModel _creator;

	public RootModel(String start_time, String logo, String privacy, String name, String state, String description, CopyrightModel copyright, String schedule_published_on, String email, int id, String organizer_description, String topic, VersionModel version, String timezone, String organizer_name, String type, Call_for_papersModel call_for_papers, String code_of_conduct, String background_image, String location_name, ArrayList<Social_linksModel> social_links, String end_time, CreatorModel creator) {

		this.start_time = start_time;
		this.logo = logo;
		this.privacy = privacy;
		this.name = name;
		this.state = state;
		this.description = description;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.id = id;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this._version = version;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.location_name = location_name;
		this.social_links = social_links;
		this.end_time = end_time;
		this._creator = creator;

	}

}