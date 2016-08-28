import java.util.ArrayList;

class RootModel {

	public String email;
	public String code_of_conduct;
	public String name;
	public String organizer_description;
	public String timezone;
	public String organizer_name;
	public String start_time;
	public String logo;
	public String location_name;
	public String privacy;
	public CopyrightModel _copyright;
	public int id;
	public String end_time;
	public String description;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String type;
	public String topic;
	public CreatorModel _creator;
	public String background_image;
	public String state;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String email, String code_of_conduct, String name, String organizer_description, String timezone, String organizer_name, String start_time, String logo, String location_name, String privacy, CopyrightModel copyright, int id, String end_time, String description, String schedule_published_on, Call_for_papersModel call_for_papers, VersionModel version, String type, String topic, CreatorModel creator, String background_image, String state, ArrayList<Social_linksModel> social_links) {

		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.logo = logo;
		this.location_name = location_name;
		this.privacy = privacy;
		this._copyright = copyright;
		this.id = id;
		this.end_time = end_time;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.type = type;
		this.topic = topic;
		this._creator = creator;
		this.background_image = background_image;
		this.state = state;
		this.social_links = social_links;

	}

}