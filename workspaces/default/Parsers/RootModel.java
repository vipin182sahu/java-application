import java.util.ArrayList;

class RootModel {

	public int id;
	public String organizer_name;
	public VersionModel _version;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public CreatorModel _creator;
	public String state;
	public String end_time;
	public String schedule_published_on;
	public String description;
	public String type;
	public CopyrightModel _copyright;
	public String location_name;
	public String email;
	public String logo;
	public String start_time;
	public String code_of_conduct;
	public String background_image;
	public String topic;
	public String privacy;

	public RootModel(int id, String organizer_name, VersionModel version, String organizer_description, ArrayList<Social_linksModel> social_links, String timezone, Call_for_papersModel call_for_papers, String name, CreatorModel creator, String state, String end_time, String schedule_published_on, String description, String type, CopyrightModel copyright, String location_name, String email, String logo, String start_time, String code_of_conduct, String background_image, String topic, String privacy) {

		this.id = id;
		this.organizer_name = organizer_name;
		this._version = version;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this._creator = creator;
		this.state = state;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.type = type;
		this._copyright = copyright;
		this.location_name = location_name;
		this.email = email;
		this.logo = logo;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.topic = topic;
		this.privacy = privacy;

	}

}