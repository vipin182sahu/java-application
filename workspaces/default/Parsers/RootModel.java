import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public int id;
	public String location_name;
	public CreatorModel _creator;
	public String state;
	public String background_image;
	public String type;
	public String end_time;
	public String topic;
	public String name;
	public String schedule_published_on;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String description;
	public String logo;
	public String code_of_conduct;
	public String privacy;
	public String start_time;
	public String email;

	public RootModel(ArrayList<Social_linksModel> social_links, String organizer_description, int id, String location_name, CreatorModel creator, String state, String background_image, String type, String end_time, String topic, String name, String schedule_published_on, String timezone, Call_for_papersModel call_for_papers, VersionModel version, CopyrightModel copyright, String organizer_name, String description, String logo, String code_of_conduct, String privacy, String start_time, String email) {

		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.id = id;
		this.location_name = location_name;
		this._creator = creator;
		this.state = state;
		this.background_image = background_image;
		this.type = type;
		this.end_time = end_time;
		this.topic = topic;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.description = description;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.start_time = start_time;
		this.email = email;

	}

}