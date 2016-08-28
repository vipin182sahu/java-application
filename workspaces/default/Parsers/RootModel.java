import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String organizer_description;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String end_time;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String timezone;
	public VersionModel _version;
	public String name;
	public String topic;
	public String privacy;
	public int id;
	public String state;
	public String organizer_name;
	public String description;
	public String type;
	public String schedule_published_on;
	public String logo;
	public String email;
	public String code_of_conduct;

	public RootModel(ArrayList<Social_linksModel> social_links, String location_name, String organizer_description, CreatorModel creator, CopyrightModel copyright, String end_time, String start_time, Call_for_papersModel call_for_papers, String background_image, String timezone, VersionModel version, String name, String topic, String privacy, int id, String state, String organizer_name, String description, String type, String schedule_published_on, String logo, String email, String code_of_conduct) {

		this.social_links = social_links;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this._copyright = copyright;
		this.end_time = end_time;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.timezone = timezone;
		this._version = version;
		this.name = name;
		this.topic = topic;
		this.privacy = privacy;
		this.id = id;
		this.state = state;
		this.organizer_name = organizer_name;
		this.description = description;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.email = email;
		this.code_of_conduct = code_of_conduct;

	}

}