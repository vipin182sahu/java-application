import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String timezone;
	public String logo;
	public CopyrightModel _copyright;
	public String start_time;
	public CreatorModel _creator;
	public String end_time;
	public String code_of_conduct;
	public String type;
	public int id;
	public String organizer_name;
	public String state;
	public String email;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String background_image;
	public String privacy;
	public String schedule_published_on;
	public String topic;
	public String description;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String location_name, String timezone, String logo, CopyrightModel copyright, String start_time, CreatorModel creator, String end_time, String code_of_conduct, String type, int id, String organizer_name, String state, String email, String name, Call_for_papersModel call_for_papers, String organizer_description, String background_image, String privacy, String schedule_published_on, String topic, String description, VersionModel version, ArrayList<Social_linksModel> social_links) {

		this.location_name = location_name;
		this.timezone = timezone;
		this.logo = logo;
		this._copyright = copyright;
		this.start_time = start_time;
		this._creator = creator;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.id = id;
		this.organizer_name = organizer_name;
		this.state = state;
		this.email = email;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.description = description;
		this._version = version;
		this.social_links = social_links;

	}

}