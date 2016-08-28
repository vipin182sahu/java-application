import java.util.ArrayList;

class RootModel {

	public int id;
	public String location_name;
	public String state;
	public String background_image;
	public String start_time;
	public String logo;
	public String description;
	public CopyrightModel _copyright;
	public String privacy;
	public String topic;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String type;
	public String schedule_published_on;
	public String timezone;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String email;
	public String organizer_name;
	public String name;
	public String code_of_conduct;

	public RootModel(int id, String location_name, String state, String background_image, String start_time, String logo, String description, CopyrightModel copyright, String privacy, String topic, String organizer_description, Call_for_papersModel call_for_papers, VersionModel version, String type, String schedule_published_on, String timezone, CreatorModel creator, ArrayList<Social_linksModel> social_links, String end_time, String email, String organizer_name, String name, String code_of_conduct) {

		this.id = id;
		this.location_name = location_name;
		this.state = state;
		this.background_image = background_image;
		this.start_time = start_time;
		this.logo = logo;
		this.description = description;
		this._copyright = copyright;
		this.privacy = privacy;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this._creator = creator;
		this.social_links = social_links;
		this.end_time = end_time;
		this.email = email;
		this.organizer_name = organizer_name;
		this.name = name;
		this.code_of_conduct = code_of_conduct;

	}

}