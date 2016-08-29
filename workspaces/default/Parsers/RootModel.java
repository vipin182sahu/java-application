import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String timezone;
	public String name;
	public String description;
	public CreatorModel _creator;
	public VersionModel _version;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String privacy;
	public CopyrightModel _copyright;
	public String end_time;
	public String type;
	public String logo;
	public String email;
	public int id;
	public String topic;
	public String organizer_name;
	public String organizer_description;
	public String schedule_published_on;
	public String code_of_conduct;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String location_name, String timezone, String name, String description, CreatorModel creator, VersionModel version, String background_image, Call_for_papersModel call_for_papers, String state, String privacy, CopyrightModel copyright, String end_time, String type, String logo, String email, int id, String topic, String organizer_name, String organizer_description, String schedule_published_on, String code_of_conduct, String start_time, ArrayList<Social_linksModel> social_links) {

		this.location_name = location_name;
		this.timezone = timezone;
		this.name = name;
		this.description = description;
		this._creator = creator;
		this._version = version;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.privacy = privacy;
		this._copyright = copyright;
		this.end_time = end_time;
		this.type = type;
		this.logo = logo;
		this.email = email;
		this.id = id;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.social_links = social_links;

	}

}