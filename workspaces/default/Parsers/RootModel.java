import java.util.ArrayList;

class RootModel {

	public int id;
	public String topic;
	public String state;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String organizer_description;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String name;
	public String schedule_published_on;
	public VersionModel _version;
	public String background_image;
	public String logo;
	public String description;
	public String location_name;
	public String code_of_conduct;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String type;
	public String start_time;
	public String privacy;

	public RootModel(int id, String topic, String state, CopyrightModel copyright, String organizer_name, String organizer_description, String timezone, ArrayList<Social_linksModel> social_links, String end_time, String name, String schedule_published_on, VersionModel version, String background_image, String logo, String description, String location_name, String code_of_conduct, String email, Call_for_papersModel call_for_papers, CreatorModel creator, String type, String start_time, String privacy) {

		this.id = id;
		this.topic = topic;
		this.state = state;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.social_links = social_links;
		this.end_time = end_time;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.background_image = background_image;
		this.logo = logo;
		this.description = description;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.type = type;
		this.start_time = start_time;
		this.privacy = privacy;

	}

}