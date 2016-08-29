import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String start_time;
	public String type;
	public String description;
	public String end_time;
	public CreatorModel _creator;
	public String background_image;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String logo;
	public String topic;
	public String location_name;
	public String organizer_name;
	public String name;
	public String privacy;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public VersionModel _version;
	public int id;
	public String timezone;
	public String code_of_conduct;

	public RootModel(ArrayList<Social_linksModel> social_links, String schedule_published_on, String start_time, String type, String description, String end_time, CreatorModel creator, String background_image, String organizer_description, CopyrightModel copyright, String logo, String topic, String location_name, String organizer_name, String name, String privacy, String state, Call_for_papersModel call_for_papers, String email, VersionModel version, int id, String timezone, String code_of_conduct) {

		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.type = type;
		this.description = description;
		this.end_time = end_time;
		this._creator = creator;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.logo = logo;
		this.topic = topic;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.name = name;
		this.privacy = privacy;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this._version = version;
		this.id = id;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;

	}

}