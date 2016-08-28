import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String state;
	public String start_time;
	public CreatorModel _creator;
	public int id;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String type;
	public String background_image;
	public String name;
	public String organizer_name;
	public String description;
	public String email;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public VersionModel _version;
	public String logo;
	public String location_name;
	public String organizer_description;
	public String privacy;
	public String schedule_published_on;

	public RootModel(String end_time, String state, String start_time, CreatorModel creator, int id, String topic, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String type, String background_image, String name, String organizer_name, String description, String email, String timezone, Call_for_papersModel call_for_papers, String code_of_conduct, VersionModel version, String logo, String location_name, String organizer_description, String privacy, String schedule_published_on) {

		this.end_time = end_time;
		this.state = state;
		this.start_time = start_time;
		this._creator = creator;
		this.id = id;
		this.topic = topic;
		this.social_links = social_links;
		this._copyright = copyright;
		this.type = type;
		this.background_image = background_image;
		this.name = name;
		this.organizer_name = organizer_name;
		this.description = description;
		this.email = email;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.logo = logo;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;

	}

}