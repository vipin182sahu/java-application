import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public int id;
	public String organizer_name;
	public String description;
	public VersionModel _version;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String schedule_published_on;
	public String topic;
	public String location_name;
	public CreatorModel _creator;
	public String type;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String organizer_description;
	public String end_time;
	public String logo;
	public String code_of_conduct;
	public String state;
	public String email;
	public String privacy;

	public RootModel(CopyrightModel copyright, int id, String organizer_name, String description, VersionModel version, String start_time, Call_for_papersModel call_for_papers, String timezone, String schedule_published_on, String topic, String location_name, CreatorModel creator, String type, String background_image, ArrayList<Social_linksModel> social_links, String name, String organizer_description, String end_time, String logo, String code_of_conduct, String state, String email, String privacy) {

		this._copyright = copyright;
		this.id = id;
		this.organizer_name = organizer_name;
		this.description = description;
		this._version = version;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.location_name = location_name;
		this._creator = creator;
		this.type = type;
		this.background_image = background_image;
		this.social_links = social_links;
		this.name = name;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.email = email;
		this.privacy = privacy;

	}

}