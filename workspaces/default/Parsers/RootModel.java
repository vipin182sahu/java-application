import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String schedule_published_on;
	public String state;
	public String topic;
	public String organizer_description;
	public String description;
	public String logo;
	public String start_time;
	public String timezone;
	public String organizer_name;
	public String location_name;
	public int id;
	public String privacy;
	public String type;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String name;
	public VersionModel _version;
	public String end_time;

	public RootModel(CreatorModel creator, String background_image, Call_for_papersModel call_for_papers, String code_of_conduct, String schedule_published_on, String state, String topic, String organizer_description, String description, String logo, String start_time, String timezone, String organizer_name, String location_name, int id, String privacy, String type, String email, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String name, VersionModel version, String end_time) {

		this._creator = creator;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.description = description;
		this.logo = logo;
		this.start_time = start_time;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.id = id;
		this.privacy = privacy;
		this.type = type;
		this.email = email;
		this.social_links = social_links;
		this._copyright = copyright;
		this.name = name;
		this._version = version;
		this.end_time = end_time;

	}

}