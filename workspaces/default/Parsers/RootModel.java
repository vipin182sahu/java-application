import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String description;
	public int id;
	public String start_time;
	public String location_name;
	public String code_of_conduct;
	public String organizer_description;
	public String topic;
	public String background_image;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String privacy;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String end_time;
	public String email;
	public CopyrightModel _copyright;
	public String type;
	public String organizer_name;
	public VersionModel _version;
	public CreatorModel _creator;

	public RootModel(String schedule_published_on, String description, int id, String start_time, String location_name, String code_of_conduct, String organizer_description, String topic, String background_image, String logo, ArrayList<Social_linksModel> social_links, String name, String privacy, String timezone, Call_for_papersModel call_for_papers, String state, String end_time, String email, CopyrightModel copyright, String type, String organizer_name, VersionModel version, CreatorModel creator) {

		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.id = id;
		this.start_time = start_time;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.background_image = background_image;
		this.logo = logo;
		this.social_links = social_links;
		this.name = name;
		this.privacy = privacy;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.end_time = end_time;
		this.email = email;
		this._copyright = copyright;
		this.type = type;
		this.organizer_name = organizer_name;
		this._version = version;
		this._creator = creator;

	}

}