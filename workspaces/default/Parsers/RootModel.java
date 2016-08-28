import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String schedule_published_on;
	public String state;
	public String name;
	public String type;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String background_image;
	public String organizer_description;
	public String email;
	public String description;
	public String code_of_conduct;
	public String privacy;
	public String topic;
	public String start_time;
	public String end_time;
	public String organizer_name;
	public int id;
	public String logo;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String timezone, String schedule_published_on, String state, String name, String type, CreatorModel creator, Call_for_papersModel call_for_papers, String location_name, String background_image, String organizer_description, String email, String description, String code_of_conduct, String privacy, String topic, String start_time, String end_time, String organizer_name, int id, String logo, CopyrightModel copyright, VersionModel version, ArrayList<Social_linksModel> social_links) {

		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.name = name;
		this.type = type;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.email = email;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.topic = topic;
		this.start_time = start_time;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.id = id;
		this.logo = logo;
		this._copyright = copyright;
		this._version = version;
		this.social_links = social_links;

	}

}