import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String description;
	public int id;
	public String start_time;
	public String location_name;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String background_image;
	public String state;
	public VersionModel _version;
	public String email;
	public String name;
	public String organizer_description;
	public String end_time;
	public String timezone;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String type;
	public String logo;
	public String topic;
	public String schedule_published_on;

	public RootModel(String code_of_conduct, String description, int id, String start_time, String location_name, CreatorModel creator, Call_for_papersModel call_for_papers, String privacy, String background_image, String state, VersionModel version, String email, String name, String organizer_description, String end_time, String timezone, String organizer_name, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String type, String logo, String topic, String schedule_published_on) {

		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.id = id;
		this.start_time = start_time;
		this.location_name = location_name;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.background_image = background_image;
		this.state = state;
		this._version = version;
		this.email = email;
		this.name = name;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this._copyright = copyright;
		this.type = type;
		this.logo = logo;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;

	}

}