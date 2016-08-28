import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String privacy;
	public CopyrightModel _copyright;
	public String background_image;
	public String type;
	public String email;
	public int id;
	public String end_time;
	public String organizer_name;
	public String topic;
	public String start_time;
	public String organizer_description;
	public String logo;
	public String schedule_published_on;
	public VersionModel _version;
	public String name;
	public String location_name;
	public String state;
	public String code_of_conduct;

	public RootModel(CreatorModel creator, ArrayList<Social_linksModel> social_links, String description, Call_for_papersModel call_for_papers, String timezone, String privacy, CopyrightModel copyright, String background_image, String type, String email, int id, String end_time, String organizer_name, String topic, String start_time, String organizer_description, String logo, String schedule_published_on, VersionModel version, String name, String location_name, String state, String code_of_conduct) {

		this._creator = creator;
		this.social_links = social_links;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.privacy = privacy;
		this._copyright = copyright;
		this.background_image = background_image;
		this.type = type;
		this.email = email;
		this.id = id;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.name = name;
		this.location_name = location_name;
		this.state = state;
		this.code_of_conduct = code_of_conduct;

	}

}