import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String type;
	public String schedule_published_on;
	public String topic;
	public String background_image;
	public String organizer_description;
	public String privacy;
	public String code_of_conduct;
	public String state;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String start_time;
	public String timezone;
	public String email;
	public String name;
	public String logo;
	public String location_name;
	public String end_time;
	public String organizer_name;
	public String description;
	public VersionModel _version;

	public RootModel(ArrayList<Social_linksModel> social_links, int id, String type, String schedule_published_on, String topic, String background_image, String organizer_description, String privacy, String code_of_conduct, String state, CreatorModel creator, Call_for_papersModel call_for_papers, CopyrightModel copyright, String start_time, String timezone, String email, String name, String logo, String location_name, String end_time, String organizer_name, String description, VersionModel version) {

		this.social_links = social_links;
		this.id = id;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.start_time = start_time;
		this.timezone = timezone;
		this.email = email;
		this.name = name;
		this.logo = logo;
		this.location_name = location_name;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.description = description;
		this._version = version;

	}

}