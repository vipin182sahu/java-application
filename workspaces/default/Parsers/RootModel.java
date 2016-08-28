import java.util.ArrayList;

class RootModel {

	public int id;
	public String state;
	public String start_time;
	public String code_of_conduct;
	public String topic;
	public String location_name;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String type;
	public String timezone;
	public String end_time;
	public String organizer_name;
	public String schedule_published_on;
	public String email;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String logo;
	public VersionModel _version;
	public String name;
	public String background_image;
	public String privacy;

	public RootModel(int id, String state, String start_time, String code_of_conduct, String topic, String location_name, CreatorModel creator, CopyrightModel copyright, String type, String timezone, String end_time, String organizer_name, String schedule_published_on, String email, String description, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String organizer_description, String logo, VersionModel version, String name, String background_image, String privacy) {

		this.id = id;
		this.state = state;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.location_name = location_name;
		this._creator = creator;
		this._copyright = copyright;
		this.type = type;
		this.timezone = timezone;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.description = description;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this._version = version;
		this.name = name;
		this.background_image = background_image;
		this.privacy = privacy;

	}

}