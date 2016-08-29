import java.util.ArrayList;

class RootModel {

	public int id;
	public String email;
	public String code_of_conduct;
	public String topic;
	public String location_name;
	public String type;
	public String timezone;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String end_time;
	public VersionModel _version;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String state;
	public String start_time;
	public String organizer_name;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String background_image;
	public String privacy;

	public RootModel(int id, String email, String code_of_conduct, String topic, String location_name, String type, String timezone, CreatorModel creator, String schedule_published_on, String end_time, VersionModel version, String organizer_description, CopyrightModel copyright, String state, String start_time, String organizer_name, String logo, ArrayList<Social_linksModel> social_links, String description, Call_for_papersModel call_for_papers, String name, String background_image, String privacy) {

		this.id = id;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.location_name = location_name;
		this.type = type;
		this.timezone = timezone;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this._version = version;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.state = state;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.social_links = social_links;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.background_image = background_image;
		this.privacy = privacy;

	}

}