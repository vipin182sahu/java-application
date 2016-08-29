import java.util.ArrayList;

class RootModel {

	public String state;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public int id;
	public String end_time;
	public String timezone;
	public String email;
	public String description;
	public String background_image;
	public String organizer_name;
	public String privacy;
	public String type;
	public String logo;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String topic;
	public String start_time;
	public String organizer_description;
	public CreatorModel _creator;
	public String schedule_published_on;

	public RootModel(String state, VersionModel version, Call_for_papersModel call_for_papers, CopyrightModel copyright, String code_of_conduct, int id, String end_time, String timezone, String email, String description, String background_image, String organizer_name, String privacy, String type, String logo, String name, ArrayList<Social_linksModel> social_links, String location_name, String topic, String start_time, String organizer_description, CreatorModel creator, String schedule_published_on) {

		this.state = state;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.end_time = end_time;
		this.timezone = timezone;
		this.email = email;
		this.description = description;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.type = type;
		this.logo = logo;
		this.name = name;
		this.social_links = social_links;
		this.location_name = location_name;
		this.topic = topic;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;

	}

}