import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String privacy;
	public String organizer_description;
	public String state;
	public String timezone;
	public String topic;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String organizer_name;
	public String type;
	public String location_name;
	public CopyrightModel _copyright;
	public String end_time;
	public int id;
	public String email;
	public VersionModel _version;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String name;
	public String logo;
	public String description;

	public RootModel(CreatorModel creator, String privacy, String organizer_description, String state, String timezone, String topic, String schedule_published_on, ArrayList<Social_linksModel> social_links, String start_time, String organizer_name, String type, String location_name, CopyrightModel copyright, String end_time, int id, String email, VersionModel version, String background_image, Call_for_papersModel call_for_papers, String code_of_conduct, String name, String logo, String description) {

		this._creator = creator;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.state = state;
		this.timezone = timezone;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.type = type;
		this.location_name = location_name;
		this._copyright = copyright;
		this.end_time = end_time;
		this.id = id;
		this.email = email;
		this._version = version;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.logo = logo;
		this.description = description;

	}

}