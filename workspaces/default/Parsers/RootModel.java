import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String privacy;
	public CopyrightModel _copyright;
	public String name;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String timezone;
	public String email;
	public String state;
	public String logo;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String organizer_name;
	public int id;
	public String organizer_description;
	public String code_of_conduct;
	public String type;
	public String topic;
	public String location_name;
	public String end_time;

	public RootModel(VersionModel version, ArrayList<Social_linksModel> social_links, String description, String privacy, CopyrightModel copyright, String name, CreatorModel creator, String schedule_published_on, String timezone, String email, String state, String logo, String background_image, Call_for_papersModel call_for_papers, String start_time, String organizer_name, int id, String organizer_description, String code_of_conduct, String type, String topic, String location_name, String end_time) {

		this._version = version;
		this.social_links = social_links;
		this.description = description;
		this.privacy = privacy;
		this._copyright = copyright;
		this.name = name;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.email = email;
		this.state = state;
		this.logo = logo;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.id = id;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.topic = topic;
		this.location_name = location_name;
		this.end_time = end_time;

	}

}