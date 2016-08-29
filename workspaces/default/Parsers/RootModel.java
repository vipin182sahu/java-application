import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String name;
	public CopyrightModel _copyright;
	public String state;
	public String type;
	public String timezone;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String description;
	public String end_time;
	public String code_of_conduct;
	public String logo;
	public String start_time;
	public String organizer_description;
	public String location_name;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public int id;
	public String organizer_name;
	public CreatorModel _creator;
	public String schedule_published_on;

	public RootModel(String background_image, String name, CopyrightModel copyright, String state, String type, String timezone, String email, Call_for_papersModel call_for_papers, VersionModel version, String description, String end_time, String code_of_conduct, String logo, String start_time, String organizer_description, String location_name, String topic, ArrayList<Social_linksModel> social_links, String privacy, int id, String organizer_name, CreatorModel creator, String schedule_published_on) {

		this.background_image = background_image;
		this.name = name;
		this._copyright = copyright;
		this.state = state;
		this.type = type;
		this.timezone = timezone;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.description = description;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.topic = topic;
		this.social_links = social_links;
		this.privacy = privacy;
		this.id = id;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;

	}

}