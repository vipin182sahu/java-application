import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String start_time;
	public String timezone;
	public String email;
	public String topic;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String schedule_published_on;
	public String name;
	public String logo;
	public String end_time;
	public VersionModel _version;
	public String type;
	public String location_name;
	public CopyrightModel _copyright;
	public int id;
	public String organizer_name;
	public String state;
	public String privacy;
	public String organizer_description;

	public RootModel(CreatorModel creator, Call_for_papersModel call_for_papers, String background_image, String start_time, String timezone, String email, String topic, String code_of_conduct, ArrayList<Social_linksModel> social_links, String description, String schedule_published_on, String name, String logo, String end_time, VersionModel version, String type, String location_name, CopyrightModel copyright, int id, String organizer_name, String state, String privacy, String organizer_description) {

		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.start_time = start_time;
		this.timezone = timezone;
		this.email = email;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.logo = logo;
		this.end_time = end_time;
		this._version = version;
		this.type = type;
		this.location_name = location_name;
		this._copyright = copyright;
		this.id = id;
		this.organizer_name = organizer_name;
		this.state = state;
		this.privacy = privacy;
		this.organizer_description = organizer_description;

	}

}