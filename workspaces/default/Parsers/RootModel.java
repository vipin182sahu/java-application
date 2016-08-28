import java.util.ArrayList;

class RootModel {

	public String end_time;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String type;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String name;
	public String topic;
	public String code_of_conduct;
	public String description;
	public String location_name;
	public String state;
	public String logo;
	public String timezone;
	public String email;
	public int id;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String organizer_name;
	public VersionModel _version;
	public String privacy;

	public RootModel(String end_time, CreatorModel creator, CopyrightModel copyright, String type, String organizer_description, ArrayList<Social_linksModel> social_links, String schedule_published_on, String name, String topic, String code_of_conduct, String description, String location_name, String state, String logo, String timezone, String email, int id, String background_image, Call_for_papersModel call_for_papers, String start_time, String organizer_name, VersionModel version, String privacy) {

		this.end_time = end_time;
		this._creator = creator;
		this._copyright = copyright;
		this.type = type;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.location_name = location_name;
		this.state = state;
		this.logo = logo;
		this.timezone = timezone;
		this.email = email;
		this.id = id;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._version = version;
		this.privacy = privacy;

	}

}