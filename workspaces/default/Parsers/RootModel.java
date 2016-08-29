import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String start_time;
	public String topic;
	public String schedule_published_on;
	public VersionModel _version;
	public String organizer_name;
	public String name;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public CreatorModel _creator;
	public String state;
	public int id;
	public String description;
	public String code_of_conduct;
	public String logo;
	public String location_name;
	public String end_time;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public CopyrightModel _copyright;
	public String privacy;

	public RootModel(String background_image, String start_time, String topic, String schedule_published_on, VersionModel version, String organizer_name, String name, String email, ArrayList<Social_linksModel> social_links, String organizer_description, CreatorModel creator, String state, int id, String description, String code_of_conduct, String logo, String location_name, String end_time, String type, Call_for_papersModel call_for_papers, String timezone, CopyrightModel copyright, String privacy) {

		this.background_image = background_image;
		this.start_time = start_time;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.organizer_name = organizer_name;
		this.name = name;
		this.email = email;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.state = state;
		this.id = id;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.location_name = location_name;
		this.end_time = end_time;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this._copyright = copyright;
		this.privacy = privacy;

	}

}