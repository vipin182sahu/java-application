import java.util.ArrayList;

class RootModel {

	public int id;
	public String organizer_name;
	public String schedule_published_on;
	public String privacy;
	public String description;
	public String code_of_conduct;
	public String background_image;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String logo;
	public String location_name;
	public String topic;
	public CreatorModel _creator;
	public String start_time;
	public String end_time;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String name;
	public VersionModel _version;
	public String state;
	public String email;

	public RootModel(int id, String organizer_name, String schedule_published_on, String privacy, String description, String code_of_conduct, String background_image, String organizer_description, CopyrightModel copyright, String logo, String location_name, String topic, CreatorModel creator, String start_time, String end_time, String timezone, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String type, String name, VersionModel version, String state, String email) {

		this.id = id;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.logo = logo;
		this.location_name = location_name;
		this.topic = topic;
		this._creator = creator;
		this.start_time = start_time;
		this.end_time = end_time;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.type = type;
		this.name = name;
		this._version = version;
		this.state = state;
		this.email = email;

	}

}