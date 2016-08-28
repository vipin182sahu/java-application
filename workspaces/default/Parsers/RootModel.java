import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public VersionModel _version;
	public String logo;
	public String topic;
	public String email;
	public String type;
	public String start_time;
	public String privacy;
	public int id;
	public String timezone;
	public String background_image;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String organizer_description;
	public String state;
	public String code_of_conduct;
	public String location_name;
	public String schedule_published_on;
	public String description;

	public RootModel(CreatorModel creator, String end_time, Call_for_papersModel call_for_papers, String organizer_name, VersionModel version, String logo, String topic, String email, String type, String start_time, String privacy, int id, String timezone, String background_image, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String name, String organizer_description, String state, String code_of_conduct, String location_name, String schedule_published_on, String description) {

		this._creator = creator;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this._version = version;
		this.logo = logo;
		this.topic = topic;
		this.email = email;
		this.type = type;
		this.start_time = start_time;
		this.privacy = privacy;
		this.id = id;
		this.timezone = timezone;
		this.background_image = background_image;
		this._copyright = copyright;
		this.social_links = social_links;
		this.name = name;
		this.organizer_description = organizer_description;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.description = description;

	}

}