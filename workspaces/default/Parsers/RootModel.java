import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String timezone;
	public String state;
	public int id;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String privacy;
	public String start_time;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String location_name;
	public String schedule_published_on;
	public String topic;
	public String name;
	public String description;
	public String logo;
	public String email;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String organizer_description;
	public VersionModel _version;

	public RootModel(CreatorModel creator, String timezone, String state, int id, String organizer_name, Call_for_papersModel call_for_papers, String background_image, String privacy, String start_time, String type, ArrayList<Social_linksModel> social_links, String end_time, String location_name, String schedule_published_on, String topic, String name, String description, String logo, String email, CopyrightModel copyright, String code_of_conduct, String organizer_description, VersionModel version) {

		this._creator = creator;
		this.timezone = timezone;
		this.state = state;
		this.id = id;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.privacy = privacy;
		this.start_time = start_time;
		this.type = type;
		this.social_links = social_links;
		this.end_time = end_time;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.name = name;
		this.description = description;
		this.logo = logo;
		this.email = email;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._version = version;

	}

}