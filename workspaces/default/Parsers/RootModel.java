import java.util.ArrayList;

class RootModel {

	public String description;
	public String topic;
	public String state;
	public String location_name;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String timezone;
	public String organizer_name;
	public String end_time;
	public String code_of_conduct;
	public String name;
	public String type;
	public String organizer_description;
	public int id;
	public String background_image;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String email;
	public String schedule_published_on;
	public String start_time;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String description, String topic, String state, String location_name, String privacy, Call_for_papersModel call_for_papers, String logo, String timezone, String organizer_name, String end_time, String code_of_conduct, String name, String type, String organizer_description, int id, String background_image, CopyrightModel copyright, CreatorModel creator, String email, String schedule_published_on, String start_time, VersionModel version, ArrayList<Social_linksModel> social_links) {

		this.description = description;
		this.topic = topic;
		this.state = state;
		this.location_name = location_name;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.type = type;
		this.organizer_description = organizer_description;
		this.id = id;
		this.background_image = background_image;
		this._copyright = copyright;
		this._creator = creator;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this._version = version;
		this.social_links = social_links;

	}

}