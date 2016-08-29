import java.util.ArrayList;

class RootModel {

	public String state;
	public String privacy;
	public CreatorModel _creator;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String background_image;
	public String end_time;
	public String start_time;
	public String email;
	public String code_of_conduct;
	public String organizer_name;
	public String location_name;
	public VersionModel _version;
	public String logo;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String name;
	public CopyrightModel _copyright;
	public String description;
	public String timezone;
	public String schedule_published_on;

	public RootModel(String state, String privacy, CreatorModel creator, String organizer_description, ArrayList<Social_linksModel> social_links, String topic, String background_image, String end_time, String start_time, String email, String code_of_conduct, String organizer_name, String location_name, VersionModel version, String logo, String type, Call_for_papersModel call_for_papers, int id, String name, CopyrightModel copyright, String description, String timezone, String schedule_published_on) {

		this.state = state;
		this.privacy = privacy;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.topic = topic;
		this.background_image = background_image;
		this.end_time = end_time;
		this.start_time = start_time;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this._version = version;
		this.logo = logo;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.name = name;
		this._copyright = copyright;
		this.description = description;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;

	}

}