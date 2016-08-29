import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String start_time;
	public String privacy;
	public String schedule_published_on;
	public String organizer_description;
	public String logo;
	public CreatorModel _creator;
	public String type;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String email;
	public String code_of_conduct;
	public String organizer_name;
	public String name;
	public String topic;
	public String state;
	public String background_image;
	public String location_name;
	public String end_time;

	public RootModel(VersionModel version, String start_time, String privacy, String schedule_published_on, String organizer_description, String logo, CreatorModel creator, String type, CopyrightModel copyright, Call_for_papersModel call_for_papers, int id, String description, ArrayList<Social_linksModel> social_links, String timezone, String email, String code_of_conduct, String organizer_name, String name, String topic, String state, String background_image, String location_name, String end_time) {

		this._version = version;
		this.start_time = start_time;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this._creator = creator;
		this.type = type;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.description = description;
		this.social_links = social_links;
		this.timezone = timezone;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.name = name;
		this.topic = topic;
		this.state = state;
		this.background_image = background_image;
		this.location_name = location_name;
		this.end_time = end_time;

	}

}