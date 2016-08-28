import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public VersionModel _version;
	public String schedule_published_on;
	public String background_image;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String email;
	public String start_time;
	public String timezone;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String organizer_description;
	public String state;
	public int id;
	public String type;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String location_name;
	public String description;
	public String logo;
	public String end_time;

	public RootModel(CreatorModel creator, VersionModel version, String schedule_published_on, String background_image, String organizer_name, CopyrightModel copyright, String email, String start_time, String timezone, String privacy, Call_for_papersModel call_for_papers, String topic, String organizer_description, String state, int id, String type, String code_of_conduct, ArrayList<Social_linksModel> social_links, String name, String location_name, String description, String logo, String end_time) {

		this._creator = creator;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.email = email;
		this.start_time = start_time;
		this.timezone = timezone;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.state = state;
		this.id = id;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.name = name;
		this.location_name = location_name;
		this.description = description;
		this.logo = logo;
		this.end_time = end_time;

	}

}