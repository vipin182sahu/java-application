import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String logo;
	public String type;
	public String privacy;
	public String background_image;
	public VersionModel _version;
	public String start_time;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String state;
	public String description;
	public String code_of_conduct;
	public String location_name;
	public String email;
	public String end_time;
	public String timezone;
	public int id;
	public String organizer_description;
	public String organizer_name;
	public String name;
	public String topic;

	public RootModel(ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, CreatorModel creator, String logo, String type, String privacy, String background_image, VersionModel version, String start_time, String schedule_published_on, CopyrightModel copyright, String state, String description, String code_of_conduct, String location_name, String email, String end_time, String timezone, int id, String organizer_description, String organizer_name, String name, String topic) {

		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.logo = logo;
		this.type = type;
		this.privacy = privacy;
		this.background_image = background_image;
		this._version = version;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.state = state;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.email = email;
		this.end_time = end_time;
		this.timezone = timezone;
		this.id = id;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.name = name;
		this.topic = topic;

	}

}