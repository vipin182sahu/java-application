import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String description;
	public String timezone;
	public String privacy;
	public String state;
	public String background_image;
	public String email;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String organizer_description;
	public String location_name;
	public int id;
	public String type;
	public VersionModel _version;
	public String end_time;
	public String schedule_published_on;
	public String name;
	public String logo;
	public CopyrightModel _copyright;
	public String topic;

	public RootModel(CreatorModel creator, Call_for_papersModel call_for_papers, String start_time, String description, String timezone, String privacy, String state, String background_image, String email, String code_of_conduct, ArrayList<Social_linksModel> social_links, String organizer_name, String organizer_description, String location_name, int id, String type, VersionModel version, String end_time, String schedule_published_on, String name, String logo, CopyrightModel copyright, String topic) {

		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.description = description;
		this.timezone = timezone;
		this.privacy = privacy;
		this.state = state;
		this.background_image = background_image;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.id = id;
		this.type = type;
		this._version = version;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.logo = logo;
		this._copyright = copyright;
		this.topic = topic;

	}

}