import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String location_name;
	public String name;
	public String logo;
	public String description;
	public String schedule_published_on;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String code_of_conduct;
	public String organizer_name;
	public String state;
	public VersionModel _version;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String type;
	public String background_image;
	public String start_time;
	public CopyrightModel _copyright;
	public int id;
	public String email;
	public CreatorModel _creator;

	public RootModel(String timezone, String location_name, String name, String logo, String description, String schedule_published_on, String topic, ArrayList<Social_linksModel> social_links, String organizer_description, String code_of_conduct, String organizer_name, String state, VersionModel version, String privacy, Call_for_papersModel call_for_papers, String end_time, String type, String background_image, String start_time, CopyrightModel copyright, int id, String email, CreatorModel creator) {

		this.timezone = timezone;
		this.location_name = location_name;
		this.name = name;
		this.logo = logo;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.state = state;
		this._version = version;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.type = type;
		this.background_image = background_image;
		this.start_time = start_time;
		this._copyright = copyright;
		this.id = id;
		this.email = email;
		this._creator = creator;

	}

}