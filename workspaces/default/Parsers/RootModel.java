import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String background_image;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String code_of_conduct;
	public VersionModel _version;
	public String end_time;
	public String email;
	public String topic;
	public CopyrightModel _copyright;
	public String description;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String location_name;
	public int id;
	public String type;
	public String logo;
	public String state;
	public String schedule_published_on;
	public String start_time;
	public String privacy;

	public RootModel(String organizer_name, String background_image, CreatorModel creator, ArrayList<Social_linksModel> social_links, String name, String code_of_conduct, VersionModel version, String end_time, String email, String topic, CopyrightModel copyright, String description, String timezone, Call_for_papersModel call_for_papers, String organizer_description, String location_name, int id, String type, String logo, String state, String schedule_published_on, String start_time, String privacy) {

		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this._creator = creator;
		this.social_links = social_links;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.end_time = end_time;
		this.email = email;
		this.topic = topic;
		this._copyright = copyright;
		this.description = description;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.id = id;
		this.type = type;
		this.logo = logo;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.privacy = privacy;

	}

}