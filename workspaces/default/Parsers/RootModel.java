import java.util.ArrayList;

class RootModel {

	public String name;
	public String background_image;
	public String end_time;
	public String code_of_conduct;
	public String timezone;
	public String start_time;
	public String privacy;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String logo;
	public String state;
	public String email;
	public int id;
	public String description;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String topic;
	public String organizer_description;
	public String schedule_published_on;

	public RootModel(String name, String background_image, String end_time, String code_of_conduct, String timezone, String start_time, String privacy, VersionModel version, CopyrightModel copyright, String logo, String state, String email, int id, String description, String type, ArrayList<Social_linksModel> social_links, String organizer_name, String location_name, Call_for_papersModel call_for_papers, CreatorModel creator, String topic, String organizer_description, String schedule_published_on) {

		this.name = name;
		this.background_image = background_image;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.start_time = start_time;
		this.privacy = privacy;
		this._version = version;
		this._copyright = copyright;
		this.logo = logo;
		this.state = state;
		this.email = email;
		this.id = id;
		this.description = description;
		this.type = type;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;

	}

}