import java.util.ArrayList;

class RootModel {

	public String email;
	public String code_of_conduct;
	public VersionModel _version;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public CreatorModel _creator;
	public String logo;
	public String background_image;
	public String state;
	public String end_time;
	public CopyrightModel _copyright;
	public String name;
	public String type;
	public String privacy;
	public String start_time;
	public String description;
	public String organizer_description;
	public String topic;
	public String schedule_published_on;

	public RootModel(String email, String code_of_conduct, VersionModel version, int id, Call_for_papersModel call_for_papers, String timezone, String location_name, ArrayList<Social_linksModel> social_links, String organizer_name, CreatorModel creator, String logo, String background_image, String state, String end_time, CopyrightModel copyright, String name, String type, String privacy, String start_time, String description, String organizer_description, String topic, String schedule_published_on) {

		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.location_name = location_name;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.logo = logo;
		this.background_image = background_image;
		this.state = state;
		this.end_time = end_time;
		this._copyright = copyright;
		this.name = name;
		this.type = type;
		this.privacy = privacy;
		this.start_time = start_time;
		this.description = description;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;

	}

}