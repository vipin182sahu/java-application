import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String description;
	public int id;
	public String topic;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String organizer_description;
	public String code_of_conduct;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String privacy;
	public String email;
	public String location_name;
	public String type;
	public String end_time;
	public String timezone;
	public String state;
	public String organizer_name;
	public String name;
	public String logo;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String start_time, String description, int id, String topic, CopyrightModel copyright, VersionModel version, String organizer_description, String code_of_conduct, String schedule_published_on, Call_for_papersModel call_for_papers, CreatorModel creator, String privacy, String email, String location_name, String type, String end_time, String timezone, String state, String organizer_name, String name, String logo, String background_image, ArrayList<Social_linksModel> social_links) {

		this.start_time = start_time;
		this.description = description;
		this.id = id;
		this.topic = topic;
		this._copyright = copyright;
		this._version = version;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.privacy = privacy;
		this.email = email;
		this.location_name = location_name;
		this.type = type;
		this.end_time = end_time;
		this.timezone = timezone;
		this.state = state;
		this.organizer_name = organizer_name;
		this.name = name;
		this.logo = logo;
		this.background_image = background_image;
		this.social_links = social_links;

	}

}